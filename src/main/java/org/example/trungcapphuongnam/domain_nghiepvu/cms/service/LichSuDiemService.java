package org.example.trungcapphuongnam.domain_nghiepvu.cms.service;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.LichSuDiemDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.LichSuDiemFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LichSuDiemService {
    Page<LichSuDiemDTO> findAll(LichSuDiemFilter filter, Pageable pageable);
    LichSuDiemDTO findById(Integer id);
    LichSuDiemDTO create(LichSuDiemDTO dto);
    LichSuDiemDTO update(Integer id, LichSuDiemDTO dto);
    void delete(Integer id);
}