package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mon_hoc_chuan_dau_ra")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MonHocChuanDauRa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    @ManyToOne @JoinColumn(name = "chuan_dau_ra_id", nullable = false)
    private ChuanDauRa chuanDauRa;
}