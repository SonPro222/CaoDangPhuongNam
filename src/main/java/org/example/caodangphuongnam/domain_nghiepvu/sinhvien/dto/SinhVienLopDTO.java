package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SinhVienLopDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer lopId;
    private LocalDate ngayVao;
    private LocalDate ngayRa;
    private String trangThai;
    private LocalDateTime createdAt;
}