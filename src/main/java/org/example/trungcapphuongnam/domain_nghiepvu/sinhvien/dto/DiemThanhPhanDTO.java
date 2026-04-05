package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiemThanhPhanDTO {
    private Integer id;
    private Integer dangKyHocId;
    private Integer thanhPhanDiemId;
    private Double diem;
}