package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChuongTrinhDTO {
    private Integer id;
    private Integer nganhId;
    private String ten;
    private String version;
    private Integer thoiGianThang;
    private Boolean coKy;
    private Integer tongTinChi;
    private Integer tongGio;
    private String trangThai;
}