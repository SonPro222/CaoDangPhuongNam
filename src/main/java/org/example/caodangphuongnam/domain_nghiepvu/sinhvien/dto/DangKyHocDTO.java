package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DangKyHocDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer lopMonId;
    private LocalDate ngayDangKy;
    private String trangThai;
    private Integer lanHoc;
    private Double diemChuyenCan;
    private Double diemTrungBinh;
    private String ketQua;
}