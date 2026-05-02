package org.example.trungcapphuongnam.module.thi.dto.request;

import org.example.trungcapphuongnam.common.enums.BaiThiSinhVienTrangThai;
import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaiThiSinhVienRequest {
    @NotNull
    private Long deThiId;
    @NotNull
    private Long sinhVienId;
    private String noiDungBaiLam;
    private String fileBaiLam;
    private LocalDateTime thoiGianBatDau;
    private LocalDateTime thoiGianNop;
    private BaiThiSinhVienTrangThai trangThai;
}
