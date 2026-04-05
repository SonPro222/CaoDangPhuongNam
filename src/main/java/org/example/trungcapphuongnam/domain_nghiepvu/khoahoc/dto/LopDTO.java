package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LopDTO {
    private Integer id;
    private Integer khoaHocId;
    private String maLop;
    private String ten;
    private Integer siSoToiDa;
}