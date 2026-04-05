package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.SinhVienDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class SinhVienMapper {
    public SinhVienDTO toDto(SinhVien entity) {
        if (entity == null) return null;
        SinhVienDTO dto = new SinhVienDTO();
        dto.setId(entity.getId());
        dto.setMaSv(entity.getMaSv());
        dto.setTen(entity.getTen());
        dto.setNgaySinh(entity.getNgaySinh());
        dto.setGioiTinh(entity.getGioiTinh());
        dto.setEmail(entity.getEmail());
        dto.setSdt(entity.getSdt());
        dto.setKyLuatCamThi(entity.getKyLuatCamThi());
        return dto;
    }

    public SinhVien toEntity(SinhVienDTO dto) {
        if (dto == null) return null;
        SinhVien entity = new SinhVien();
        entity.setId(dto.getId());
        entity.setMaSv(dto.getMaSv());
        entity.setTen(dto.getTen());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setGioiTinh(dto.getGioiTinh());
        entity.setEmail(dto.getEmail());
        entity.setSdt(dto.getSdt());
        entity.setKyLuatCamThi(dto.getKyLuatCamThi());
        return entity;
    }
}