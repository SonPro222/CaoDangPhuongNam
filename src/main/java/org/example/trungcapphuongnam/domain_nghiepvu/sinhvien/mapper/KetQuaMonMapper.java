package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.KetQuaMonDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.KetQuaMon;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class KetQuaMonMapper {
    public KetQuaMonDTO toDto(KetQuaMon entity) {
        if (entity == null) return null;
        KetQuaMonDTO dto = new KetQuaMonDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setDiemCaoNhat(entity.getDiemCaoNhat());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public KetQuaMon toEntity(KetQuaMonDTO dto) {
        if (dto == null) return null;
        KetQuaMon entity = new KetQuaMon();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getMonHocId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        entity.setDiemCaoNhat(dto.getDiemCaoNhat());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}