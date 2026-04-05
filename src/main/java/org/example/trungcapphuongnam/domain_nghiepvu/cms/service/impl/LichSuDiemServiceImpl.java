package org.example.trungcapphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.LichSuDiemDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.LichSuDiem;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.LichSuDiemFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.mapper.LichSuDiemMapper;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.repository.LichSuDiemRepository;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.LichSuDiemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LichSuDiemServiceImpl implements LichSuDiemService {

    private final LichSuDiemRepository repository;
    private final LichSuDiemMapper mapper;

    @Override
    public Page<LichSuDiemDTO> findAll(LichSuDiemFilter filter, Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public LichSuDiemDTO findById(Integer id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Lịch Sử Điểm với ID: " + id));
    }

    @Override
    @Transactional
    public LichSuDiemDTO create(LichSuDiemDTO dto) {
        LichSuDiem entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public LichSuDiemDTO update(Integer id, LichSuDiemDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Lịch Sử Điểm với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}