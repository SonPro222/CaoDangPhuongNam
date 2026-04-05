package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.dto.HocPhiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.HocPhi;
import org.springframework.stereotype.Component;

@Component
public class HocPhiMapper {
    public HocPhiDTO toDto(HocPhi entity) {
        if (entity == null) return null;
        HocPhiDTO dto = new HocPhiDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setKyHocId(entity.getKyHoc() != null ? entity.getKyHoc().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setLoai(entity.getLoai());
        dto.setSoTien(entity.getSoTien());
        dto.setMoTa(entity.getMoTa());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public HocPhi toEntity(HocPhiDTO dto) {
        if (dto == null) return null;
        HocPhi entity = new HocPhi();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh ct = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh();
            ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        if (dto.getKyHocId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.KyHoc kh = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.KyHoc();
            kh.setId(dto.getKyHocId()); entity.setKyHoc(kh);
        }
        if (dto.getMonHocId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        entity.setLoai(dto.getLoai());
        entity.setSoTien(dto.getSoTien());
        entity.setMoTa(dto.getMoTa());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}