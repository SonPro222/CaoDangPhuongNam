package org.example.trungcapphuongnam.domain_nghiepvu.phongban.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.dto.PhongBanDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.PhongBan;
import org.springframework.stereotype.Component;

@Component
public class PhongBanMapper {
    public PhongBanDTO toDto(PhongBan entity) {
        if (entity == null) return null;
        PhongBanDTO dto = new PhongBanDTO();
        dto.setId(entity.getId());
        dto.setTen(entity.getTen());
        return dto;
    }

    public PhongBan toEntity(PhongBanDTO dto) {
        if (dto == null) return null;
        PhongBan entity = new PhongBan();
        entity.setId(dto.getId());
        entity.setTen(dto.getTen());
        return entity;
    }
}