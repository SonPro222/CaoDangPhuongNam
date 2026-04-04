package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.mapper;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto.KetQuaThiDTO;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.KetQuaThi;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.BaiThi;
import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.DangKyHoc;
import org.springframework.stereotype.Component;

@Component
public class KetQuaThiMapper {
    public KetQuaThiDTO toDto(KetQuaThi entity) {
        if (entity == null) return null;
        KetQuaThiDTO dto = new KetQuaThiDTO();
        dto.setId(entity.getId());
        dto.setBaiThiId(entity.getBaiThi() != null ? entity.getBaiThi().getId() : null);
        dto.setDangKyHocId(entity.getDangKyHoc() != null ? entity.getDangKyHoc().getId() : null);
        dto.setDiem(entity.getDiem());
        return dto;
    }

    public KetQuaThi toEntity(KetQuaThiDTO dto) {
        if (dto == null) return null;
        KetQuaThi entity = new KetQuaThi();
        entity.setId(dto.getId());
        if (dto.getBaiThiId() != null) {
            BaiThi bt = new BaiThi(); bt.setId(dto.getBaiThiId()); entity.setBaiThi(bt);
        }
        if (dto.getDangKyHocId() != null) {
            DangKyHoc dkh = new DangKyHoc(); dkh.setId(dto.getDangKyHocId()); entity.setDangKyHoc(dkh);
        }
        entity.setDiem(dto.getDiem());
        return entity;
    }
}