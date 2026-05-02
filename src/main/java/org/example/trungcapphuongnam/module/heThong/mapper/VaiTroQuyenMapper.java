package org.example.trungcapphuongnam.module.heThong.mapper;

import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroQuyenRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroQuyenResponse;
import org.example.trungcapphuongnam.module.heThong.entity.VaiTroQuyen;
import org.springframework.stereotype.Component;

@Component
public class VaiTroQuyenMapper {

    public VaiTroQuyenResponse toResponse(VaiTroQuyen entity) {
        if (entity == null) {
            return null;
        }
        return VaiTroQuyenResponse.builder()
                .id(entity.getId())
                .vaiTroId(entity.getVaiTroId())
                .quyenId(entity.getQuyenId())
                .build();
    }

    public VaiTroQuyen toEntity(VaiTroQuyenRequest request) {
        if (request == null) {
            return null;
        }
        VaiTroQuyen entity = new VaiTroQuyen();
        entity.setVaiTroId(request.getVaiTroId());
        entity.setQuyenId(request.getQuyenId());
        return entity;
    }

    public void updateEntity(VaiTroQuyen entity, VaiTroQuyenRequest request) {
        if (entity == null || request == null) {
            return;
        }
        entity.setVaiTroId(request.getVaiTroId());
        entity.setQuyenId(request.getQuyenId());
    }
}
