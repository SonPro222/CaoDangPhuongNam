package org.example.trungcapphuongnam.module.thi.dto.request;

import org.example.trungcapphuongnam.common.enums.LichThiHinhThuc;
import org.example.trungcapphuongnam.common.enums.LichThiTrangThai;
import java.time.LocalDate;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LichThiRequest {
    @NotNull
    private Long lopHocPhanId;
    private Long baiKiemTraId;
    @NotNull
    private LocalDate ngayThi;
    private Long caHocId;
    private Long phongHocId;
    private LichThiHinhThuc hinhThucThi;
    private LichThiTrangThai trangThai;
    private String ghiChu;
}
