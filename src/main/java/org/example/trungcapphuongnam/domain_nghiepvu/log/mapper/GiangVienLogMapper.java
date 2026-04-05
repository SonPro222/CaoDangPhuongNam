package org.example.trungcapphuongnam.domain_nghiepvu.log.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.log.dto.GiangVienLogDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.log.entity.GiangVienLog;
import org.springframework.stereotype.Component;

@Component
public class GiangVienLogMapper {
    public GiangVienLogDTO toDto(GiangVienLog entity) {
        if (entity == null) return null;
        GiangVienLogDTO dto = new GiangVienLogDTO();
        dto.setId(entity.getId());
        dto.setNguoiDungId(entity.getNguoiDung() != null ? entity.getNguoiDung().getId() : null);
        dto.setHanhDong(entity.getHanhDong());
        dto.setDoiTuong(entity.getDoiTuong());
        dto.setDoiTuongId(entity.getDoiTuongId());
        dto.setNoiDungCu(entity.getNoiDungCu());
        dto.setNoiDungMoi(entity.getNoiDungMoi());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public GiangVienLog toEntity(GiangVienLogDTO dto) {
        if (dto == null) return null;
        GiangVienLog entity = new GiangVienLog();
        entity.setId(dto.getId());
        if (dto.getNguoiDungId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDungId()); entity.setNguoiDung(nd);
        }
        entity.setHanhDong(dto.getHanhDong());
        entity.setDoiTuong(dto.getDoiTuong());
        entity.setDoiTuongId(dto.getDoiTuongId());
        entity.setNoiDungCu(dto.getNoiDungCu());
        entity.setNoiDungMoi(dto.getNoiDungMoi());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}