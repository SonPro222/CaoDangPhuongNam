package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuyetDinhBaoLuuDTO {
    private Integer id;
    private Integer sinhVienId;
    private LocalDate ngayBatDau;
    private LocalDate ngayHetHan;
    private String lyDo;
    private String trangThai;
    private Integer nguoiDuyetId;
}