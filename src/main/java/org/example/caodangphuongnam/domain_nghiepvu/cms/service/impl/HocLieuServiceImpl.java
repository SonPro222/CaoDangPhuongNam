package org.example.caodangphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.HocLieuDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.HocLieu;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.HocLieuFilter;
import org.example.caodangphuongnam.domain_nghiepvu.cms.mapper.HocLieuMapper;
import org.example.caodangphuongnam.domain_nghiepvu.cms.repository.HocLieuRepository;
import org.example.caodangphuongnam.domain_nghiepvu.cms.service.HocLieuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HocLieuServiceImpl implements HocLieuService {

    private final HocLieuRepository repository;
    private final HocLieuMapper mapper;

    @Override
    public Page<HocLieuDTO> findAll(HocLieuFilter filter, Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public HocLieuDTO findById(Integer id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Học Liệu với ID: " + id));
    }

    @Override
    @Transactional
    public HocLieuDTO create(HocLieuDTO dto) {
        HocLieu entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public HocLieuDTO update(Integer id, HocLieuDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Học Liệu với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}