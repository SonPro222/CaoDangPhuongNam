package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.service;

import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.dto.ChiTietTkbDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChiTietTkbService {
    ChiTietTkbDTO create(ChiTietTkbDTO dto);
    ChiTietTkbDTO update(Integer id, ChiTietTkbDTO dto);
    ChiTietTkbDTO findById(Integer id);
    List<ChiTietTkbDTO> findAll();
    Page<ChiTietTkbDTO> findAllPaged(Pageable pageable);
    void delete(Integer id);
}