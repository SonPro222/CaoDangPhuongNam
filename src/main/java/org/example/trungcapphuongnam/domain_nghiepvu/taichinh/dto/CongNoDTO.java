package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.dto;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CongNoDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer hocPhiId;
    private BigDecimal soTienPhaiDong;
    private BigDecimal soTienDaDong;
    private LocalDate hanDong;
    private String trangThai;
    private LocalDateTime createdAt;
}