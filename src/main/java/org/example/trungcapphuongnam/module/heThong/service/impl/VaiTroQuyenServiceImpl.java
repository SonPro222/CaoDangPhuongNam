package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroQuyenRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroQuyenResponse;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTroQuyen;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.VaiTroQuyenMapper;
import org.example.trungcapphuongnam.module.heThong.repository.VaiTroQuyenRepository;
import org.example.trungcapphuongnam.module.heThong.service.VaiTroQuyenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class VaiTroQuyenServiceImpl implements VaiTroQuyenService {

    private final VaiTroQuyenRepository vaiTroQuyenRepository;
    private final VaiTroQuyenMapper vaiTroQuyenMapper;

    @Override
    @Transactional(readOnly = true)
    public List<VaiTroQuyenResponse> getAll() {
        return vaiTroQuyenRepository.findAll()
                .stream()
                .map(vaiTroQuyenMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public VaiTroQuyenResponse getById(Long id) {
        return vaiTroQuyenMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public VaiTroQuyenResponse create(VaiTroQuyenRequest request) {
        VaiTroQuyen entity = vaiTroQuyenMapper.toEntity(request);
        return vaiTroQuyenMapper.toResponse(vaiTroQuyenRepository.save(entity));
    }

    @Override
    public VaiTroQuyenResponse update(Long id, VaiTroQuyenRequest request) {
        VaiTroQuyen entity = findByIdOrThrow(id);
        vaiTroQuyenMapper.updateEntity(entity, request);
        return vaiTroQuyenMapper.toResponse(vaiTroQuyenRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        VaiTroQuyen entity = findByIdOrThrow(id);
        vaiTroQuyenRepository.delete(entity);
    }

    private VaiTroQuyen findByIdOrThrow(Long id) {
        return vaiTroQuyenRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy VaiTroQuyen với id = " + id));
    }
}
