package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "hoc_ky_thuc_te")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HocKyThucTe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String maHocKy;
    private String ten;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
}