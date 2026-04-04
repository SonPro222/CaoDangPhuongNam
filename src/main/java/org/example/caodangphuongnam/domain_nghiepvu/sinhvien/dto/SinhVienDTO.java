package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SinhVienDTO {
    private Integer id;
    private String maSv;
    private String ten;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String email;
    private String sdt;
    private Boolean kyLuatCamThi;
}