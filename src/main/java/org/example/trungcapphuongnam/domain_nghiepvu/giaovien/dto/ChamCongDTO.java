package org.example.trungcapphuongnam.domain_nghiepvu.giaovien.dto;

import lombok.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChamCongDTO {
    private Integer id;
    private Integer nhanSuId;
    private LocalDate ngay;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private Double soGio;
    private String trangThai;
    private LocalDateTime createdAt;
}