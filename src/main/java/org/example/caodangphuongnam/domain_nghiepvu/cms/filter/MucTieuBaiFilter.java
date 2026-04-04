package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MucTieuBaiFilter extends BaseFilter {
    private Integer baiHocId;
    private String loai;
}