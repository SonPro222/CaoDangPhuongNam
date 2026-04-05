package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto.MonTienQuyetDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class MonTienQuyetMapper {
    public MonTienQuyetDTO toDto(MonTienQuyet entity) {
        if (entity == null) return null;
        MonTienQuyetDTO dto = new MonTienQuyetDTO();
        dto.setId(entity.getId());
        dto.setChuongTrinhId(entity.getChuongTrinh() != null ? entity.getChuongTrinh().getId() : null);
        dto.setMonHocId(entity.getMonHoc() != null ? entity.getMonHoc().getId() : null);
        dto.setMonTienQuyetId(entity.getMonTienQuyet() != null ? entity.getMonTienQuyet().getId() : null);
        dto.setLoaiDieuKien(entity.getLoaiDieuKien());
        return dto;
    }

    public MonTienQuyet toEntity(MonTienQuyetDTO dto) {
        if (dto == null) return null;
        MonTienQuyet entity = new MonTienQuyet();
        entity.setId(dto.getId());
        if (dto.getChuongTrinhId() != null) {
            ChuongTrinh ct = new ChuongTrinh(); ct.setId(dto.getChuongTrinhId()); entity.setChuongTrinh(ct);
        }
        if (dto.getMonHocId() != null) {
            MonHoc mh = new MonHoc(); mh.setId(dto.getMonHocId()); entity.setMonHoc(mh);
        }
        if (dto.getMonTienQuyetId() != null) {
            MonHoc mtq = new MonHoc(); mtq.setId(dto.getMonTienQuyetId()); entity.setMonTienQuyet(mtq);
        }
        entity.setLoaiDieuKien(dto.getLoaiDieuKien());
        return entity;
    }
}