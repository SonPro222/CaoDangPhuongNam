package org.example.trungcapphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HocLieuDTO {
    private Integer id;
    private Integer baiHocId;
    private String tenTaiLieu;
    private String loaiFile;
    private String duongDanFile;
    private LocalDateTime ngayTaiLen;
    private Integer giangVienId;
}