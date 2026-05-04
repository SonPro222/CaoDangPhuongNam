package org.example.trungcapphuongnam.module.heThong.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.module.heThong.dto.request.NhanVienRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhanVienResponse;
import org.example.trungcapphuongnam.module.heThong.entity.NhanVien;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoan;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.NhanVienMapper;
import org.example.trungcapphuongnam.module.heThong.repository.NhanVienRepository;
import org.example.trungcapphuongnam.module.heThong.repository.TaiKhoanRepository;
import org.example.trungcapphuongnam.module.heThong.service.NhanVienService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NhanVienServiceImpl implements NhanVienService {

    private final NhanVienRepository nhanVienRepository;
    private final TaiKhoanRepository taiKhoanRepository;
    private final NhanVienMapper nhanVienMapper;

    @Override
    @Transactional(readOnly = true)
    public List<NhanVienResponse> getAll() {
        return nhanVienRepository.findAll().stream().map(nhanVienMapper::toResponse).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public NhanVienResponse getById(Long id) {
        return nhanVienMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public NhanVienResponse create(NhanVienRequest request) {
        NhanVien entity = nhanVienMapper.toEntity(request);
        entity.setTaiKhoan(resolveTaiKhoan(request == null ? null : request.getTaiKhoanId()));
        return nhanVienMapper.toResponse(nhanVienRepository.save(entity));
    }

    @Override
    public NhanVienResponse update(Long id, NhanVienRequest request) {
        NhanVien entity = findByIdOrThrow(id);
        nhanVienMapper.updateEntity(entity, request);
        entity.setTaiKhoan(resolveTaiKhoan(request == null ? null : request.getTaiKhoanId()));
        return nhanVienMapper.toResponse(nhanVienRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        nhanVienRepository.delete(findByIdOrThrow(id));
    }

    private NhanVien findByIdOrThrow(Long id) {
        return nhanVienRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy nhân viên với id = " + id));
    }

    private TaiKhoan resolveTaiKhoan(Long taiKhoanId) {
        if (taiKhoanId == null) {
            return null;
        }
        return taiKhoanRepository.findById(taiKhoanId)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy tài khoản với id = " + taiKhoanId));
    }
}
