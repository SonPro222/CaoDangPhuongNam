package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phan_bo_mon")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PhanBoMon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    @ManyToOne @JoinColumn(name = "ky_hoc_id")
    private KyHoc kyHoc;

    private String loaiMon;

    @ManyToOne @JoinColumn(name = "nhom_tu_chon_id")
    private NhomTuChon nhomTuChon;

    private Integer thuTu;
    private Integer tuanBatDau;
    private Integer tuanKetThuc;
}