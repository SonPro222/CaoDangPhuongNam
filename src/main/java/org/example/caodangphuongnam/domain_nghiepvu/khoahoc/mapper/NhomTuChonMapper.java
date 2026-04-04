package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.NhomTuChonDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.NhomTuChon;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh;
import org.springframework.stereotype.Component;

@Component
public class NhomTuChonMapper {
    public NhomTuChonDTO toDto(NhomTuChon entity) {
        if (entity == null) return null;
        NhomTuChonDTO dto = new NhomTuChonDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setMaNhom(entity.getMaNhom());
        dto.setTenNhom(entity.getTenNhom());
        dto.setSoMonYeuCau(entity.getSoMonYeuCau());
        return dto;
    }

    public NhomTuChon toEntity(NhomTuChonDTO dto) {
        if (dto == null) return null;
        NhomTuChon entity = new NhomTuChon();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh chuongTrinh = new ChuongTrinh();
            chuongTrinh.setId(dto.getChuongTrinhId());
            entity.setChuongTrinh(chuongTrinh);
        }
        entity.setMaNhom(dto.getMaNhom());
        entity.setTenNhom(dto.getTenNhom());
        entity.setSoMonYeuCau(dto.getSoMonYeuCau());
        return entity;
    }
}