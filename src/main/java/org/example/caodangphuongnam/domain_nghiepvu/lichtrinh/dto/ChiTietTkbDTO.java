package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietTkbDTO {
    private Integer id;
    private Integer thoiKhoaBieuId;
    private Integer baiHocId;
}