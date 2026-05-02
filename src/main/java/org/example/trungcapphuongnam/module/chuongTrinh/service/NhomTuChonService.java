package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.NhomTuChonRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.NhomTuChonResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NhomTuChonService {
    Page<NhomTuChonResponse> findAll(Pageable pageable);
    NhomTuChonResponse findById(Long id);
    NhomTuChonResponse create(NhomTuChonRequest request);
    NhomTuChonResponse update(Long id, NhomTuChonRequest request);
    void delete(Long id);
}
