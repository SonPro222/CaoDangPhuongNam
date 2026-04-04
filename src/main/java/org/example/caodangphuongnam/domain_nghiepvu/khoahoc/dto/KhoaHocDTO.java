package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KhoaHocDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private String ten;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
}