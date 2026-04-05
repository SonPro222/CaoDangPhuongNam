package org.example.trungcapphuongnam.domain_nghiepvu.cms.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.SyllabusDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.Syllabus;
import org.springframework.stereotype.Component;

@Component
public class SyllabusMapper {
    public SyllabusDTO toDto(Syllabus entity) {
        if (entity == null) return null;
        SyllabusDTO dto = new SyllabusDTO();
        dto.setId(entity.getId());
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setTen(entity.getTen());
        dto.setMaMon(entity.getMaMon());
        dto.setTongGio(entity.getTongGio());
        dto.setGioLyThuyet(entity.getGioLyThuyet());
        dto.setGioThucHanh(entity.getGioThucHanh());
        dto.setGioKiemTra(entity.getGioKiemTra());
        dto.setViTri(entity.getViTri());
        dto.setTinhChat(entity.getTinhChat());
        dto.setMucTieuKienThuc(entity.getMucTieuKienThuc());
        dto.setMucTieuKyNang(entity.getMucTieuKyNang());
        dto.setMucTieuThaiDo(entity.getMucTieuThaiDo());
        dto.setPhuongPhapDanhGia(entity.getPhuongPhapDanhGia());
        dto.setDieuKienHoc(entity.getDieuKienHoc());
        dto.setTaiLieu(entity.getTaiLieu());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public Syllabus toEntity(SyllabusDTO dto) {
        if (dto == null) return null;
        Syllabus entity = new Syllabus();
        entity.setId(dto.getId());
        if (dto.getMonHocId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc mh = new org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc();
            mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        entity.setTen(dto.getTen());
        entity.setMaMon(dto.getMaMon());
        entity.setTongGio(dto.getTongGio());
        entity.setGioLyThuyet(dto.getGioLyThuyet());
        entity.setGioThucHanh(dto.getGioThucHanh());
        entity.setGioKiemTra(dto.getGioKiemTra());
        entity.setViTri(dto.getViTri());
        entity.setTinhChat(dto.getTinhChat());
        entity.setMucTieuKienThuc(dto.getMucTieuKienThuc());
        entity.setMucTieuKyNang(dto.getMucTieuKyNang());
        entity.setMucTieuThaiDo(dto.getMucTieuThaiDo());
        entity.setPhuongPhapDanhGia(dto.getPhuongPhapDanhGia());
        entity.setDieuKienHoc(dto.getDieuKienHoc());
        entity.setTaiLieu(dto.getTaiLieu());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}