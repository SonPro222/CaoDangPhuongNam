package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaiNopSinhVienDTO {
    private Integer id;
    private Integer dangKyHocId;
    private Integer baiHocId;
    private String duongDanFile;
    private LocalDateTime thoiGianNop;
    private Double diemDanhGia;
    private String nhanXetGv;
}