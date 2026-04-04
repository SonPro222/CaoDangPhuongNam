package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonTienQuyetDTO {
    private Integer id;
    private Integer chuongTrinhId;
    private Integer monHocId;
    private Integer monTienQuyetId;
    private String loaiDieuKien;
}