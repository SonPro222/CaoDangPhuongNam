package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.ChungChiSinhVienDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.ChungChiSinhVien;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.ChungChi;
import org.springframework.stereotype.Component;

@Component
public class ChungChiSinhVienMapper {
    public ChungChiSinhVienDTO toDto(ChungChiSinhVien entity) {
        if (entity == null) return null;
        ChungChiSinhVienDTO dto = new ChungChiSinhVienDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setChungChiId(entity.getChungChi() != null ? entity.getChungChi().getId() : null);
        dto.setNgayCap(entity.getNgayCap());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public ChungChiSinhVien toEntity(ChungChiSinhVienDTO dto) {
        if (dto == null) return null;
        ChungChiSinhVien entity = new ChungChiSinhVien();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getChungChiId() != null) {
            ChungChi cc = new ChungChi(); cc.setId(dto.getChungChiId()); entity.setChungChi(cc);
        }
        entity.setNgayCap(dto.getNgayCap());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}