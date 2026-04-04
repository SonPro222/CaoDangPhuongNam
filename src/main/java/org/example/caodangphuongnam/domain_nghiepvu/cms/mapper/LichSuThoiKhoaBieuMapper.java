package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.LichSuThoiKhoaBieuDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.LichSuThoiKhoaBieu;
import org.springframework.stereotype.Component;

@Component
public class LichSuThoiKhoaBieuMapper {
    public LichSuThoiKhoaBieuDTO toDto(LichSuThoiKhoaBieu entity) {
        if (entity == null) return null;
        LichSuThoiKhoaBieuDTO dto = new LichSuThoiKhoaBieuDTO();
        dto.setId(entity.getId());
        dto.setLopMonId(entity.getLopMon() != null ? entity.getLopMon().getId() : null);
        dto.setNgayCu(entity.getNgayCu());
        dto.setGioBatDauCu(entity.getGioBatDauCu());
        dto.setGioKetThucCu(entity.getGioKetThucCu());
        dto.setNgayMoi(entity.getNgayMoi());
        dto.setGioBatDauMoi(entity.getGioBatDauMoi());
        dto.setGioKetThucMoi(entity.getGioKetThucMoi());
        dto.setPhongCu(entity.getPhongCu());
        dto.setPhongMoi(entity.getPhongMoi());
        dto.setNguoiSuaId(entity.getNguoiSua() != null ? entity.getNguoiSua().getId() : null);
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public LichSuThoiKhoaBieu toEntity(LichSuThoiKhoaBieuDTO dto) {
        if (dto == null) return null;
        LichSuThoiKhoaBieu entity = new LichSuThoiKhoaBieu();
        entity.setId(dto.getId());
        if (dto.getLopMonId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon lm = new org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon();
            lm.setId(dto.getLopMonId()); entity.setLopMon(lm);
        }
        entity.setNgayCu(dto.getNgayCu());
        entity.setGioBatDauCu(dto.getGioBatDauCu());
        entity.setGioKetThucCu(dto.getGioKetThucCu());
        entity.setNgayMoi(dto.getNgayMoi());
        entity.setGioBatDauMoi(dto.getGioBatDauMoi());
        entity.setGioKetThucMoi(dto.getGioKetThucMoi());
        entity.setPhongCu(dto.getPhongCu());
        entity.setPhongMoi(dto.getPhongMoi());
        if (dto.getNguoiSuaId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiSuaId()); entity.setNguoiSua(nd);
        }
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}