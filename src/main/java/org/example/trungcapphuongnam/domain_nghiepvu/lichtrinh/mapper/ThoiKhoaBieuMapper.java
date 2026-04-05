package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.dto.ThoiKhoaBieuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.ThoiKhoaBieu;
import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import org.springframework.stereotype.Component;

@Component
public class ThoiKhoaBieuMapper {
    public ThoiKhoaBieuDTO toDto(ThoiKhoaBieu entity) {
        if (entity == null) return null;
        ThoiKhoaBieuDTO dto = new ThoiKhoaBieuDTO();
        dto.setId(entity.getId());
        dto.setLopMonId(entity.getLopMon() != null ? entity.getLopMon().getId() : null);
        dto.setNgay(entity.getNgay());
        dto.setCaHoc(entity.getCaHoc());
        dto.setGioBatDau(entity.getGioBatDau());
        dto.setGioKetThuc(entity.getGioKetThuc());
        dto.setPhong(entity.getPhong());
        return dto;
    }

    public ThoiKhoaBieu toEntity(ThoiKhoaBieuDTO dto) {
        if (dto == null) return null;
        ThoiKhoaBieu entity = new ThoiKhoaBieu();
        entity.setId(dto.getId());
        if (dto.getLopMonId() != null) {
            LopMon lm = new LopMon(); lm.setId(dto.getLopMonId()); entity.setLopMon(lm);
        }
        entity.setNgay(dto.getNgay());
        entity.setCaHoc(dto.getCaHoc());
        entity.setGioBatDau(dto.getGioBatDau());
        entity.setGioKetThuc(dto.getGioKetThuc());
        entity.setPhong(dto.getPhong());
        return entity;
    }
}