package org.example.trungcapphuongnam.domain_nghiepvu.cms.service;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.NoiDungBaiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.NoiDungBaiFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoiDungBaiService {
    Page<NoiDungBaiDTO> findAll(NoiDungBaiFilter filter, Pageable pageable);
    NoiDungBaiDTO findById(Integer id);
    NoiDungBaiDTO create(NoiDungBaiDTO dto);
    NoiDungBaiDTO update(Integer id, NoiDungBaiDTO dto);
    void delete(Integer id);
}