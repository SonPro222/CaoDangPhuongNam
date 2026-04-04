package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "dang_ky_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DangKyHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "lop_mon_id", nullable = false)
    private LopMon lopMon;

    private LocalDate ngayDangKy = LocalDate.now();
    private String trangThai;
    private Integer lanHoc = 1;
    private Double diemChuyenCan;
    private Double diemTrungBinh;
    private String ketQua;
}