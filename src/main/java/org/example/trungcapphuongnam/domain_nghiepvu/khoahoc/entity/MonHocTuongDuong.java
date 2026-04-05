package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mon_hoc_tuong_duong")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MonHocTuongDuong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_cu_id", nullable = false)
    private ChuongTrinh chuongTrinhCu;

    @ManyToOne @JoinColumn(name = "chuong_trinh_moi_id", nullable = false)
    private ChuongTrinh chuongTrinhMoi;

    @ManyToOne @JoinColumn(name = "mon_cu_id", nullable = false)
    private MonHoc monCu;

    @ManyToOne @JoinColumn(name = "mon_moi_id", nullable = false)
    private MonHoc monMoi;

    private Double tyLeThayThe;
    private String ghiChu;
}