package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.SyllabusChuongBaiRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.SyllabusChuongBaiResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SyllabusChuongBaiService {
    Page<SyllabusChuongBaiResponse> findAll(Pageable pageable);
    SyllabusChuongBaiResponse findById(Long id);
    SyllabusChuongBaiResponse create(SyllabusChuongBaiRequest request);
    SyllabusChuongBaiResponse update(Long id, SyllabusChuongBaiRequest request);
    void delete(Long id);
}
