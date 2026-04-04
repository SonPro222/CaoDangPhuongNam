package org.example.caodangphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.SyllabusDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.Syllabus;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.SyllabusFilter;
import org.example.caodangphuongnam.domain_nghiepvu.cms.mapper.SyllabusMapper;
import org.example.caodangphuongnam.domain_nghiepvu.cms.repository.SyllabusRepository;
import org.example.caodangphuongnam.domain_nghiepvu.cms.service.SyllabusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SyllabusServiceImpl implements SyllabusService {

    private final SyllabusRepository repository;
    private final SyllabusMapper mapper;

    @Override
    public Page<SyllabusDTO> findAll(SyllabusFilter filter, Pageable pageable) {
        // Tích hợp JPA Specification ở đây để xử lý filter (nếu cần)
        Page<Syllabus> page = repository.findAll(pageable);
        return page.map(mapper::toDto);
    }

    @Override
    public SyllabusDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Syllabus với ID: " + id));
    }

    @Override
    @Transactional
    public SyllabusDTO create(SyllabusDTO dto) {
        Syllabus entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public SyllabusDTO update(Integer id, SyllabusDTO dto) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Không tìm thấy Syllabus với ID: " + id);
        }
        dto.setId(id);
        Syllabus entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Không tìm thấy Syllabus với ID: " + id);
        }
        repository.deleteById(id);
    }
}