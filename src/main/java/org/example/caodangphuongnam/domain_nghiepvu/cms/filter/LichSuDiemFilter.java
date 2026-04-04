package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class LichSuDiemFilter extends BaseFilter {
    private Integer diemThanhPhanId;
    private Integer nguoiSuaId;
}