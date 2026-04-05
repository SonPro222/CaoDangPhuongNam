package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KetQuaThiDTO {
    private Integer id;
    private Integer baiThiId;
    private Integer dangKyHocId;
    private Double diem;
}