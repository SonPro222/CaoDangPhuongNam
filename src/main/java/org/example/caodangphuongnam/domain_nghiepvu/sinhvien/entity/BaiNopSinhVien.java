package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bai_nop_sinh_vien")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BaiNopSinhVien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "dang_ky_hoc_id", nullable = false)
    private DangKyHoc dangKyHoc;

    @ManyToOne @JoinColumn(name = "bai_hoc_id", nullable = false)
    private BaiHoc baiHoc;

    private String duongDanFile;
    private LocalDateTime thoiGianNop = LocalDateTime.now();
    private Double diemDanhGia;
    private String nhanXetGv;
}