package org.example.trungcapphuongnam.domain_nghiepvu.doanhthu.dto;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoanhThuDTO {
    private Integer id;
    private LocalDate ngay;
    private BigDecimal tongTien;
    private String loai;
    private LocalDateTime createdAt;
}