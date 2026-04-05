package org.example.trungcapphuongnam.domain_nghiepvu.thanhtoan.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThanhToanDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer congNoId;
    private BigDecimal soTien;
    private String phuongThuc;
    private String maGiaoDich;
    private LocalDateTime ngayThanhToan;
    private Integer nguoiThuId;
}