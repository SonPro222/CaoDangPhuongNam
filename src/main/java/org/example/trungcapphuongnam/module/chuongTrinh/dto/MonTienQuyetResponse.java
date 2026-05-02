package org.example.trungcapphuongnam.module.chuongTrinh.dto;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MonTienQuyetResponse {

    private Long id;

    private Long monId;

    private Long monDieuKienId;

    private String loai;

    private String ghiChu;

}
