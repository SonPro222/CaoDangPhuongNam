package org.example.trungcapphuongnam.module.giangDay.dto.response;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;
import org.example.trungcapphuongnam.common.enums.TrangThaiGiaoVien;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GiaoVienResponse {
    private Long id;
    private String maGiaoVien;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String chuyenMon;
    private TrangThaiGiaoVien trangThai;
    private Long taiKhoanId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
