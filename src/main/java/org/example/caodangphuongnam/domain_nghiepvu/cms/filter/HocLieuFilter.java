package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HocLieuFilter extends BaseFilter {
    private Integer baiHocId;
    private Integer giangVienId;
    private String tenTaiLieu;
    private String loaiFile;
}