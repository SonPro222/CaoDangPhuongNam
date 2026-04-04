package org.example.caodangphuongnam.domain_nghiepvu.giaovien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GiangVienDTO {
    private Integer id;
    private String maGv;
    private Integer nguoiDungId;
    private String ten;
    private String email;
    private String sdt;
}