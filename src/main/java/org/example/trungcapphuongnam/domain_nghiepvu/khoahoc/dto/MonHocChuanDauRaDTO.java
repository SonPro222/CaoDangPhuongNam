package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonHocChuanDauRaDTO {
    private Integer id;
    private Integer monHocId;
    private Integer chuanDauRaId;
}