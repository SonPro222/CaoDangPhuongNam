package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.dto.LopMonDTO;
import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import org.springframework.stereotype.Component;

@Component
public class LopMonMapper {
    public LopMonDTO toDto(LopMon entity) {
        if (entity == null) return null;
        LopMonDTO dto = new LopMonDTO();
        dto.setId(entity.getId());
        dto.setMaLopMon(entity.getMaLopMon());
        dto.setLopId(entity.getLop() != null ? entity.getLop().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setGiangVienId(entity.getGiangVien() != null ? entity.getGiangVien().getId() : null);
        dto.setHocKyThucTeId(entity.getHocKyThucTe() != null ? entity.getHocKyThucTe().getId() : null);
        dto.setNgayBatDau(entity.getNgayBatDau());
        dto.setNgayKetThuc(entity.getNgayKetThuc());
        dto.setSiSoToiDa(entity.getSiSoToiDa());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public LopMon toEntity(LopMonDTO dto) {
        if (dto == null) return null;
        LopMon entity = new LopMon();
        entity.setId(dto.getId());
        entity.setMaLopMon(dto.getMaLopMon());
        if (dto.getLopId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.Lop lop = new org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.Lop();
            lop.setId(dto.getLopId()); entity.setLop(lop);
        }
        if (dto.getMonHocId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        if (dto.getGiangVienId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity.GiangVien gv = new org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity.GiangVien();
            gv.setId(dto.getGiangVienId()); entity.setGiangVien(gv);
        }
        if (dto.getHocKyThucTeId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe hk = new org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe();
            hk.setId(dto.getHocKyThucTeId()); entity.setHocKyThucTe(hk);
        }
        entity.setNgayBatDau(dto.getNgayBatDau());
        entity.setNgayKetThuc(dto.getNgayKetThuc());
        entity.setSiSoToiDa(dto.getSiSoToiDa());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}