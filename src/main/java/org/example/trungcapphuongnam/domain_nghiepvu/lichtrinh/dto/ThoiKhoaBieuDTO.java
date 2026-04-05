package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.dto;

import lombok.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThoiKhoaBieuDTO {
    private Integer id;
    private Integer lopMonId;
    private LocalDate ngay;
    private String caHoc;
    private LocalTime gioBatDau;
    private LocalTime gioKetThuc;
    private String phong;
}