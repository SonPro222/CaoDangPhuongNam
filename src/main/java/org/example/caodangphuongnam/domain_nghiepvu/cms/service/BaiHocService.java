package org.example.caodangphuongnam.domain_nghiepvu.cms.service;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.BaiHocDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.BaiHocFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaiHocService {
    Page<BaiHocDTO> findAll(BaiHocFilter filter, Pageable pageable);
    BaiHocDTO findById(Integer id);
    BaiHocDTO create(BaiHocDTO dto);
    BaiHocDTO update(Integer id, BaiHocDTO dto);
    void delete(Integer id);
}