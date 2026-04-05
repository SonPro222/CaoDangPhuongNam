package org.example.trungcapphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LichSuDiemDTO {
    private Integer id;
    private Integer diemThanhPhanId;
    private Double diemCu;
    private Double diemMoi;
    private Integer nguoiSuaId;
    private String lyDo;
    private String ipAddress;
    private LocalDateTime createdAt;
}