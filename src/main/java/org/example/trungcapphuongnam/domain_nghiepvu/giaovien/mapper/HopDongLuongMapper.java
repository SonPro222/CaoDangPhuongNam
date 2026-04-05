package org.example.trungcapphuongnam.domain_nghiepvu.giaovien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.dto.HopDongLuongDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity.HopDongLuong;
import org.springframework.stereotype.Component;

@Component
public class HopDongLuongMapper {
    public HopDongLuongDTO toDto(HopDongLuong entity) {
        if (entity == null) return null;
        HopDongLuongDTO dto = new HopDongLuongDTO();
        dto.setId(entity.getId());
        dto.setNhanSuId(entity.getNhanSu() != null ? entity.getNhanSu().getId() : null);
        dto.setLuongCoBan(entity.getLuongCoBan());
        dto.setLuongTheoGio(entity.getLuongTheoGio());
        dto.setHinhThuc(entity.getHinhThuc());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public HopDongLuong toEntity(HopDongLuongDTO dto) {
        if (dto == null) return null;
        HopDongLuong entity = new HopDongLuong();
        entity.setId(dto.getId());
        if (dto.getNhanSuId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NhanSu ns = new org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NhanSu();
            ns.setId(dto.getNhanSuId());
            entity.setNhanSu(ns);
        }
        entity.setLuongCoBan(dto.getLuongCoBan());
        entity.setLuongTheoGio(dto.getLuongTheoGio());
        entity.setHinhThuc(dto.getHinhThuc());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}