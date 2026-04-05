package org.example.trungcapphuongnam.domain_nghiepvu.log.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.log.dto.AdminLogDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.log.entity.AdminLog;
import org.springframework.stereotype.Component;

@Component
public class AdminLogMapper {
    public AdminLogDTO toDto(AdminLog entity) {
        if (entity == null) return null;
        AdminLogDTO dto = new AdminLogDTO();
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

    public AdminLog toEntity(AdminLogDTO dto) {
        if (dto == null) return null;
        AdminLog entity = new AdminLog();
        entity.setId(dto.getId());
        if (dto.getNguoiDungId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
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