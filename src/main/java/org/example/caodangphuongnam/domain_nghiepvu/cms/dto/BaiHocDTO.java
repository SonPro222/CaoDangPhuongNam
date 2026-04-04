package org.example.caodangphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaiHocDTO {
    private Integer id;
    private Integer syllabusId;
    private String ten;
    private Integer thuTu;
    private Integer tongGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private String mucTieu;
}