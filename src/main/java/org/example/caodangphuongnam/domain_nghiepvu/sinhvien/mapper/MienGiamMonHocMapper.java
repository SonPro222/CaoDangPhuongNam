package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.MienGiamMonHocDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.MienGiamMonHoc;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class MienGiamMonHocMapper {
    public MienGiamMonHocDTO toDto(MienGiamMonHoc entity) {
        if (entity == null) return null;
        MienGiamMonHocDTO dto = new MienGiamMonHocDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setLyDo(entity.getLyDo());
        dto.setFileMinhChung(entity.getFileMinhChung());
        dto.setTrangThai(entity.getTrangThai());
        dto.setNguoiDuyetId(entity.getNguoiDuyet() != null ? entity.getNguoiDuyet().getId() : null);
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public MienGiamMonHoc toEntity(MienGiamMonHocDTO dto) {
        if (dto == null) return null;
        MienGiamMonHoc entity = new MienGiamMonHoc();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getMonHocId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        entity.setLyDo(dto.getLyDo());
        entity.setFileMinhChung(dto.getFileMinhChung());
        entity.setTrangThai(dto.getTrangThai());
        if (dto.getNguoiDuyetId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDuyetId()); entity.setNguoiDuyet(nd);
        }
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}