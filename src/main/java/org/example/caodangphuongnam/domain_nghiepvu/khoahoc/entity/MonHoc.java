package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mon_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MonHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String maMon;
    private String ten;
    private String loaiHinh;
    private Integer soTinChi;
    private Integer tongSoGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private Boolean laMonDieuKien = false;
}