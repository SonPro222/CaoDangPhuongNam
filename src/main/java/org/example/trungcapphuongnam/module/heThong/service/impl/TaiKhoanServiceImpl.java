package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanResponse;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoan;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.TaiKhoanMapper;
import org.example.trungcapphuongnam.module.heThong.repository.TaiKhoanRepository;
import org.example.trungcapphuongnam.module.heThong.service.TaiKhoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TaiKhoanServiceImpl implements TaiKhoanService {

    private final TaiKhoanRepository taiKhoanRepository;
    private final TaiKhoanMapper taiKhoanMapper;

    @Override
    @Transactional(readOnly = true)
    public List<TaiKhoanResponse> getAll() {
        return taiKhoanRepository.findAll()
                .stream()
                .map(taiKhoanMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TaiKhoanResponse getById(Long id) {
        return taiKhoanMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public TaiKhoanResponse create(TaiKhoanRequest request) {
        TaiKhoan entity = taiKhoanMapper.toEntity(request);
        return taiKhoanMapper.toResponse(taiKhoanRepository.save(entity));
    }

    @Override
    public TaiKhoanResponse update(Long id, TaiKhoanRequest request) {
        TaiKhoan entity = findByIdOrThrow(id);
        taiKhoanMapper.updateEntity(entity, request);
        return taiKhoanMapper.toResponse(taiKhoanRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        TaiKhoan entity = findByIdOrThrow(id);
        taiKhoanRepository.delete(entity);
    }

    private TaiKhoan findByIdOrThrow(Long id) {
        return taiKhoanRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy TaiKhoan với id = " + id));
    }
}
