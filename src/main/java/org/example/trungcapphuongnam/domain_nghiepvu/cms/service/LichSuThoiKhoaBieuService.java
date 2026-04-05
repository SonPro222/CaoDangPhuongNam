package org.example.trungcapphuongnam.domain_nghiepvu.cms.service;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.LichSuThoiKhoaBieuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.LichSuThoiKhoaBieuFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LichSuThoiKhoaBieuService {
    Page<LichSuThoiKhoaBieuDTO> findAll(LichSuThoiKhoaBieuFilter filter, Pageable pageable);
    LichSuThoiKhoaBieuDTO findById(Integer id);
    LichSuThoiKhoaBieuDTO create(LichSuThoiKhoaBieuDTO dto);
    LichSuThoiKhoaBieuDTO update(Integer id, LichSuThoiKhoaBieuDTO dto);
    void delete(Integer id);
}