package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto.ChuongTrinhDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh;
import org.springframework.stereotype.Component;

@Component
public class ChuongTrinhMapper {
    public ChuongTrinhDTO toDto(ChuongTrinh entity) {
        if (entity == null) return null;
        ChuongTrinhDTO dto = new ChuongTrinhDTO();
        dto.setId(entity.getId());
        dto.setNganhId(entity.getNganh() != null ? entity.getNganh().getId() : null);
        dto.setTen(entity.getTen());
        dto.setVersion(entity.getVersion());
        dto.setThoiGianThang(entity.getThoiGianThang());
        dto.setCoKy(entity.getCoKy());
        dto.setTongTinChi(entity.getTongTinChi());
        dto.setTongGio(entity.getTongGio());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public ChuongTrinh toEntity(ChuongTrinhDTO dto) {
        if (dto == null) return null;
        ChuongTrinh entity = new ChuongTrinh();
        entity.setId(dto.getId());
        if (dto.getNganhId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.nganh.entity.Nganh nganh = new org.example.trungcapphuongnam.domain_nghiepvu.nganh.entity.Nganh();
            nganh.setId(dto.getNganhId());
            entity.setNganh(nganh);
        }
        entity.setTen(dto.getTen());
        entity.setVersion(dto.getVersion());
        entity.setThoiGianThang(dto.getThoiGianThang());
        entity.setCoKy(dto.getCoKy());
        entity.setTongTinChi(dto.getTongTinChi());
        entity.setTongGio(dto.getTongGio());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}