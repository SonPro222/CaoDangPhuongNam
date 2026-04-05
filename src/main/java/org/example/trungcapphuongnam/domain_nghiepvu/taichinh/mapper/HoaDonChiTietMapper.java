package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.dto.HoaDonChiTietDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.HoaDonChiTiet;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.HoaDon;
import org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity.CongNo;
import org.springframework.stereotype.Component;

@Component
public class HoaDonChiTietMapper {
    public HoaDonChiTietDTO toDto(HoaDonChiTiet entity) {
        if (entity == null) return null;
        HoaDonChiTietDTO dto = new HoaDonChiTietDTO();
        dto.setId(entity.getId());
        dto.setHoaDonId(entity.getHoaDon() != null ? entity.getHoaDon().getId() : null);
        dto.setCongNoId(entity.getCongNo() != null ? entity.getCongNo().getId() : null);
        dto.setSoTien(entity.getSoTien());
        return dto;
    }

    public HoaDonChiTiet toEntity(HoaDonChiTietDTO dto) {
        if (dto == null) return null;
        HoaDonChiTiet entity = new HoaDonChiTiet();
        entity.setId(dto.getId());
        if (dto.getHoaDonId() != null) {
            HoaDon hd = new HoaDon(); hd.setId(dto.getHoaDonId()); entity.setHoaDon(hd);
        }
        if (dto.getCongNoId() != null) {
            CongNo cn = new CongNo(); cn.setId(dto.getCongNoId()); entity.setCongNo(cn);
        }
        entity.setSoTien(dto.getSoTien());
        return entity;
    }
}