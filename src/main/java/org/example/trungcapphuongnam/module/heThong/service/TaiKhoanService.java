package org.example.trungcapphuongnam.module.heThong.service;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanResponse;
import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoanResponse> getAll();
    TaiKhoanResponse getById(Long id);
    TaiKhoanResponse create(TaiKhoanRequest request);
    TaiKhoanResponse update(Long id, TaiKhoanRequest request);
    void delete(Long id);
}
