package org.example.trungcapphuongnam.module.heThong.service;

import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroQuyenRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroQuyenResponse;
import java.util.List;

public interface VaiTroQuyenService {
    List<VaiTroQuyenResponse> getAll();
    VaiTroQuyenResponse getById(Long id);
    VaiTroQuyenResponse create(VaiTroQuyenRequest request);
    VaiTroQuyenResponse update(Long id, VaiTroQuyenRequest request);
    void delete(Long id);
}
