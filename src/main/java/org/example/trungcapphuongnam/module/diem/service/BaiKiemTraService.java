package org.example.trungcapphuongnam.module.diem.service;

import org.example.trungcapphuongnam.module.diem.dto.BaiKiemTraRequest;
import org.example.trungcapphuongnam.module.diem.dto.BaiKiemTraResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaiKiemTraService {
    Page<BaiKiemTraResponse> findAll(Pageable pageable);
    BaiKiemTraResponse findById(Long id);
    BaiKiemTraResponse create(BaiKiemTraRequest request);
    BaiKiemTraResponse update(Long id, BaiKiemTraRequest request);
    void delete(Long id);
}
