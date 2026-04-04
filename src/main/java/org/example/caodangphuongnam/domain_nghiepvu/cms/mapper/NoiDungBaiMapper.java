package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.NoiDungBaiDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.NoiDungBai;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import org.springframework.stereotype.Component;

@Component
public class NoiDungBaiMapper {
    public NoiDungBaiDTO toDto(NoiDungBai entity) {
        if (entity == null) return null;
        NoiDungBaiDTO dto = new NoiDungBaiDTO();
        dto.setId(entity.getId());
        dto.setBaiHocId(entity.getBaiHoc() != null ? entity.getBaiHoc().getId() : null);
        dto.setLoai(entity.getLoai());
        dto.setTieuDe(entity.getTieuDe());
        dto.setNoiDung(entity.getNoiDung());
        return dto;
    }

    public NoiDungBai toEntity(NoiDungBaiDTO dto) {
        if (dto == null) return null;
        NoiDungBai entity = new NoiDungBai();
        entity.setId(dto.getId());
        if (dto.getBaiHocId() != null) {
            BaiHoc bh = new BaiHoc(); bh.setId(dto.getBaiHocId()); entity.setBaiHoc(bh);
        }
        entity.setLoai(dto.getLoai());
        entity.setTieuDe(dto.getTieuDe());
        entity.setNoiDung(dto.getNoiDung());
        return entity;
    }
}