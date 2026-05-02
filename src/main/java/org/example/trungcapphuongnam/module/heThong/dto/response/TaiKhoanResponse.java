package org.example.trungcapphuongnam.module.heThong.dto.response;

import lombok.*;
import java.time.*;
import org.example.trungcapphuongnam.common.enums.LoaiTaiKhoan;
import org.example.trungcapphuongnam.common.enums.TrangThaiTaiKhoan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaiKhoanResponse {
    private Long id;
    private String email;
    private String matKhauHash;
    private LoaiTaiKhoan loaiTaiKhoan;
    private TrangThaiTaiKhoan trangThai;
    private LocalDateTime lanDangNhapCuoi;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
