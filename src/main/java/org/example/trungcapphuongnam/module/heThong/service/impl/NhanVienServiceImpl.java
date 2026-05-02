package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.NhanVienRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhanVienResponse;
import org.example.trungcapphuongnam.module.heThong.entity.NhanVien;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.NhanVienMapper;
import org.example.trungcapphuongnam.module.heThong.repository.NhanVienRepository;
import org.example.trungcapphuongnam.module.heThong.service.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NhanVienServiceImpl implements NhanVienService {

    private final NhanVienRepository nhanVienRepository;
    private final NhanVienMapper nhanVienMapper;

    @Override
    @Transactional(readOnly = true)
    public List<NhanVienResponse> getAll() {
        return nhanVienRepository.findAll()
                .stream()
                .map(nhanVienMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public NhanVienResponse getById(Long id) {
        return nhanVienMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public NhanVienResponse create(NhanVienRequest request) {
        NhanVien entity = nhanVienMapper.toEntity(request);
        return nhanVienMapper.toResponse(nhanVienRepository.save(entity));
    }

    @Override
    public NhanVienResponse update(Long id, NhanVienRequest request) {
        NhanVien entity = findByIdOrThrow(id);
        nhanVienMapper.updateEntity(entity, request);
        return nhanVienMapper.toResponse(nhanVienRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        NhanVien entity = findByIdOrThrow(id);
        nhanVienRepository.delete(entity);
    }

    private NhanVien findByIdOrThrow(Long id) {
        return nhanVienRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy NhanVien với id = " + id));
    }
}
