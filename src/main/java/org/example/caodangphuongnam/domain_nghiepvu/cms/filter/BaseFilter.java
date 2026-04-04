package org.example.caodangphuongnam.domain_nghiepvu.cms.filter;

import lombok.Data;

@Data
public class BaseFilter {
    private int page = 0;       // Trang hiện tại (bắt đầu từ 0)
    private int size = 15;      // Số lượng bản ghi trên mỗi trang (10-15 theo yêu cầu)
    private String sortBy = "id"; // Trường dùng để sắp xếp mặc định
    private String sortDir = "desc"; // Chiều sắp xếp mặc định (desc/asc)
}