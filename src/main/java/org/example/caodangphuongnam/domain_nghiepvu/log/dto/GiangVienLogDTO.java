package org.example.caodangphuongnam.domain_nghiepvu.log.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GiangVienLogDTO {
    private Integer id;
    private Integer nguoiDungId;
    private String hanhDong;
    private String doiTuong;
    private Integer doiTuongId;
    private String noiDungCu;
    private String noiDungMoi;
    private LocalDateTime createdAt;
}