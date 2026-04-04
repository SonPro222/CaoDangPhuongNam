package org.example.caodangphuongnam.domain_nghiepvu.phongban.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.phongban.dto.NguoiDungDTO;
import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.*;
import org.springframework.stereotype.Component;

@Component
public class NguoiDungMapper {
    public NguoiDungDTO toDto(NguoiDung entity) {
        if (entity == null) return null;
        NguoiDungDTO dto = new NguoiDungDTO();
        dto.setId(entity.getId());
        dto.setTenDangNhap(entity.getTenDangNhap());
        dto.setMatKhau(entity.getMatKhau());
        dto.setVaiTro(entity.getVaiTro());
        dto.setPhongBanId(entity.getPhongBan() != null ? entity.getPhongBan().getId() : null);
        return dto;
    }

    public NguoiDung toEntity(NguoiDungDTO dto) {
        if (dto == null) return null;
        NguoiDung entity = new NguoiDung();
        entity.setId(dto.getId());
        entity.setTenDangNhap(dto.getTenDangNhap());
        entity.setMatKhau(dto.getMatKhau());
        entity.setVaiTro(dto.getVaiTro());
        if (dto.getPhongBanId() != null) {
            PhongBan pb = new PhongBan(); pb.setId(dto.getPhongBanId()); entity.setPhongBan(pb);
        }
        return entity;
    }
}