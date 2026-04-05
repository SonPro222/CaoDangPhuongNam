package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChungChiDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private String ten;
}