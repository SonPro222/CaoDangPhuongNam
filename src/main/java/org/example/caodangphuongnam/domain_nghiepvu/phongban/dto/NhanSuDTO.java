package org.example.caodangphuongnam.domain_nghiepvu.phongban.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NhanSuDTO {
    private Integer id;
    private String ten;
    private String loai;
    private Integer nguoiDungId;
    private Integer phongBanId;
    private String trangThai;
    private LocalDateTime createdAt;
}