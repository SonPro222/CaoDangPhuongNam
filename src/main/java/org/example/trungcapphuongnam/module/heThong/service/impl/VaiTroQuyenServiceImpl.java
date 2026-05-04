package org.example.trungcapphuongnam.module.heThong.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroQuyenRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroQuyenResponse;
import org.example.trungcapphuongnam.module.heThong.entity.Quyen;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTro;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTroQuyen;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.VaiTroQuyenMapper;
import org.example.trungcapphuongnam.module.heThong.repository.QuyenRepository;
import org.example.trungcapphuongnam.module.heThong.repository.VaiTroQuyenRepository;
import org.example.trungcapphuongnam.module.heThong.repository.VaiTroRepository;
import org.example.trungcapphuongnam.module.heThong.service.VaiTroQuyenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class VaiTroQuyenServiceImpl implements VaiTroQuyenService {

    private final VaiTroQuyenRepository vaiTroQuyenRepository;
    private final VaiTroRepository vaiTroRepository;
    private final QuyenRepository quyenRepository;
    private final VaiTroQuyenMapper vaiTroQuyenMapper;

    @Override
    @Transactional(readOnly = true)
    public List<VaiTroQuyenResponse> getAll() {
        return vaiTroQuyenRepository.findAll().stream().map(vaiTroQuyenMapper::toResponse).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public VaiTroQuyenResponse getById(Long id) {
        return vaiTroQuyenMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public VaiTroQuyenResponse create(VaiTroQuyenRequest request) {
        VaiTroQuyen entity = vaiTroQuyenMapper.toEntity(request);
        ganQuanHe(entity, request);
        return vaiTroQuyenMapper.toResponse(vaiTroQuyenRepository.save(entity));
    }

    @Override
    public VaiTroQuyenResponse update(Long id, VaiTroQuyenRequest request) {
        VaiTroQuyen entity = findByIdOrThrow(id);
        vaiTroQuyenMapper.updateEntity(entity, request);
        ganQuanHe(entity, request);
        return vaiTroQuyenMapper.toResponse(vaiTroQuyenRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        vaiTroQuyenRepository.delete(findByIdOrThrow(id));
    }

    private VaiTroQuyen findByIdOrThrow(Long id) {
        return vaiTroQuyenRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy vai trò quyền với id = " + id));
    }

    private void ganQuanHe(VaiTroQuyen entity, VaiTroQuyenRequest request) {
        if (request == null) {
            throw new RuntimeException("Dữ liệu vai trò quyền không hợp lệ");
        }
        VaiTro vaiTro = vaiTroRepository.findById(request.getVaiTroId())
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy vai trò với id = " + request.getVaiTroId()));
        Quyen quyen = quyenRepository.findById(request.getQuyenId())
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy quyền với id = " + request.getQuyenId()));
        entity.setVaiTro(vaiTro);
        entity.setQuyen(quyen);
    }
}
