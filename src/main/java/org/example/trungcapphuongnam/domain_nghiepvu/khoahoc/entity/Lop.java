package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lop")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Lop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "khoa_hoc_id", nullable = false)
    private KhoaHoc khoaHoc;

    @Column(unique = true, nullable = false)
    private String maLop;
    private String ten;
    private Integer siSoToiDa;
}