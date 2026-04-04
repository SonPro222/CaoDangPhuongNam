package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.BaiHocDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.Syllabus;
import org.springframework.stereotype.Component;

@Component
public class BaiHocMapper {
    public BaiHocDTO toDto(BaiHoc entity) {
        if (entity == null) return null;
        BaiHocDTO dto = new BaiHocDTO();
        dto.setId(entity.getId());
        dto.setSyllabusId(entity.getSyllabus() != null ? entity.getSyllabus().getId() : null);
        dto.setTen(entity.getTen());
        dto.setThuTu(entity.getThuTu());
        dto.setTongGio(entity.getTongGio());
        dto.setGioLyThuyet(entity.getGioLyThuyet());
        dto.setGioThucHanh(entity.getGioThucHanh());
        dto.setGioKiemTra(entity.getGioKiemTra());
        dto.setMucTieu(entity.getMucTieu());
        return dto;
    }

    public BaiHoc toEntity(BaiHocDTO dto) {
        if (dto == null) return null;
        BaiHoc entity = new BaiHoc();
        entity.setId(dto.getId());
        if (dto.getSyllabusId() != null) {
            Syllabus s = new Syllabus(); s.setId(dto.getSyllabusId()); entity.setSyllabus(s);
        }
        entity.setTen(dto.getTen());
        entity.setThuTu(dto.getThuTu());
        entity.setTongGio(dto.getTongGio());
        entity.setGioLyThuyet(dto.getGioLyThuyet());
        entity.setGioThucHanh(dto.getGioThucHanh());
        entity.setGioKiemTra(dto.getGioKiemTra());
        entity.setMucTieu(dto.getMucTieu());
        return entity;
    }
}