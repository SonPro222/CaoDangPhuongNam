package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.PhanBoMonDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class PhanBoMonMapper {
    public PhanBoMonDTO toDto(PhanBoMon entity) {
        if (entity == null) return null;
        PhanBoMonDTO dto = new PhanBoMonDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setKyHocId(entity.getKyHoc() != null ? entity.getKyHoc().getId() : null);
        dto.setLoaiMon(entity.getLoaiMon());
        dto.setNhomTuChonId(entity.getNhomTuChon() != null ? entity.getNhomTuChon().getId() : null);
        dto.setThuTu(entity.getThuTu());
        dto.setTuanBatDau(entity.getTuanBatDau());
        dto.setTuanKetThuc(entity.getTuanKetThuc());
        return dto;
    }

    public PhanBoMon toEntity(PhanBoMonDTO dto) {
        if (dto == null) return null;
        PhanBoMon entity = new PhanBoMon();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh ct = new ChuongTrinh(); ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        if (dto.getMonHocId() != null) {
            MonHoc mh = new MonHoc(); mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        if (dto.getKyHocId() != null) {
            KyHoc kh = new KyHoc(); kh.setId(dto.getKyHocId()); entity.setKyHoc(kh);
        }
        entity.setLoaiMon(dto.getLoaiMon());
        if (dto.getNhomTuChonId() != null) {
            NhomTuChon ntc = new NhomTuChon(); ntc.setId(dto.getNhomTuChonId()); entity.setNhomTuChon(ntc);
        }
        entity.setThuTu(dto.getThuTu());
        entity.setTuanBatDau(dto.getTuanBatDau());
        entity.setTuanKetThuc(dto.getTuanKetThuc());
        return entity;
    }
}