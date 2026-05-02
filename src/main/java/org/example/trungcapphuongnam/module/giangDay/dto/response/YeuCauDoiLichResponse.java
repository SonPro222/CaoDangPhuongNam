package org.example.trungcapphuongnam.module.giangDay.dto.response;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;
import org.example.trungcapphuongnam.common.enums.TrangThaiYeuCauDoiLich;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YeuCauDoiLichResponse {
    private Long id;
    private Long lichHocCuId;
    private Long giaoVienId;
    private LocalDate ngayMoi;
    private Long caHocMoiId;
    private Long phongHocMoiId;
    private String lyDo;
    private TrangThaiYeuCauDoiLich trangThai;
    private Long nguoiDuyetId;
    private LocalDateTime ngayDuyet;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
