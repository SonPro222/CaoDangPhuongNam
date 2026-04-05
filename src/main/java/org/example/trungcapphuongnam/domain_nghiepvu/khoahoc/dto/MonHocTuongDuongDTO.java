package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonHocTuongDuongDTO {
    private Integer id;
    private Integer chuongTrinhCuId;
    private Integer chuongTrinhMoiId;
    private Integer monCuId;
    private Integer monMoiId;
    private Double tyLeThayThe;
    private String ghiChu;
}