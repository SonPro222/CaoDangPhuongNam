package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChuanDauRaDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private String maNangLuc;
    private String tenNangLuc;
    private String loaiNangLuc;
}