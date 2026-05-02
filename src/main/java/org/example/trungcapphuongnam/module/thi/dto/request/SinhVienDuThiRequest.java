package org.example.trungcapphuongnam.module.thi.dto.request;

import org.example.trungcapphuongnam.common.enums.SinhVienDuThiTrangThai;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVienDuThiRequest {
    @NotNull
    private Long lichThiId;
    @NotNull
    private Long sinhVienId;
    private Boolean duDieuKienThi;
    private String lyDoKhongDuDieuKien;
    private SinhVienDuThiTrangThai trangThai;
}
