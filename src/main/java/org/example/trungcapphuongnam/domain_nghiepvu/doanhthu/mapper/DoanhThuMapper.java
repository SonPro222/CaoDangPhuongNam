package org.example.trungcapphuongnam.domain_nghiepvu.doanhthu.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.doanhthu.dto.DoanhThuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.doanhthu.entity.DoanhThu;
import org.springframework.stereotype.Component;

@Component
public class DoanhThuMapper {
    public DoanhThuDTO toDto(DoanhThu entity) {
        if (entity == null) return null;
        DoanhThuDTO dto = new DoanhThuDTO();
        dto.setId(entity.getId());
        dto.setNgay(entity.getNgay());
        dto.setTongTien(entity.getTongTien());
        dto.setLoai(entity.getLoai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public DoanhThu toEntity(DoanhThuDTO dto) {
        if (dto == null) return null;
        DoanhThu entity = new DoanhThu();
        entity.setId(dto.getId());
        entity.setNgay(dto.getNgay());
        entity.setTongTien(dto.getTongTien());
        entity.setLoai(dto.getLoai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}