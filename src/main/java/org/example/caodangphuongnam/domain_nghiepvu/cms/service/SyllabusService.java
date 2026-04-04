package org.example.caodangphuongnam.domain_nghiepvu.cms.service;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.SyllabusDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.SyllabusFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SyllabusService {
    Page<SyllabusDTO> findAll(SyllabusFilter filter, Pageable pageable);
    SyllabusDTO findById(Integer id);
    SyllabusDTO create(SyllabusDTO dto);
    SyllabusDTO update(Integer id, SyllabusDTO dto);
    void delete(Integer id);
}