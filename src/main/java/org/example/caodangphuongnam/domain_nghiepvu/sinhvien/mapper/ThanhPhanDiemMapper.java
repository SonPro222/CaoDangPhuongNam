package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.ThanhPhanDiemDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.ThanhPhanDiem;
import org.springframework.stereotype.Component;

@Component
public class ThanhPhanDiemMapper {
    public ThanhPhanDiemDTO toDto(ThanhPhanDiem entity) {
        if (entity == null) return null;
        ThanhPhanDiemDTO dto = new ThanhPhanDiemDTO();
        dto.setId(entity.getId());
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setTen(entity.getTen());
        dto.setLoai(entity.getLoai());
        dto.setTrongSo(entity.getTrongSo());
        return dto;
    }

    public ThanhPhanDiem toEntity(ThanhPhanDiemDTO dto) {
        if (dto == null) return null;
        ThanhPhanDiem entity = new ThanhPhanDiem();
        entity.setId(dto.getId());
        if (dto.getMonHocId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        entity.setTen(dto.getTen());
        entity.setLoai(dto.getLoai());
        entity.setTrongSo(dto.getTrongSo());
        return entity;
    }
}