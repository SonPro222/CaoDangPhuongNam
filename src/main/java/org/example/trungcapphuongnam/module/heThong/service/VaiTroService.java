package org.example.trungcapphuongnam.module.heThong.service;

import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroResponse;
import java.util.List;

public interface VaiTroService {
    List<VaiTroResponse> getAll();
    VaiTroResponse getById(Long id);
    VaiTroResponse create(VaiTroRequest request);
    VaiTroResponse update(Long id, VaiTroRequest request);
    void delete(Long id);
}
