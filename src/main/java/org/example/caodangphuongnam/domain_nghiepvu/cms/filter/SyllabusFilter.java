package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SyllabusFilter extends BaseFilter {
    private Integer monHocId;
    private String keyword; // Dùng để tìm kiếm chung cho tên hoặc mã môn
    private String trangThai;
}