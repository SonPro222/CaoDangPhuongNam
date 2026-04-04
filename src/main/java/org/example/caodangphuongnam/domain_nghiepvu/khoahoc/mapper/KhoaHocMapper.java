package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.KhoaHocDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class KhoaHocMapper {
    public KhoaHocDTO toDto(KhoaHoc entity) {
        if (entity == null) return null;
        KhoaHocDTO dto = new KhoaHocDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setTen(entity.getTen());
        dto.setNgayBatDau(entity.getNgayBatDau());
        dto.setNgayKetThuc(entity.getNgayKetThuc());
        return dto;
    }

    public KhoaHoc toEntity(KhoaHocDTO dto) {
        if (dto == null) return null;
        KhoaHoc entity = new KhoaHoc();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh ct = new ChuongTrinh(); ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        entity.setTen(dto.getTen());
        entity.setNgayBatDau(dto.getNgayBatDau());
        entity.setNgayKetThuc(dto.getNgayKetThuc());
        return entity;
    }
}