package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaiHocFilter extends BaseFilter {
    private Integer syllabusId;
    private String tenBaiHoc;
}