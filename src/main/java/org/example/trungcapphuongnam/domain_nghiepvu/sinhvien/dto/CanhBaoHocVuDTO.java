package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CanhBaoHocVuDTO {
    private Integer id;
    private Integer sinhVienId;
    private Integer hocKyId;
    private String mucDo;
    private String lyDo;
    private LocalDate ngayCanhBao;
    private String trangThai;
}