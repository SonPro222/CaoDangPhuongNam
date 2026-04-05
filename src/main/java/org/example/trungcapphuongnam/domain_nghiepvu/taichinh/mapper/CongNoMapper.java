package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.dto.CongNoDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.CongNo;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.HocPhi;
import org.springframework.stereotype.Component;

@Component
public class CongNoMapper {
    public CongNoDTO toDto(CongNo entity) {
        if (entity == null) return null;
        CongNoDTO dto = new CongNoDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setHocPhiId(entity.getHocPhi() != null ? entity.getHocPhi().getId() : null);
        dto.setSoTienPhaiDong(entity.getSoTienPhaiDong());
        dto.setSoTienDaDong(entity.getSoTienDaDong());
        dto.setHanDong(entity.getHanDong());
        dto.setTrangThai(entity.getTrangThai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public CongNo toEntity(CongNoDTO dto) {
        if (dto == null) return null;
        CongNo entity = new CongNo();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien sv = new org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien();
            sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getHocPhiId() != null) {
            HocPhi hp = new HocPhi(); hp.setId(dto.getHocPhiId()); entity.setHocPhi(hp);
        }
        entity.setSoTienPhaiDong(dto.getSoTienPhaiDong());
        entity.setSoTienDaDong(dto.getSoTienDaDong());
        entity.setHanDong(dto.getHanDong());
        entity.setTrangThai(dto.getTrangThai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}