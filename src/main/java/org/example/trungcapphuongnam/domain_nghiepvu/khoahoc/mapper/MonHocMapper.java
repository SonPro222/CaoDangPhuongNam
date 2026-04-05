package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto.MonHocDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import org.springframework.stereotype.Component;

@Component
public class MonHocMapper {
    public MonHocDTO toDto(MonHoc entity) {
        if (entity == null) return null;
        MonHocDTO dto = new MonHocDTO();
        dto.setId(entity.getId());
        dto.setMaMon(entity.getMaMon());
        dto.setTen(entity.getTen());
        dto.setLoaiHinh(entity.getLoaiHinh());
        dto.setSoTinChi(entity.getSoTinChi());
        dto.setTongSoGio(entity.getTongSoGio());
        dto.setGioLyThuyet(entity.getGioLyThuyet());
        dto.setGioThucHanh(entity.getGioThucHanh());
        dto.setGioKiemTra(entity.getGioKiemTra());
        dto.setLaMonDieuKien(entity.getLaMonDieuKien());
        return dto;
    }

    public MonHoc toEntity(MonHocDTO dto) {
        if (dto == null) return null;
        MonHoc entity = new MonHoc();
        entity.setId(dto.getId());
        entity.setMaMon(dto.getMaMon());
        entity.setTen(dto.getTen());
        entity.setLoaiHinh(dto.getLoaiHinh());
        entity.setSoTinChi(dto.getSoTinChi());
        entity.setTongSoGio(dto.getTongSoGio());
        entity.setGioLyThuyet(dto.getGioLyThuyet());
        entity.setGioThucHanh(dto.getGioThucHanh());
        entity.setGioKiemTra(dto.getGioKiemTra());
        entity.setLaMonDieuKien(dto.getLaMonDieuKien());
        return entity;
    }
}