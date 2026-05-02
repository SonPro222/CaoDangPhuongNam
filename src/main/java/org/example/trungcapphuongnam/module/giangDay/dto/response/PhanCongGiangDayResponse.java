package org.example.trungcapphuongnam.module.giangDay.dto.response;

import lombok.*;
import java.time.*;
import java.math.BigDecimal;
import org.example.trungcapphuongnam.common.enums.VaiTroGiangDay;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhanCongGiangDayResponse {
    private Long id;
    private Long lopHocPhanId;
    private Long giaoVienId;
    private VaiTroGiangDay vaiTro;
    private LocalDateTime createdAt;
}
