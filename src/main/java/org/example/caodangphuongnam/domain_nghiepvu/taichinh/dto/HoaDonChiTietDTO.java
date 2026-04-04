package org.example.caodangphuongnam.domain_nghiepvu.taichinh.dto;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonChiTietDTO {
    private Integer id;
    private Integer hoaDonId;
    private Integer congNoId;
    private BigDecimal soTien;
}