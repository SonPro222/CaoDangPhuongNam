package org.example.caodangphuongnam.domain_nghiepvu.log.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.log.dto.HeThongLogDTO;
import org.example.caodangphuongnam.domain_nghiepvu.log.entity.HeThongLog;
import org.springframework.stereotype.Component;

@Component
public class HeThongLogMapper {
    public HeThongLogDTO toDto(HeThongLog entity) {
        if (entity == null) return null;
        HeThongLogDTO dto = new HeThongLogDTO();
        dto.setId(entity.getId());
        dto.setNguoiDungId(entity.getNguoiDung() != null ? entity.getNguoiDung().getId() : null);
        dto.setHanhDong(entity.getHanhDong());
        dto.setBang(entity.getBang());
        dto.setRecordId(entity.getRecordId());
        dto.setDuLieuCu(entity.getDuLieuCu());
        dto.setDuLieuMoi(entity.getDuLieuMoi());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public HeThongLog toEntity(HeThongLogDTO dto) {
        if (dto == null) return null;
        HeThongLog entity = new HeThongLog();
        entity.setId(dto.getId());
        if (dto.getNguoiDungId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDungId()); entity.setNguoiDung(nd);
        }
        entity.setHanhDong(dto.getHanhDong());
        entity.setBang(dto.getBang());
        entity.setRecordId(dto.getRecordId());
        entity.setDuLieuCu(dto.getDuLieuCu());
        entity.setDuLieuMoi(dto.getDuLieuMoi());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}