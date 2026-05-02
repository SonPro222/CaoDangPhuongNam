package org.example.trungcapphuongnam.module.heThong.mapper;

import org.example.trungcapphuongnam.module.heThong.dto.request.NhanVienRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhanVienResponse;
import org.example.trungcapphuongnam.module.heThong.entity.NhanVien;
import org.springframework.stereotype.Component;

@Component
public class NhanVienMapper {

    public NhanVienResponse toResponse(NhanVien entity) {
        if (entity == null) {
            return null;
        }
        return NhanVienResponse.builder()
                .id(entity.getId())
                .taiKhoanId(entity.getTaiKhoanId())
                .maNhanVien(entity.getMaNhanVien())
                .hoTen(entity.getHoTen())
                .email(entity.getEmail())
                .soDienThoai(entity.getSoDienThoai())
                .phongBan(entity.getPhongBan())
                .chucVu(entity.getChucVu())
                .trangThai(entity.getTrangThai())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public NhanVien toEntity(NhanVienRequest request) {
        if (request == null) {
            return null;
        }
        NhanVien entity = new NhanVien();
        entity.setTaiKhoanId(request.getTaiKhoanId());
        entity.setMaNhanVien(request.getMaNhanVien());
        entity.setHoTen(request.getHoTen());
        entity.setEmail(request.getEmail());
        entity.setSoDienThoai(request.getSoDienThoai());
        entity.setPhongBan(request.getPhongBan());
        entity.setChucVu(request.getChucVu());
        entity.setTrangThai(request.getTrangThai());
        return entity;
    }

    public void updateEntity(NhanVien entity, NhanVienRequest request) {
        if (entity == null || request == null) {
            return;
        }
        entity.setTaiKhoanId(request.getTaiKhoanId());
        entity.setMaNhanVien(request.getMaNhanVien());
        entity.setHoTen(request.getHoTen());
        entity.setEmail(request.getEmail());
        entity.setSoDienThoai(request.getSoDienThoai());
        entity.setPhongBan(request.getPhongBan());
        entity.setChucVu(request.getChucVu());
        entity.setTrangThai(request.getTrangThai());
    }
}
