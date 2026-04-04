package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "chung_chi_sinh_vien")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChungChiSinhVien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "chung_chi_id", nullable = false)
    private ChungChi chungChi;

    private LocalDate ngayCap;
    private String trangThai;
}