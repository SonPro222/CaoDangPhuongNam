package org.example.trungcapphuongnam.domain_nghiepvu.log.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.log.dto.CauHinhHeThongDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.log.entity.CauHinhHeThong;
import org.springframework.stereotype.Component;

@Component
public class CauHinhHeThongMapper {
    public CauHinhHeThongDTO toDto(CauHinhHeThong entity) {
        if (entity == null) return null;
        CauHinhHeThongDTO dto = new CauHinhHeThongDTO();
        dto.setId(entity.getId());
        dto.setChoNoTienQuyet(entity.getChoNoTienQuyet());
        dto.setSoMonNoToiDa(entity.getSoMonNoToiDa());
        return dto;
    }

    public CauHinhHeThong toEntity(CauHinhHeThongDTO dto) {
        if (dto == null) return null;
        CauHinhHeThong entity = new CauHinhHeThong();
        entity.setId(dto.getId());
        entity.setChoNoTienQuyet(dto.getChoNoTienQuyet());
        entity.setSoMonNoToiDa(dto.getSoMonNoToiDa());
        return entity;
    }
}