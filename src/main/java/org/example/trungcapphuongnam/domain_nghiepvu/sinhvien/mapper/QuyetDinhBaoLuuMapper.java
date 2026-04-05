package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.QuyetDinhBaoLuuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.QuyetDinhBaoLuu;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class QuyetDinhBaoLuuMapper {
    public QuyetDinhBaoLuuDTO toDto(QuyetDinhBaoLuu entity) {
        if (entity == null) return null;
        QuyetDinhBaoLuuDTO dto = new QuyetDinhBaoLuuDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setNgayBatDau(entity.getNgayBatDau());
        dto.setNgayHetHan(entity.getNgayHetHan());
        dto.setLyDo(entity.getLyDo());
        dto.setTrangThai(entity.getTrangThai());
        dto.setNguoiDuyetId(entity.getNguoiDuyet() != null ? entity.getNguoiDuyet().getId() : null);
        return dto;
    }

    public QuyetDinhBaoLuu toEntity(QuyetDinhBaoLuuDTO dto) {
        if (dto == null) return null;
        QuyetDinhBaoLuu entity = new QuyetDinhBaoLuu();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        entity.setNgayBatDau(dto.getNgayBatDau());
        entity.setNgayHetHan(dto.getNgayHetHan());
        entity.setLyDo(dto.getLyDo());
        entity.setTrangThai(dto.getTrangThai());
        if (dto.getNguoiDuyetId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiDuyetId()); entity.setNguoiDuyet(nd);
        }
        return entity;
    }
}