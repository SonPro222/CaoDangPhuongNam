package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaiThiDTO {
    private Integer id;
    private Integer lopMonId;
    private String ten;
    private String loai;
    private LocalDate ngay;
}