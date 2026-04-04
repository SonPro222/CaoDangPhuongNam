package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonHocDTO {
    private Integer id;
    private String maMon;
    private String ten;
    private String loaiHinh;
    private Integer soTinChi;
    private Integer tongSoGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private Boolean laMonDieuKien;
}