package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.DiemTongDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DiemTong;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.springframework.stereotype.Component;

@Component
public class DiemTongMapper {
    public DiemTongDTO toDto(DiemTong entity) {
        if (entity == null) return null;
        DiemTongDTO dto = new DiemTongDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setLopMonId(entity.getLopMon() != null ? entity.getLopMon().getId() : null);
        dto.setDangKyHocId(entity.getDangKyHoc() != null ? entity.getDangKyHoc().getId() : null);
        dto.setTongDiem(entity.getTongDiem());
        dto.setKetQua(entity.getKetQua());
        return dto;
    }

    public DiemTong toEntity(DiemTongDTO dto) {
        if (dto == null) return null;
        DiemTong entity = new DiemTong();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getLopMonId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon lm = new org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon();
            lm.setId(dto.getLopMonId()); entity.setLopMon(lm);
        }
        if (dto.getDangKyHocId() != null) {
            DangKyHoc dkh = new DangKyHoc(); dkh.setId(dto.getDangKyHocId()); entity.setDangKyHoc(dkh);
        }
        entity.setTongDiem(dto.getTongDiem());
        entity.setKetQua(dto.getKetQua());
        return entity;
    }
}