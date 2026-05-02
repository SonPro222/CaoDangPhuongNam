package org.example.trungcapphuongnam.module.heThong.dto.response;

import lombok.*;
import java.time.*;
import org.example.trungcapphuongnam.common.enums.TrangThaiNhanVien;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NhanVienResponse {
    private Long id;
    private Long taiKhoanId;
    private String maNhanVien;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String phongBan;
    private String chucVu;
    private TrangThaiNhanVien trangThai;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
