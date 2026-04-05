package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.DangKyHocDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class DangKyHocMapper {
    public DangKyHocDTO toDto(DangKyHoc entity) {
        if (entity == null) return null;
        DangKyHocDTO dto = new DangKyHocDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setLopMonId(entity.getLopMon() != null ? entity.getLopMon().getId() : null);
        dto.setNgayDangKy(entity.getNgayDangKy());
        dto.setTrangThai(entity.getTrangThai());
        dto.setLanHoc(entity.getLanHoc());
        dto.setDiemChuyenCan(entity.getDiemChuyenCan());
        dto.setDiemTrungBinh(entity.getDiemTrungBinh());
        dto.setKetQua(entity.getKetQua());
        return dto;
    }

    public DangKyHoc toEntity(DangKyHocDTO dto) {
        if (dto == null) return null;
        DangKyHoc entity = new DangKyHoc();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getLopMonId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon lm = new org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon();
            lm.setId(dto.getLopMonId()); entity.setLopMon(lm);
        }
        entity.setNgayDangKy(dto.getNgayDangKy());
        entity.setTrangThai(dto.getTrangThai());
        entity.setLanHoc(dto.getLanHoc());
        entity.setDiemChuyenCan(dto.getDiemChuyenCan());
        entity.setDiemTrungBinh(dto.getDiemTrungBinh());
        entity.setKetQua(dto.getKetQua());
        return entity;
    }
}