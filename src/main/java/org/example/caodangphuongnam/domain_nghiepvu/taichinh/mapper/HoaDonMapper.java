package org.example.caodangphuongnam.domain_nghiepvu.taichinh.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.taichinh.dto.HoaDonDTO;
import org.example.caodangphuongnam.domain_nghiepvu.taichinh.entity.HoaDon;
import org.springframework.stereotype.Component;

@Component
public class HoaDonMapper {
    public HoaDonDTO toDto(HoaDon entity) {
        if (entity == null) return null;
        HoaDonDTO dto = new HoaDonDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setTongTien(entity.getTongTien());
        dto.setNgayXuat(entity.getNgayXuat());
        dto.setTrangThai(entity.getTrangThai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public HoaDon toEntity(HoaDonDTO dto) {
        if (dto == null) return null;
        HoaDon entity = new HoaDon();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien sv = new org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien();
            sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        entity.setTongTien(dto.getTongTien());
        entity.setNgayXuat(dto.getNgayXuat());
        entity.setTrangThai(dto.getTrangThai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}