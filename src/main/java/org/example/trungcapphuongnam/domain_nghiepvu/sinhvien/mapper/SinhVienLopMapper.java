package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.SinhVienLopDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVienLop;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class SinhVienLopMapper {
    public SinhVienLopDTO toDto(SinhVienLop entity) {
        if (entity == null) return null;
        SinhVienLopDTO dto = new SinhVienLopDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setLopId(entity.getLop() != null ? entity.getLop().getId() : null);
        dto.setNgayVao(entity.getNgayVao());
        dto.setNgayRa(entity.getNgayRa());
        dto.setTrangThai(entity.getTrangThai());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public SinhVienLop toEntity(SinhVienLopDTO dto) {
        if (dto == null) return null;
        SinhVienLop entity = new SinhVienLop();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getLopId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.Lop lop = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.Lop();
            lop.setId(dto.getLopId()); entity.setLop(lop);
        }
        entity.setNgayVao(dto.getNgayVao());
        entity.setNgayRa(dto.getNgayRa());
        entity.setTrangThai(dto.getTrangThai());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}