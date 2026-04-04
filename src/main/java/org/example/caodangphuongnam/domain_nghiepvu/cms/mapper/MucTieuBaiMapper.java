package org.example.caodangphuongnam.domain_nghiepvu.cms.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.MucTieuBaiDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.MucTieuBai;
import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import org.springframework.stereotype.Component;

@Component
public class MucTieuBaiMapper {
    public MucTieuBaiDTO toDto(MucTieuBai entity) {
        if (entity == null) return null;
        MucTieuBaiDTO dto = new MucTieuBaiDTO();
        dto.setId(entity.getId());
        dto.setBaiHocId(entity.getBaiHoc() != null ? entity.getBaiHoc().getId() : null);
        dto.setLoai(entity.getLoai());
        dto.setNoiDung(entity.getNoiDung());
        return dto;
    }

    public MucTieuBai toEntity(MucTieuBaiDTO dto) {
        if (dto == null) return null;
        MucTieuBai entity = new MucTieuBai();
        entity.setId(dto.getId());
        if (dto.getBaiHocId() != null) {
            BaiHoc bh = new BaiHoc(); bh.setId(dto.getBaiHocId()); entity.setBaiHoc(bh);
        }
        entity.setLoai(dto.getLoai());
        entity.setNoiDung(dto.getNoiDung());
        return entity;
    }
}