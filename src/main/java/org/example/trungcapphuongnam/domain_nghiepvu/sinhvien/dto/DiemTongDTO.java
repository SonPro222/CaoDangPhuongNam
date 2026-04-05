package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiemTongDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer lopMonId;
    private Integer dangKyHocId;
    private Double tongDiem;
    private String ketQua;
}