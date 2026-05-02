package org.example.trungcapphuongnam.module.heThong.service;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanVaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanVaiTroResponse;
import java.util.List;

public interface TaiKhoanVaiTroService {
    List<TaiKhoanVaiTroResponse> getAll();
    TaiKhoanVaiTroResponse getById(Long id);
    TaiKhoanVaiTroResponse create(TaiKhoanVaiTroRequest request);
    TaiKhoanVaiTroResponse update(Long id, TaiKhoanVaiTroRequest request);
    void delete(Long id);
}
