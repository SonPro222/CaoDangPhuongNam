package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.BaiThiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.BaiThi;
import org.springframework.stereotype.Component;

@Component
public class BaiThiMapper {
    public BaiThiDTO toDto(BaiThi entity) {
        if (entity == null) return null;
        BaiThiDTO dto = new BaiThiDTO();
        dto.setId(entity.getId());
        dto.setLopMonId(entity.getLopMon() != null ? entity.getLopMon().getId() : null);
        dto.setTen(entity.getTen());
        dto.setLoai(entity.getLoai());
        dto.setNgay(entity.getNgay());
        return dto;
    }

    public BaiThi toEntity(BaiThiDTO dto) {
        if (dto == null) return null;
        BaiThi entity = new BaiThi();
        entity.setId(dto.getId());
        if (dto.getLopMonId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon lm = new org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon();
            lm.setId(dto.getLopMonId()); entity.setLopMon(lm);
        }
        entity.setTen(dto.getTen());
        entity.setLoai(dto.getLoai());
        entity.setNgay(dto.getNgay());
        return entity;
    }
}