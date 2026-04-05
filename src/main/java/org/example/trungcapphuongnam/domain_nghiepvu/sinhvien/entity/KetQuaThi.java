package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ket_qua_thi")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class KetQuaThi {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "bai_thi_id", nullable = false)
    private BaiThi baiThi;

    @ManyToOne @JoinColumn(name = "dang_ky_hoc_id", nullable = false)
    private DangKyHoc dangKyHoc;

    private Double diem;
}