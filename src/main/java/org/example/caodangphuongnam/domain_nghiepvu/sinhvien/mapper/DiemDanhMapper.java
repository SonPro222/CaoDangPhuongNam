package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.DiemDanhDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DiemDanh;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.springframework.stereotype.Component;

@Component
public class DiemDanhMapper {
    public DiemDanhDTO toDto(DiemDanh entity) {
        if (entity == null) return null;
        DiemDanhDTO dto = new DiemDanhDTO();
        dto.setId(entity.getId());
        dto.setDangKyHocId(entity.getDangKyHoc() != null ? entity.getDangKyHoc().getId() : null);
        dto.setNgay(entity.getNgay());
        dto.setTrangThai(entity.getTrangThai());
        dto.setNguoiDiemDanhId(entity.getNguoiDiemDanh() != null ? entity.getNguoiDiemDanh().getId() : null);
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        return dto;
    }

    public DiemDanh toEntity(DiemDanhDTO dto) {
        if (dto == null) return null;
        DiemDanh entity = new DiemDanh();
        entity.setId(dto.getId());
        if (dto.getDangKyHocId() != null) {
            DangKyHoc dkh = new DangKyHoc(); dkh.setId(dto.getDangKyHocId()); entity.setDangKyHoc(dkh);
        }
        entity.setNgay(dto.getNgay());
        entity.setTrangThai(dto.getTrangThai());
        if (dto.getNguoiDiemDanhId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDiemDanhId()); entity.setNguoiDiemDanh(nd);
        }
        entity.setCreatedAt(dto.getCreatedAt());
        entity.setUpdatedAt(dto.getUpdatedAt());
        return entity;
    }
}