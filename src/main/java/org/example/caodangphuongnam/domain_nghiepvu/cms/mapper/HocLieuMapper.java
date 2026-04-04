package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.HocLieuDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.HocLieu;
import org.springframework.stereotype.Component;

@Component
public class HocLieuMapper {
    public HocLieuDTO toDto(HocLieu entity) {
        if (entity == null) return null;
        HocLieuDTO dto = new HocLieuDTO();
        dto.setId(entity.getId());
        dto.setBaiHocId(entity.getBaiHoc() != null ? entity.getBaiHoc().getId() : null);
        dto.setTenTaiLieu(entity.getTenTaiLieu());
        dto.setLoaiFile(entity.getLoaiFile());
        dto.setDuongDanFile(entity.getDuongDanFile());
        dto.setNgayTaiLen(entity.getNgayTaiLen());
        dto.setGiangVienId(entity.getGiangVien() != null ? entity.getGiangVien().getId() : null);
        return dto;
    }

    public HocLieu toEntity(HocLieuDTO dto) {
        if (dto == null) return null;
        HocLieu entity = new HocLieu();
        entity.setId(dto.getId());
        if (dto.getBaiHocId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc bh = new org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc();
            bh.setId(dto.getBaiHocId()); entity.setBaiHoc(bh);
        }
        entity.setTenTaiLieu(dto.getTenTaiLieu());
        entity.setLoaiFile(dto.getLoaiFile());
        entity.setDuongDanFile(dto.getDuongDanFile());
        entity.setNgayTaiLen(dto.getNgayTaiLen());
        if (dto.getGiangVienId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity.GiangVien gv = new org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity.GiangVien();
            gv.setId(dto.getGiangVienId()); entity.setGiangVien(gv);
        }
        return entity;
    }
}