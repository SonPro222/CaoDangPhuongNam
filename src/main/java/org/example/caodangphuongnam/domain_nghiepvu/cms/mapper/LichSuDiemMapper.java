package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.LichSuDiemDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.LichSuDiem;
import org.springframework.stereotype.Component;

@Component
public class LichSuDiemMapper {
    public LichSuDiemDTO toDto(LichSuDiem entity) {
        if (entity == null) return null;
        LichSuDiemDTO dto = new LichSuDiemDTO();
        dto.setId(entity.getId());
        dto.setDiemThanhPhanId(entity.getDiemThanhPhan() != null ? entity.getDiemThanhPhan().getId() : null);
        dto.setDiemCu(entity.getDiemCu());
        dto.setDiemMoi(entity.getDiemMoi());
        dto.setNguoiSuaId(entity.getNguoiSua() != null ? entity.getNguoiSua().getId() : null);
        dto.setLyDo(entity.getLyDo());
        dto.setIpAddress(entity.getIpAddress());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public LichSuDiem toEntity(LichSuDiemDTO dto) {
        if (dto == null) return null;
        LichSuDiem entity = new LichSuDiem();
        entity.setId(dto.getId());
        if (dto.getDiemThanhPhanId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DiemThanhPhan dtp = new org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DiemThanhPhan();
            dtp.setId(dto.getDiemThanhPhanId()); entity.setDiemThanhPhan(dtp);
        }
        entity.setDiemCu(dto.getDiemCu());
        entity.setDiemMoi(dto.getDiemMoi());
        if (dto.getNguoiSuaId() != null) {
            org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung nd = new org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung();
            nd.setId(dto.getNguoiSuaId()); entity.setNguoiSua(nd);
        }
        entity.setLyDo(dto.getLyDo());
        entity.setIpAddress(dto.getIpAddress());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}