package org.example.trungcapphuongnam.module.sinhVien.dto.request;

import org.example.trungcapphuongnam.common.enums.SinhVienChuongTrinhTrangThai;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVienChuongTrinhRequest {
    @NotNull(message = "Sinh viên không được để trống")
    private Long sinhVienId;

    @NotNull(message = "Chương trình version không được để trống")
    private Long chuongTrinhVersionId;

    private Long lopHanhChinhId;
    private LocalDate ngayDangKy;
    private LocalDate ngayNhapHoc;
    private SinhVienChuongTrinhTrangThai trangThai;
    private String ghiChu;
}
