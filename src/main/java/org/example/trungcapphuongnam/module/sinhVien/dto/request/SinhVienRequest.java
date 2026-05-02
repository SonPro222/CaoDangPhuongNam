package org.example.trungcapphuongnam.module.sinhVien.dto.request;

import org.example.trungcapphuongnam.common.enums.GioiTinh;
import org.example.trungcapphuongnam.common.enums.SinhVienTrangThai;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVienRequest {
    @NotBlank(message = "Mã sinh viên không được để trống")
    private String maSinhVien;

    @NotBlank(message = "Họ tên không được để trống")
    private String hoTen;

    private LocalDate ngaySinh;
    private GioiTinh gioiTinh;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    private String soDienThoai;
    private String diaChi;
    private SinhVienTrangThai trangThai;
    private Long taiKhoanId;
}
