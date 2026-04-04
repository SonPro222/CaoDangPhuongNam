package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.BaiNopSinhVienDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.BaiNopSinhVien;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.springframework.stereotype.Component;

@Component
public class BaiNopSinhVienMapper {
    public BaiNopSinhVienDTO toDto(BaiNopSinhVien entity) {
        if (entity == null) return null;
        BaiNopSinhVienDTO dto = new BaiNopSinhVienDTO();
        dto.setId(entity.getId());
        dto.setDangKyHocId(entity.getDangKyHoc() != null ? entity.getDangKyHoc().getId() : null);
        dto.setBaiHocId(entity.getBaiHoc() != null ? entity.getBaiHoc().getId() : null);
        dto.setDuongDanFile(entity.getDuongDanFile());
        dto.setThoiGianNop(entity.getThoiGianNop());
        dto.setDiemDanhGia(entity.getDiemDanhGia());
        dto.setNhanXetGv(entity.getNhanXetGv());
        return dto;
    }

    public BaiNopSinhVien toEntity(BaiNopSinhVienDTO dto) {
        if (dto == null) return null;
        BaiNopSinhVien entity = new BaiNopSinhVien();
        entity.setId(dto.getId());
        if (dto.getDangKyHocId() != null) {
            DangKyHoc dkh = new DangKyHoc(); dkh.setId(dto.getDangKyHocId()); entity.setDangKyHoc(dkh);
        }
        if (dto.getBaiHocId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc bh = new org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc();
            bh.setId(dto.getBaiHocId()); entity.setBaiHoc(bh);
        }
        entity.setDuongDanFile(dto.getDuongDanFile());
        entity.setThoiGianNop(dto.getThoiGianNop());
        entity.setDiemDanhGia(dto.getDiemDanhGia());
        entity.setNhanXetGv(dto.getNhanXetGv());
        return entity;
    }
}