package org.example.trungcapphuongnam.domain_nghiepvu.phongban.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.dto.NhanSuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.*;
import org.springframework.stereotype.Component;

@Component
public class NhanSuMapper {
    public NhanSuDTO toDto(NhanSu entity) {
        if (entity == null) return null;
        NhanSuDTO dto = new NhanSuDTO();
        dto.setId(entity.getId());
        dto.setTen(entity.getTen());
        dto.setLoai(entity.getLoai());
        dto.setNguoiDungId(entity.getNguoiDung() != null ? entity.getNguoiDung().getId() : null);
        dto.setPhongBanId(entity.getPhongBan() != null ? entity.getPhongBan().getId() : null);
        dto.setTrangThai(entity.getTrangThai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public NhanSu toEntity(NhanSuDTO dto) {
        if (dto == null) return null;
        NhanSu entity = new NhanSu();
        entity.setId(dto.getId());
        entity.setTen(dto.getTen());
        entity.setLoai(dto.getLoai());
        if (dto.getNguoiDungId() != null) {
            NguoiDung nd = new NguoiDung(); nd.setId(dto.getNguoiDungId()); entity.setNguoiDung(nd);
        }
        if (dto.getPhongBanId() != null) {
            PhongBan pb = new PhongBan(); pb.setId(dto.getPhongBanId()); entity.setPhongBan(pb);
        }
        entity.setTrangThai(dto.getTrangThai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}