package org.example.trungcapphuongnam.module.heThong.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanVaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanVaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoan;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoanVaiTro;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTro;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.TaiKhoanVaiTroMapper;
import org.example.trungcapphuongnam.module.heThong.repository.TaiKhoanRepository;
import org.example.trungcapphuongnam.module.heThong.repository.TaiKhoanVaiTroRepository;
import org.example.trungcapphuongnam.module.heThong.repository.VaiTroRepository;
import org.example.trungcapphuongnam.module.heThong.service.TaiKhoanVaiTroService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TaiKhoanVaiTroServiceImpl implements TaiKhoanVaiTroService {

    private final TaiKhoanVaiTroRepository taiKhoanVaiTroRepository;
    private final TaiKhoanRepository taiKhoanRepository;
    private final VaiTroRepository vaiTroRepository;
    private final TaiKhoanVaiTroMapper taiKhoanVaiTroMapper;

    @Override
    @Transactional(readOnly = true)
    public List<TaiKhoanVaiTroResponse> getAll() {
        return taiKhoanVaiTroRepository.findAll().stream().map(taiKhoanVaiTroMapper::toResponse).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TaiKhoanVaiTroResponse getById(Long id) {
        return taiKhoanVaiTroMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public TaiKhoanVaiTroResponse create(TaiKhoanVaiTroRequest request) {
        TaiKhoanVaiTro entity = taiKhoanVaiTroMapper.toEntity(request);
        ganQuanHe(entity, request);
        return taiKhoanVaiTroMapper.toResponse(taiKhoanVaiTroRepository.save(entity));
    }

    @Override
    public TaiKhoanVaiTroResponse update(Long id, TaiKhoanVaiTroRequest request) {
        TaiKhoanVaiTro entity = findByIdOrThrow(id);
        taiKhoanVaiTroMapper.updateEntity(entity, request);
        ganQuanHe(entity, request);
        return taiKhoanVaiTroMapper.toResponse(taiKhoanVaiTroRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        taiKhoanVaiTroRepository.delete(findByIdOrThrow(id));
    }

    private TaiKhoanVaiTro findByIdOrThrow(Long id) {
        return taiKhoanVaiTroRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy tài khoản vai trò với id = " + id));
    }

    private void ganQuanHe(TaiKhoanVaiTro entity, TaiKhoanVaiTroRequest request) {
        if (request == null) {
            throw new RuntimeException("Dữ liệu tài khoản vai trò không hợp lệ");
        }
        TaiKhoan taiKhoan = taiKhoanRepository.findById(request.getTaiKhoanId())
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy tài khoản với id = " + request.getTaiKhoanId()));
        VaiTro vaiTro = vaiTroRepository.findById(request.getVaiTroId())
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy vai trò với id = " + request.getVaiTroId()));
        entity.setTaiKhoan(taiKhoan);
        entity.setVaiTro(vaiTro);
    }
}
