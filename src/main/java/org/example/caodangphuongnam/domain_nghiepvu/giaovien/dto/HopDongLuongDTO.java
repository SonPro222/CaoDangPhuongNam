package org.example.caodangphuongnam.domain_nghiepvu.giaovien.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HopDongLuongDTO {
    private Integer id;
    private Integer nhanSuId;
    private BigDecimal luongCoBan;
    private BigDecimal luongTheoGio;
    private String hinhThuc;
    private LocalDateTime createdAt;
}