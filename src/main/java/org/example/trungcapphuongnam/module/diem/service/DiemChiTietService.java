package org.example.trungcapphuongnam.module.diem.service;

import org.example.trungcapphuongnam.module.diem.dto.DiemChiTietRequest;
import org.example.trungcapphuongnam.module.diem.dto.DiemChiTietResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DiemChiTietService {
    Page<DiemChiTietResponse> findAll(Pageable pageable);
    DiemChiTietResponse findById(Long id);
    DiemChiTietResponse create(DiemChiTietRequest request);
    DiemChiTietResponse update(Long id, DiemChiTietRequest request);
    void delete(Long id);
}
