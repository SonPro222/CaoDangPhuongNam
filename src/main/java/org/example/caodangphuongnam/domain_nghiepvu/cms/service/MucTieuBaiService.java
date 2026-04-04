package org.example.caodangphuongnam.domain_nghiepvu.cms.service;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.MucTieuBaiDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.MucTieuBaiFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MucTieuBaiService {
    Page<MucTieuBaiDTO> findAll(MucTieuBaiFilter filter, Pageable pageable);
    MucTieuBaiDTO findById(Integer id);
    MucTieuBaiDTO create(MucTieuBaiDTO dto);
    MucTieuBaiDTO update(Integer id, MucTieuBaiDTO dto);
    void delete(Integer id);
}