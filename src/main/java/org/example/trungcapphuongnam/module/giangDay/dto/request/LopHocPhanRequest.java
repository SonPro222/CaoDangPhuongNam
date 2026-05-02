package org.example.trungcapphuongnam.module.giangDay.dto.request;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;
import org.example.trungcapphuongnam.common.enums.TrangThaiLopHocPhan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LopHocPhanRequest {
    private Long chuongTrinhMonId;
    private String maLop;
    private String tenLop;
    private Integer soLuongToiDa;
    private Integer soLuongHienTai;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private TrangThaiLopHocPhan trangThai;
}
