package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChungChiSinhVienDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer chungChiId;
    private LocalDate ngayCap;
    private String trangThai;
}