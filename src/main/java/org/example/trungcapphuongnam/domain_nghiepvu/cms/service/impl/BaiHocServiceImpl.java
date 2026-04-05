package org.example.trungcapphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.BaiHocDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.BaiHocFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.mapper.BaiHocMapper;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.repository.BaiHocRepository;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.BaiHocService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BaiHocServiceImpl implements BaiHocService {

    private final BaiHocRepository repository;
    private final BaiHocMapper mapper;

    @Override
    public Page<BaiHocDTO> findAll(BaiHocFilter filter, Pageable pageable) {
        Page<BaiHoc> page = repository.findAll(pageable);
        return page.map(mapper::toDto);
    }

    @Override
    public BaiHocDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Bài Học với ID: " + id));
    }

    @Override
    @Transactional
    public BaiHocDTO create(BaiHocDTO dto) {
        BaiHoc entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public BaiHocDTO update(Integer id, BaiHocDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Bài Học với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}