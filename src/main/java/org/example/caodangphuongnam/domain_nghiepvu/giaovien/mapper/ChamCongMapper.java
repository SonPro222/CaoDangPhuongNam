package org.example.caodangphuongnam.domain_nghiepvu.giaovien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.giaovien.dto.ChamCongDTO;
import org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity.ChamCong;
import org.springframework.stereotype.Component;

@Component
public class ChamCongMapper {
    public ChamCongDTO toDto(ChamCong entity) {
        if (entity == null) return null;
        ChamCongDTO dto = new ChamCongDTO();
        dto.setId(entity.getId());
        dto.setNhanSuId(entity.getNhanSu() != null ? entity.getNhanSu().getId() : null);
        dto.setNgay(entity.getNgay());
        dto.setGioVao(entity.getGioVao());
        dto.setGioRa(entity.getGioRa());
        dto.setSoGio(entity.getSoGio());
        dto.setTrangThai(entity.getTrangThai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public ChamCong toEntity(ChamCongDTO dto) {
        if (dto == null) return null;
        ChamCong entity = new ChamCong();
        entity.setId(dto.getId());
        if (dto.getNhanSuId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NhanSu ns = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NhanSu();
            ns.setId(dto.getNhanSuId());
            entity.setNhanSu(ns);
        }
        entity.setNgay(dto.getNgay());
        entity.setGioVao(dto.getGioVao());
        entity.setGioRa(dto.getGioRa());
        entity.setSoGio(dto.getSoGio());
        entity.setTrangThai(dto.getTrangThai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}