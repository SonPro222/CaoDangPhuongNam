package org.example.caodangphuongnam.domain_nghiepvu.taichinh.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonDTO {
    private Integer id;
    private Integer sinhVienId;
    private BigDecimal tongTien;
    private LocalDateTime ngayXuat;
    private String trangThai;
    private LocalDateTime createdAt;
}