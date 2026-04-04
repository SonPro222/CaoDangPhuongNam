package org.example.caodangphuongnam.domain_nghiepvu.taichinh.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HocPhiDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private Integer kyHocId;
    private Integer monHocId;
    private String loai;
    private BigDecimal soTien;
    private String moTa;
    private LocalDateTime createdAt;
}