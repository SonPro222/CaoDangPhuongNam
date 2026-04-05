package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiemDanhDTO {
    private Integer id;
    private Integer dangKyHocId;
    private LocalDate ngay;
    private String trangThai;
    private Integer nguoiDiemDanhId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}