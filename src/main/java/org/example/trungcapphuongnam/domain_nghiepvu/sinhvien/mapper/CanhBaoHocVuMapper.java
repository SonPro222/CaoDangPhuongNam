package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto.CanhBaoHocVuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.CanhBaoHocVu;
import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.springframework.stereotype.Component;

@Component
public class CanhBaoHocVuMapper {
    public CanhBaoHocVuDTO toDto(CanhBaoHocVu entity) {
        if (entity == null) return null;
        CanhBaoHocVuDTO dto = new CanhBaoHocVuDTO();
        dto.setId(entity.getId());
        dto.setSinhVienId(entity.getSinhVien() != null ? entity.getSinhVien().getId() : null);
        dto.setHocKyId(entity.getHocKy() != null ? entity.getHocKy().getId() : null);
        dto.setMucDo(entity.getMucDo());
        dto.setLyDo(entity.getLyDo());
        dto.setNgayCanhBao(entity.getNgayCanhBao());
        dto.setTrangThai(entity.getTrangThai());
        return dto;
    }

    public CanhBaoHocVu toEntity(CanhBaoHocVuDTO dto) {
        if (dto == null) return null;
        CanhBaoHocVu entity = new CanhBaoHocVu();
        entity.setId(dto.getId());
        if (dto.getSinhVienId() != null) {
            SinhVien sv = new SinhVien(); sv.setId(dto.getSinhVienId()); entity.setSinhVien(sv);
        }
        if (dto.getHocKyId() != null) {
            org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe hk = new org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe();
            hk.setId(dto.getHocKyId()); entity.setHocKy(hk);
        }
        entity.setMucDo(dto.getMucDo());
        entity.setLyDo(dto.getLyDo());
        entity.setNgayCanhBao(dto.getNgayCanhBao());
        entity.setTrangThai(dto.getTrangThai());
        return entity;
    }
}