package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KyHocDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private String ten;
    private Integer thuTu;
}