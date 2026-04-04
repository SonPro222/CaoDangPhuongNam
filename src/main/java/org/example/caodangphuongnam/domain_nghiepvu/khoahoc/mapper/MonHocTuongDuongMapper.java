package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.MonHocTuongDuongDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class MonHocTuongDuongMapper {
    public MonHocTuongDuongDTO toDto(MonHocTuongDuong entity) {
        if (entity == null) return null;
        MonHocTuongDuongDTO dto = new MonHocTuongDuongDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhCuId(entity.getChuongTrinhCu() != null ? entity.getChuongTrinhCu().getId() : null);
        dto.setChuongTrinhMoiId(entity.getChuongTrinhMoi() != null ? entity.getChuongTrinhMoi().getId() : null);
        dto.setMonCuId(entity.getMonCu() != null ? entity.getMonCu().getId() : null);
        dto.setMonMoiId(entity.getMonMoi() != null ? entity.getMonMoi().getId() : null);
        dto.setTyLeThayThe(entity.getTyLeThayThe());
        dto.setGhiChu(entity.getGhiChu());
        return dto;
    }

    public MonHocTuongDuong toEntity(MonHocTuongDuongDTO dto) {
        if (dto == null) return null;
        MonHocTuongDuong entity = new MonHocTuongDuong();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhCuId() != null) {
            ChuongTrinh ctc = new ChuongTrinh(); ctc.setId(dto.getChuongTrinhCuId()); entity.setChuongTrinhCu(ctc);
        }
        if (dto.getChuongTrinhMoiId() != null) {
            ChuongTrinh ctm = new ChuongTrinh(); ctm.setId(dto.getChuongTrinhMoiId()); entity.setChuongTrinhMoi(ctm);
        }
        if (dto.getMonCuId() != null) {
            MonHoc mc = new MonHoc(); mc.setId(dto.getMonCuId()); entity.setMonCu(mc);
        }
        if (dto.getMonMoiId() != null) {
            MonHoc mm = new MonHoc(); mm.setId(dto.getMonMoiId()); entity.setMonMoi(mm);
        }
        entity.setTyLeThayThe(dto.getTyLeThayThe());
        entity.setGhiChu(dto.getGhiChu());
        return entity;
    }
}