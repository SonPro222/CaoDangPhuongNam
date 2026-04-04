package org.example.caodangphuongnam.domain_nghiepvu.cms.service;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.HocLieuDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.HocLieuFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HocLieuService {
    Page<HocLieuDTO> findAll(HocLieuFilter filter, Pageable pageable);
    HocLieuDTO findById(Integer id);
    HocLieuDTO create(HocLieuDTO dto);
    HocLieuDTO update(Integer id, HocLieuDTO dto);
    void delete(Integer id);
}