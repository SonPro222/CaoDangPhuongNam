package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diem_tong")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DiemTong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "lop_mon_id", nullable = false)
    private LopMon lopMon;

    @ManyToOne @JoinColumn(name = "dang_ky_hoc_id", nullable = false)
    private DangKyHoc dangKyHoc;

    private Double tongDiem;
    private String ketQua;
}