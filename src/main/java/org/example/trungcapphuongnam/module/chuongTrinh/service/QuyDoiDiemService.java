package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.QuyDoiDiemRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.QuyDoiDiemResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuyDoiDiemService {
    Page<QuyDoiDiemResponse> findAll(Pageable pageable);
    QuyDoiDiemResponse findById(Long id);
    QuyDoiDiemResponse create(QuyDoiDiemRequest request);
    QuyDoiDiemResponse update(Long id, QuyDoiDiemRequest request);
    void delete(Long id);
}
