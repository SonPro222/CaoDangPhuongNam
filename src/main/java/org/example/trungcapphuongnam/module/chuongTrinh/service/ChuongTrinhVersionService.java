package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.ChuongTrinhVersionRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.ChuongTrinhVersionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChuongTrinhVersionService {
    Page<ChuongTrinhVersionResponse> findAll(Pageable pageable);
    ChuongTrinhVersionResponse findById(Long id);
    ChuongTrinhVersionResponse create(ChuongTrinhVersionRequest request);
    ChuongTrinhVersionResponse update(Long id, ChuongTrinhVersionRequest request);
    void delete(Long id);
}
