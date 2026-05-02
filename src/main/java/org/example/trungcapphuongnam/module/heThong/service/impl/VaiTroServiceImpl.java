package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTro;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.VaiTroMapper;
import org.example.trungcapphuongnam.module.heThong.repository.VaiTroRepository;
import org.example.trungcapphuongnam.module.heThong.service.VaiTroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class VaiTroServiceImpl implements VaiTroService {

    private final VaiTroRepository vaiTroRepository;
    private final VaiTroMapper vaiTroMapper;

    @Override
    @Transactional(readOnly = true)
    public List<VaiTroResponse> getAll() {
        return vaiTroRepository.findAll()
                .stream()
                .map(vaiTroMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public VaiTroResponse getById(Long id) {
        return vaiTroMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public VaiTroResponse create(VaiTroRequest request) {
        VaiTro entity = vaiTroMapper.toEntity(request);
        return vaiTroMapper.toResponse(vaiTroRepository.save(entity));
    }

    @Override
    public VaiTroResponse update(Long id, VaiTroRequest request) {
        VaiTro entity = findByIdOrThrow(id);
        vaiTroMapper.updateEntity(entity, request);
        return vaiTroMapper.toResponse(vaiTroRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        VaiTro entity = findByIdOrThrow(id);
        vaiTroRepository.delete(entity);
    }

    private VaiTro findByIdOrThrow(Long id) {
        return vaiTroRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy VaiTro với id = " + id));
    }
}
