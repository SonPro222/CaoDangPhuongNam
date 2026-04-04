package org.example.caodangphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.NoiDungBaiDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.NoiDungBai;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.NoiDungBaiFilter;
import org.example.caodangphuongnam.domain_nghiepvu.cms.mapper.NoiDungBaiMapper;
import org.example.caodangphuongnam.domain_nghiepvu.cms.repository.NoiDungBaiRepository;
import org.example.caodangphuongnam.domain_nghiepvu.cms.service.NoiDungBaiService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NoiDungBaiServiceImpl implements NoiDungBaiService {

    private final NoiDungBaiRepository repository;
    private final NoiDungBaiMapper mapper;

    @Override
    public Page<NoiDungBaiDTO> findAll(NoiDungBaiFilter filter, Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public NoiDungBaiDTO findById(Integer id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Nội Dung Bài với ID: " + id));
    }

    @Override
    @Transactional
    public NoiDungBaiDTO create(NoiDungBaiDTO dto) {
        NoiDungBai entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public NoiDungBaiDTO update(Integer id, NoiDungBaiDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Nội Dung Bài với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}