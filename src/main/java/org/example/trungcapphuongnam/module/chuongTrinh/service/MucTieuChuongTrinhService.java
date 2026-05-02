package org.example.trungcapphuongnam.module.chuongTrinh.service;

import org.example.trungcapphuongnam.module.chuongTrinh.dto.MucTieuChuongTrinhRequest;
import org.example.trungcapphuongnam.module.chuongTrinh.dto.MucTieuChuongTrinhResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MucTieuChuongTrinhService {
    Page<MucTieuChuongTrinhResponse> findAll(Pageable pageable);
    MucTieuChuongTrinhResponse findById(Long id);
    MucTieuChuongTrinhResponse create(MucTieuChuongTrinhRequest request);
    MucTieuChuongTrinhResponse update(Long id, MucTieuChuongTrinhRequest request);
    void delete(Long id);
}
