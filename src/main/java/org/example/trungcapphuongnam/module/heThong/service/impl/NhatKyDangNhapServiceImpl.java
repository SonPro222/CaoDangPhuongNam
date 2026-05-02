package org.example.trungcapphuongnam.module.heThong.service.impl;

import org.example.trungcapphuongnam.module.heThong.dto.request.NhatKyDangNhapRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhatKyDangNhapResponse;
import org.example.trungcapphuongnam.module.heThong.entity.NhatKyDangNhap;
import org.example.trungcapphuongnam.module.heThong.exception.HeThongNotFoundException;
import org.example.trungcapphuongnam.module.heThong.mapper.NhatKyDangNhapMapper;
import org.example.trungcapphuongnam.module.heThong.repository.NhatKyDangNhapRepository;
import org.example.trungcapphuongnam.module.heThong.service.NhatKyDangNhapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NhatKyDangNhapServiceImpl implements NhatKyDangNhapService {

    private final NhatKyDangNhapRepository nhatKyDangNhapRepository;
    private final NhatKyDangNhapMapper nhatKyDangNhapMapper;

    @Override
    @Transactional(readOnly = true)
    public List<NhatKyDangNhapResponse> getAll() {
        return nhatKyDangNhapRepository.findAll()
                .stream()
                .map(nhatKyDangNhapMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public NhatKyDangNhapResponse getById(Long id) {
        return nhatKyDangNhapMapper.toResponse(findByIdOrThrow(id));
    }

    @Override
    public NhatKyDangNhapResponse create(NhatKyDangNhapRequest request) {
        NhatKyDangNhap entity = nhatKyDangNhapMapper.toEntity(request);
        return nhatKyDangNhapMapper.toResponse(nhatKyDangNhapRepository.save(entity));
    }

    @Override
    public NhatKyDangNhapResponse update(Long id, NhatKyDangNhapRequest request) {
        NhatKyDangNhap entity = findByIdOrThrow(id);
        nhatKyDangNhapMapper.updateEntity(entity, request);
        return nhatKyDangNhapMapper.toResponse(nhatKyDangNhapRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        NhatKyDangNhap entity = findByIdOrThrow(id);
        nhatKyDangNhapRepository.delete(entity);
    }

    private NhatKyDangNhap findByIdOrThrow(Long id) {
        return nhatKyDangNhapRepository.findById(id)
                .orElseThrow(() -> new HeThongNotFoundException("Không tìm thấy NhatKyDangNhap với id = " + id));
    }
}
