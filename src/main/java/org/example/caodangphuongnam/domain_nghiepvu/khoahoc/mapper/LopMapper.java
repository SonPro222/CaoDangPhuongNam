package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto.LopDTO;
import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.*;
import org.springframework.stereotype.Component;

@Component
public class LopMapper {
    public LopDTO toDto(Lop entity) {
        if (entity == null) return null;
        LopDTO dto = new LopDTO();
        dto.setId(entity.getId());
        dto.setKhoaHocId(entity.getKhoaHoc() != null ? entity.getKhoaHoc().getId() : null);
        dto.setMaLop(entity.getMaLop());
        dto.setTen(entity.getTen());
        dto.setSiSoToiDa(entity.getSiSoToiDa());
        return dto;
    }

    public Lop toEntity(LopDTO dto) {
        if (dto == null) return null;
        Lop entity = new Lop();
        entity.setId(dto.getId());
        if (dto.getKhoaHocId() != null) {
            KhoaHoc kh = new KhoaHoc(); kh.setId(dto.getKhoaHocId()); entity.setKhoaHoc(kh);
        }
        entity.setMaLop(dto.getMaLop());
        entity.setTen(dto.getTen());
        entity.setSiSoToiDa(dto.getSiSoToiDa());
        return entity;
    }
}