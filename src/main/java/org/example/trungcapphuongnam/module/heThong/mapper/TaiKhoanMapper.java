package org.example.trungcapphuongnam.module.heThong.mapper;

import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanResponse;
import org.example.trungcapphuongnam.module.heThong.entity.TaiKhoan;
import org.springframework.stereotype.Component;

@Component
public class TaiKhoanMapper {

    public TaiKhoanResponse toResponse(TaiKhoan entity) {
        if (entity == null) {
            return null;
        }
        return TaiKhoanResponse.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .matKhauHash(entity.getMatKhauHash())
                .loaiTaiKhoan(entity.getLoaiTaiKhoan())
                .trangThai(entity.getTrangThai())
                .lanDangNhapCuoi(entity.getLanDangNhapCuoi())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public TaiKhoan toEntity(TaiKhoanRequest request) {
        if (request == null) {
            return null;
        }
        TaiKhoan entity = new TaiKhoan();
        entity.setEmail(request.getEmail());
        entity.setMatKhauHash(request.getMatKhauHash());
        entity.setLoaiTaiKhoan(request.getLoaiTaiKhoan());
        entity.setTrangThai(request.getTrangThai());
        entity.setLanDangNhapCuoi(request.getLanDangNhapCuoi());
        return entity;
    }

    public void updateEntity(TaiKhoan entity, TaiKhoanRequest request) {
        if (entity == null || request == null) {
            return;
        }
        entity.setEmail(request.getEmail());
        entity.setMatKhauHash(request.getMatKhauHash());
        entity.setLoaiTaiKhoan(request.getLoaiTaiKhoan());
        entity.setTrangThai(request.getTrangThai());
        entity.setLanDangNhapCuoi(request.getLanDangNhapCuoi());
    }
}
