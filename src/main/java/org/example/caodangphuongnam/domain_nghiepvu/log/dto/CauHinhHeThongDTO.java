package org.example.caodangphuongnam.domain_nghiepvu.log.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CauHinhHeThongDTO {
    private Integer id;
    private Boolean choNoTienQuyet;
    private Integer soMonNoToiDa;
}