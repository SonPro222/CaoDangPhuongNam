package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "khoa_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class KhoaHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    private String ten;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
}