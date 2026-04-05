package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.DiemThanhPhanDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.DiemThanhPhan;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.ThanhPhanDiem;
import org.springframework.stereotype.Component;

@Component
public class DiemThanhPhanMapper {
    public DiemThanhPhanDTO toDto(DiemThanhPhan entity) {
        if (entity == null) return null;
        DiemThanhPhanDTO dto = new DiemThanhPhanDTO();
        dto.setId(entity.getId());
        dto.setDangKyHocId(entity.getDangKyHoc() != null ? entity.getDangKyHoc().getId() : null);
        dto.setThanhPhanDiemId(entity.getThanhPhanDiem() != null ? entity.getThanhPhanDiem().getId() : null);
        dto.setDiem(entity.getDiem());
        return dto;
    }

    public DiemThanhPhan toEntity(DiemThanhPhanDTO dto) {
        if (dto == null) return null;
        DiemThanhPhan entity = new DiemThanhPhan();
        entity.setId(dto.getId());
        if (dto.getDangKyHocId() != null) {
            DangKyHoc dkh = new DangKyHoc(); dkh.setId(dto.getDangKyHocId()); entity.setDangKyHoc(dkh);
        }
        if (dto.getThanhPhanDiemId() != null) {
            ThanhPhanDiem tpd = new ThanhPhanDiem(); tpd.setId(dto.getThanhPhanDiemId()); entity.setThanhPhanDiem(tpd);
        }
        entity.setDiem(dto.getDiem());
        return entity;
    }
}