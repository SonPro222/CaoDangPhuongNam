package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanVaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanVaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoanVaiTro;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.TaiKhoanVaiTroMapper;
import org.example.trungcapphuongnam.module.heThong.repository.TaiKhoanVaiTroRepository;
import org.example.trungcapphuongnam.module.heThong.service.TaiKhoanVaiTroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TaiKhoanVaiTroServiceImpl implements TaiKhoanVaiTroService {

    private final TaiKhoanVaiTroRepository taiKhoanVaiTroRepository;
    private final TaiKhoanVaiTroMapper taiKhoanVaiTroMapper;

    @Override
    @Transactional(readOnly = true)
    public List<TaiKhoanVaiTroResponse> getAll() {
        return taiKhoanVaiTroRepository.findAll()
                .stream()
                .map(taiKhoanVaiTroMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TaiKhoanVaiTroResponse getById(Long id) {
        return taiKhoanVaiTroMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public TaiKhoanVaiTroResponse create(TaiKhoanVaiTroRequest request) {
        TaiKhoanVaiTro entity = taiKhoanVaiTroMapper.toEntity(request);
        return taiKhoanVaiTroMapper.toResponse(taiKhoanVaiTroRepository.save(entity));
    }

    @Override
    public TaiKhoanVaiTroResponse update(Long id, TaiKhoanVaiTroRequest request) {
        TaiKhoanVaiTro entity = findByIdOrThrow(id);
        taiKhoanVaiTroMapper.updateEntity(entity, request);
        return taiKhoanVaiTroMapper.toResponse(taiKhoanVaiTroRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        TaiKhoanVaiTro entity = findByIdOrThrow(id);
        taiKhoanVaiTroRepository.delete(entity);
    }

    private TaiKhoanVaiTro findByIdOrThrow(Long id) {
        return taiKhoanVaiTroRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy TaiKhoanVaiTro với id = " + id));
    }
}
