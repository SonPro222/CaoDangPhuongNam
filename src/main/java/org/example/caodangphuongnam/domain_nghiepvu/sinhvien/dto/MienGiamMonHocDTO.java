package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MienGiamMonHocDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer monHocId;
    private String lyDo;
    private String fileMinhChung;
    private String trangThai;
    private Integer nguoiDuyetId;
    private LocalDateTime createdAt;
}