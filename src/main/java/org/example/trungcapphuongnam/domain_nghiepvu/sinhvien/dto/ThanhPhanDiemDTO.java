package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThanhPhanDiemDTO {
    private Integer id;
    private Integer monHocId;
    private String ten;
    private String loai;
    private Double trongSo;
}