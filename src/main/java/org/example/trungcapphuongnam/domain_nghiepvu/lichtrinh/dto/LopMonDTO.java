package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LopMonDTO {
    private Integer id;
    private String maLopMon;
    private Integer lopId;
    private Integer monHocId;
    private Integer giangVienId;
    private Integer hocKyThucTeId;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private Integer siSoToiDa;
    private String trangThai;
}