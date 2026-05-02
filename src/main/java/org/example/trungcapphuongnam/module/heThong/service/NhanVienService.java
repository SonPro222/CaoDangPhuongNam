package org.example.trungcapphuongnam.module.heThong.service;

import org.example.trungcapphuongnam.module.heThong.dto.request.NhanVienRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhanVienResponse;
import java.util.List;

public interface NhanVienService {
    List<NhanVienResponse> getAll();
    NhanVienResponse getById(Long id);
    NhanVienResponse create(NhanVienRequest request);
    NhanVienResponse update(Long id, NhanVienRequest request);
    void delete(Long id);
}
