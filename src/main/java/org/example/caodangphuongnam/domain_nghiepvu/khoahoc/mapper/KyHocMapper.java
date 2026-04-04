package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.KyHocDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.KyHoc;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh;
import org.springframework.stereotype.Component;

@Component
public class KyHocMapper {
    public KyHocDTO toDto(KyHoc entity) {
        if (entity == null) return null;
        KyHocDTO dto = new KyHocDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setTen(entity.getTen());
        dto.setThuTu(entity.getThuTu());
        return dto;
    }

    public KyHoc toEntity(KyHocDTO dto) {
        if (dto == null) return null;
        KyHoc entity = new KyHoc();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh chuongTrinh = new ChuongTrinh();
            chuongTrinh.setId(dto.getChuongTrinhId());
            entity.setChuongTrinh(chuongTrinh);
        }
        entity.setTen(dto.getTen());
        entity.setThuTu(dto.getThuTu());
        return entity;
    }
}