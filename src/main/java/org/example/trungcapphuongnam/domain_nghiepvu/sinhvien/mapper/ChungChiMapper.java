package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.ChungChiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.ChungChi;
import org.springframework.stereotype.Component;

@Component
public class ChungChiMapper {
    public ChungChiDTO toDto(ChungChi entity) {
        if (entity == null) return null;
        ChungChiDTO dto = new ChungChiDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setTen(entity.getTen());
        return dto;
    }

    public ChungChi toEntity(ChungChiDTO dto) {
        if (dto == null) return null;
        ChungChi entity = new ChungChi();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh ct = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh();
            ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        entity.setTen(dto.getTen());
        return entity;
    }
}