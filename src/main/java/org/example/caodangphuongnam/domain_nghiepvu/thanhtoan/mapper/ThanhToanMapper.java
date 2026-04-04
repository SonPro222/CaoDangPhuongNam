package org.example.caodangphuongnam.domain_nghiepvu.thanhtoan.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.thanhtoan.dto.ThanhToanDTO;
import org.example.caodangphuongnam.domain_nghiepvu.thanhtoan.entity.ThanhToan;
import org.springframework.stereotype.Component;

@Component
public class ThanhToanMapper {
    public ThanhToanDTO toDto(ThanhToan entity) {
        if (entity == null) return null;
        ThanhToanDTO dto = new ThanhToanDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setCongNoId(entity.getCongNo() != null ? entity.getCongNo().getId() : null);
        dto.setSoTien(entity.getSoTien());
        dto.setPhuongThuc(entity.getPhuongThuc());
        dto.setMaGiaoDich(entity.getMaGiaoDich());
        dto.setNgayThanhToan(entity.getNgayThanhToan());
        dto.setNguoiThuId(entity.getNguoiThu() != null ? entity.getNguoiThu().getId() : null);
        return dto;
    }

    public ThanhToan toEntity(ThanhToanDTO dto) {
        if (dto == null) return null;
        ThanhToan entity = new ThanhToan();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien sv = new org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien();
            sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getCongNoId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.taichinh.entity.CongNo cn = new org.example.caodangphuongnam.domain_nghiepvu.taichinh.entity.CongNo();
            cn.setId(dto.getCongNoId()); entity.setCongNo(cn);
        }
        entity.setSoTien(dto.getSoTien());
        entity.setPhuongThuc(dto.getPhuongThuc());
        entity.setMaGiaoDich(dto.getMaGiaoDich());
        entity.setNgayThanhToan(dto.getNgayThanhToan());
        if (dto.getNguoiThuId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiThuId()); entity.setNguoiThu(nd);
        }
        return entity;
    }
}