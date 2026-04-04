package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HocKyThucTeDTO {
    private Integer id;
    private String maHocKy;
    private String ten;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
}