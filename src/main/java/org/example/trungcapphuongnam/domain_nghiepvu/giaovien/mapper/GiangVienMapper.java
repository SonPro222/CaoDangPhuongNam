package org.example.trungcapphuongnam.domain_nghiepvu.giaovien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.dto.GiangVienDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity.GiangVien;
import org.springframework.stereotype.Component;

@Component
public class GiangVienMapper {
    public GiangVienDTO toDto(GiangVien entity) {
        if (entity == null) return null;
        GiangVienDTO dto = new GiangVienDTO();
        dto.setId(entity.getId());
        dto.setMaGv(entity.getMaGv());
        dto.setNguoiDungId(entity.getNguoiDung() != null ? entity.getNguoiDung().getId() : null);
        dto.setTen(entity.getTen());
        dto.setEmail(entity.getEmail());
        dto.setSdt(entity.getSdt());
        return dto;
    }

    public GiangVien toEntity(GiangVienDTO dto) {
        if (dto == null) return null;
        GiangVien entity = new GiangVien();
        entity.setId(dto.getId());
        entity.setMaGv(dto.getMaGv());
        if (dto.getNguoiDungId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDungId());
            entity.setNguoiDung(nd);
        }
        entity.setTen(dto.getTen());
        entity.setEmail(dto.getEmail());
        entity.setSdt(dto.getSdt());
        return entity;
    }
}