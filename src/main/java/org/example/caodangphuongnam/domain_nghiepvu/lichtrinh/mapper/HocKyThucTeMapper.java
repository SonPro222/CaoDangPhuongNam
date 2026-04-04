package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.dto.HocKyThucTeDTO;
import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe;
import org.springframework.stereotype.Component;

@Component
public class HocKyThucTeMapper {
    public HocKyThucTeDTO toDto(HocKyThucTe entity) {
        if (entity == null) return null;
        HocKyThucTeDTO dto = new HocKyThucTeDTO();
        dto.setId(entity.getId());
        dto.setMaHocKy(entity.getMaHocKy());
        dto.setTen(entity.getTen());
        dto.setNgayBatDau(entity.getNgayBatDau());
        dto.setNgayKetThuc(entity.getNgayKetThuc());
        return dto;
    }

    public HocKyThucTe toEntity(HocKyThucTeDTO dto) {
        if (dto == null) return null;
        HocKyThucTe entity = new HocKyThucTe();
        entity.setId(dto.getId());
        entity.setMaHocKy(dto.getMaHocKy());
        entity.setTen(dto.getTen());
        entity.setNgayBatDau(dto.getNgayBatDau());
        entity.setNgayKetThuc(dto.getNgayKetThuc());
        return entity;
    }
}