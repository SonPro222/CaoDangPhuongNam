package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.QuyenRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.QuyenResponse;
import org.example.trungcapphuongnam.module.heThong.entity.Quyen;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.QuyenMapper;
import org.example.trungcapphuongnam.module.heThong.repository.QuyenRepository;
import org.example.trungcapphuongnam.module.heThong.service.QuyenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class QuyenServiceImpl implements QuyenService {

    private final QuyenRepository quyenRepository;
    private final QuyenMapper quyenMapper;

    @Override
    @Transactional(readOnly = true)
    public List<QuyenResponse> getAll() {
        return quyenRepository.findAll()
                .stream()
                .map(quyenMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public QuyenResponse getById(Long id) {
        return quyenMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public QuyenResponse create(QuyenRequest request) {
        Quyen entity = quyenMapper.toEntity(request);
        return quyenMapper.toResponse(quyenRepository.save(entity));
    }

    @Override
    public QuyenResponse update(Long id, QuyenRequest request) {
        Quyen entity = findByIdOrThrow(id);
        quyenMapper.updateEntity(entity, request);
        return quyenMapper.toResponse(quyenRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        Quyen entity = findByIdOrThrow(id);
        quyenRepository.delete(entity);
    }

    private Quyen findByIdOrThrow(Long id) {
        return quyenRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy Quyen với id = " + id));
    }
}
