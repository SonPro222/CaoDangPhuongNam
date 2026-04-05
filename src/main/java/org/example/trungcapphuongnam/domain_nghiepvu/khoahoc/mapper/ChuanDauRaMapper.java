package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto.ChuanDauRaDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class ChuanDauRaMapper {
    public ChuanDauRaDTO toDto(ChuanDauRa entity) {
        if (entity == null) return null;
        ChuanDauRaDTO dto = new ChuanDauRaDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setMaNangLuc(entity.getMaNangLuc());
        dto.setTenNangLuc(entity.getTenNangLuc());
        dto.setLoaiNangLuc(entity.getLoaiNangLuc());
        return dto;
    }

    public ChuanDauRa toEntity(ChuanDauRaDTO dto) {
        if (dto == null) return null;
        ChuanDauRa entity = new ChuanDauRa();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh ct = new ChuongTrinh(); ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        entity.setMaNangLuc(dto.getMaNangLuc());
        entity.setTenNangLuc(dto.getTenNangLuc());
        entity.setLoaiNangLuc(dto.getLoaiNangLuc());
        return entity;
    }
}