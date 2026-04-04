package org.example.caodangphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoiDungBaiDTO {
    private Integer id;
    private Integer baiHocId;
    private String loai;
    private String tieuDe;
    private String noiDung;
}