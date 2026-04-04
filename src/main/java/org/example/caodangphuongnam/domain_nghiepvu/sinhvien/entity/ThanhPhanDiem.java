package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "thanh_phan_diem")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ThanhPhanDiem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    private String ten;
    private String loai;
    private Double trongSo;
}