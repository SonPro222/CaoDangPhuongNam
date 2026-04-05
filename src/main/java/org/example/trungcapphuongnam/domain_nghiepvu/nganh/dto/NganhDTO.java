package org.example.trungcapphuongnam.domain_nghiepvu.nganh.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NganhDTO {
    private Integer id;
    private String maNganh;
    private String ten;
    private String trangThai;
}