package org.example.trungcapphuongnam.module.heThong.mapper;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanVaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanVaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoanVaiTro;
import org.springframework.stereotype.Component;

@Component
public class TaiKhoanVaiTroMapper {

    public TaiKhoanVaiTroResponse toResponse(TaiKhoanVaiTro entity) {
        if (entity == null) {
            return null;
        }
        return TaiKhoanVaiTroResponse.builder()
                .id(entity.getId())
                .taiKhoanId(entity.getTaiKhoanId())
                .vaiTroId(entity.getVaiTroId())
                .build();
    }

    public TaiKhoanVaiTro toEntity(TaiKhoanVaiTroRequest request) {
        if (request == null) {
            return null;
        }
        TaiKhoanVaiTro entity = new TaiKhoanVaiTro();
        entity.setTaiKhoanId(request.getTaiKhoanId());
        entity.setVaiTroId(request.getVaiTroId());
        return entity;
    }

    public void updateEntity(TaiKhoanVaiTro entity, TaiKhoanVaiTroRequest request) {
        if (entity == null || request == null) {
            return;
        }
        entity.setTaiKhoanId(request.getTaiKhoanId());
        entity.setVaiTroId(request.getVaiTroId());
    }
}
