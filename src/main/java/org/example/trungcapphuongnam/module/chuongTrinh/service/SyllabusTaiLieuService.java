package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.SyllabusTaiLieuRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.SyllabusTaiLieuResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SyllabusTaiLieuService {
    Page<SyllabusTaiLieuResponse> findAll(Pageable pageable);
    SyllabusTaiLieuResponse findById(Long id);
    SyllabusTaiLieuResponse create(SyllabusTaiLieuRequest request);
    SyllabusTaiLieuResponse update(Long id, SyllabusTaiLieuRequest request);
    void delete(Long id);
}
