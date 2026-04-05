package org.example.trungcapphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.LichSuThoiKhoaBieuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.LichSuThoiKhoaBieu;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.LichSuThoiKhoaBieuFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.mapper.LichSuThoiKhoaBieuMapper;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.repository.LichSuThoiKhoaBieuRepository;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.LichSuThoiKhoaBieuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LichSuThoiKhoaBieuServiceImpl implements LichSuThoiKhoaBieuService {

    private final LichSuThoiKhoaBieuRepository repository;
    private final LichSuThoiKhoaBieuMapper mapper;

    @Override
    public Page<LichSuThoiKhoaBieuDTO> findAll(LichSuThoiKhoaBieuFilter filter, Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public LichSuThoiKhoaBieuDTO findById(Integer id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Lịch Sử TKB với ID: " + id));
    }

    @Override
    @Transactional
    public LichSuThoiKhoaBieuDTO create(LichSuThoiKhoaBieuDTO dto) {
        LichSuThoiKhoaBieu entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public LichSuThoiKhoaBieuDTO update(Integer id, LichSuThoiKhoaBieuDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Lịch Sử TKB với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}