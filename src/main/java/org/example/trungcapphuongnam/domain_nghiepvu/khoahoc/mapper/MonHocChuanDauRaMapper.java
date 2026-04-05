package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto.MonHocChuanDauRaDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class MonHocChuanDauRaMapper {
    public MonHocChuanDauRaDTO toDto(MonHocChuanDauRa entity) {
        if (entity == null) return null;
        MonHocChuanDauRaDTO dto = new MonHocChuanDauRaDTO();
        dto.setId(entity.getId());
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setChuanDauRaId(entity.getChuanDauRa() != null ? entity.getChuanDauRa().getId() : null);
        return dto;
    }

    public MonHocChuanDauRa toEntity(MonHocChuanDauRaDTO dto) {
        if (dto == null) return null;
        MonHocChuanDauRa entity = new MonHocChuanDauRa();
        entity.setId(dto.getId());
        if (dto.getMonHocId() != null) {
            MonHoc mh = new MonHoc(); mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        if (dto.getChuanDauRaId() != null) {
            ChuanDauRa cdr = new ChuanDauRa(); cdr.setId(dto.getChuanDauRaId()); entity.setChuanDauRa(cdr);
        }
        return entity;
    }
}