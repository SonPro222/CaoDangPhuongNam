package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KetQuaMonDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer monHocId;
    private Double diemCaoNhat;
    private String trangThai;
}