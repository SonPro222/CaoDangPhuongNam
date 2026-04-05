package org.example.trungcapphuongnam.domain_nghiepvu.phongban.service;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.dto.NguoiDungDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NguoiDungService {
    Page<NguoiDungDTO> findAll(Pageable pageable);
    NguoiDungDTO findById(Integer id);
    NguoiDungDTO create(NguoiDungDTO dto);
    NguoiDungDTO update(Integer id, NguoiDungDTO dto);
    void delete(Integer id);
}