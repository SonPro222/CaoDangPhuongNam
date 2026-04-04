package org.example.caodangphuongnam.domain_nghiepvu.log.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminLogDTO {
    private Integer id;
    private Integer nguoiDungId;
    private String hanhDong;
    private String bang;
    private Integer recordId;
    private String duLieuCu;
    private String duLieuMoi;
    private LocalDateTime createdAt;
}