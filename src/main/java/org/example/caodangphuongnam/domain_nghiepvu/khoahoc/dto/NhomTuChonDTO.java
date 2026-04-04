package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NhomTuChonDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private String maNhom;
    private String tenNhom;
    private Integer soMonYeuCau;
}