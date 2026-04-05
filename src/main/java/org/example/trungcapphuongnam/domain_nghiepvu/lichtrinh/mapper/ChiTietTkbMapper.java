package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.dto.ChiTietTkbDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.ChiTietTkb;
import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.ThoiKhoaBieu;
import org.springframework.stereotype.Component;

@Component
public class ChiTietTkbMapper {
    public ChiTietTkbDTO toDto(ChiTietTkb entity) {
        if (entity == null) return null;
        ChiTietTkbDTO dto = new ChiTietTkbDTO();
        dto.setId(entity.getId());
        dto.setThoiKhoaBieuId(entity.getThoiKhoaBieu() != null ? entity.getThoiKhoaBieu().getId() : null);
        dto.setBaiHocId(entity.getBaiHoc() != null ? entity.getBaiHoc().getId() : null);
        return dto;
    }

    public ChiTietTkb toEntity(ChiTietTkbDTO dto) {
        if (dto == null) return null;
        ChiTietTkb entity = new ChiTietTkb();
        entity.setId(dto.getId());
        if (dto.getThoiKhoaBieuId() != null) {
            ThoiKhoaBieu tkb = new ThoiKhoaBieu(); tkb.setId(dto.getThoiKhoaBieuId()); entity.setThoiKhoaBieu(tkb);
        }
        if (dto.getBaiHocId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.BaiHoc bh = new org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.BaiHoc();
            bh.setId(dto.getBaiHocId()); entity.setBaiHoc(bh);
        }
        return entity;
    }
}