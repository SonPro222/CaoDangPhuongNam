package org.example.caodangphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LichSuThoiKhoaBieuDTO {
    private Integer id;
    private Integer lopMonId;
    private LocalDate ngayCu;
    private LocalTime gioBatDauCu;
    private LocalTime gioKetThucCu;
    private LocalDate ngayMoi;
    private LocalTime gioBatDauMoi;
    private LocalTime gioKetThucMoi;
    private String phongCu;
    private String phongMoi;
    private Integer nguoiSuaId;
    private LocalDateTime createdAt;
}