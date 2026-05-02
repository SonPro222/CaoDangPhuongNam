package org.example.trungcapphuongnam.module.chuongTrinh.dto;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MucTieuChuongTrinhResponse {

    private Long id;

    private Long chuongTrinhVersionId;

    private String loai;

    private String noiDung;

    private Integer thuTu;

}
