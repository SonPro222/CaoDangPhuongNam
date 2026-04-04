package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diem_thanh_phan")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DiemThanhPhan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "dang_ky_hoc_id", nullable = false)
    private DangKyHoc dangKyHoc;

    @ManyToOne @JoinColumn(name = "thanh_phan_diem_id", nullable = false)
    private ThanhPhanDiem thanhPhanDiem;

    private Double diem;
}