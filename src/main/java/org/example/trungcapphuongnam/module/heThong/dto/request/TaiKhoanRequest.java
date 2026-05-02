package org.example.trungcapphuongnam.module.heThong.dto.request;

import lombok.*;
import java.time.*;
import org.example.trungcapphuongnam.common.enums.LoaiTaiKhoan;
import org.example.trungcapphuongnam.common.enums.TrangThaiTaiKhoan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaiKhoanRequest {
    private String email;
    private String matKhauHash;
    private LoaiTaiKhoan loaiTaiKhoan;
    private TrangThaiTaiKhoan trangThai;
    private LocalDateTime lanDangNhapCuoi;
}
