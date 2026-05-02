package org.example.trungcapphuongnam.module.giangDay.dto.request;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;
import org.example.trungcapphuongnam.common.enums.TrangThaiDiemDanh;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiemDanhRequest {
    private Long lichHocId;
    private Long sinhVienId;
    private TrangThaiDiemDanh trangThai;
    private String ghiChu;
    private LocalDateTime thoiGianDiemDanh;
}
