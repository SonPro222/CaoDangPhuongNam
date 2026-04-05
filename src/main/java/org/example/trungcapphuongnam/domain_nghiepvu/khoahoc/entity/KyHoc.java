package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ky_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class KyHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    private String ten;
    private Integer thuTu;
}