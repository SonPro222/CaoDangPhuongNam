package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class LichSuThoiKhoaBieuFilter extends BaseFilter {
    private Integer lopMonId;
    private Integer nguoiSuaId;
    private LocalDate tuNgay; // Tìm kiếm theo khoảng thời gian
    private LocalDate denNgay;
}