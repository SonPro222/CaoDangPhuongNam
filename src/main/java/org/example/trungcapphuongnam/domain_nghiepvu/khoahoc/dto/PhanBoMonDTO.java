package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhanBoMonDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private Integer monHocId;
    private Integer kyHocId;
    private String loaiMon;
    private Integer nhomTuChonId;
    private Integer thuTu;
    private Integer tuanBatDau;
    private Integer tuanKetThuc;
}