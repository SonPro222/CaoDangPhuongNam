package org.example.caodangphuongnam.domain_nghiepvu.nganh.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.nganh.dto.NganhDTO;
import org.example.caodangphuongnam.domain_nghiepvu.nganh.entity.Nganh;
import org.springframework.stereotype.Component;

@Component
public class NganhMapper {
    public NganhDTO toDto(Nganh entity) {
        if (entity == null) return null;
        NganhDTO dto = new NganhDTO();
        dto.setId(entity.getId());
        dto.setMaNganh(entity.getMaNganh());
        dto.setTen(entity.getTen());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public Nganh toEntity(NganhDTO dto) {
        if (dto == null) return null;
        Nganh entity = new Nganh();
        entity.setId(dto.getId());
        entity.setMaNganh(dto.getMaNganh());
        entity.setTen(dto.getTen());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}