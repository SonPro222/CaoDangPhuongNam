package org.example.caodangphuongnam.domain_nghiepvu.phongban.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NguoiDungDTO {
    private Integer id;
    private String tenDangNhap;
    private String matKhau;
    private String vaiTro;
    private Integer phongBanId;
}