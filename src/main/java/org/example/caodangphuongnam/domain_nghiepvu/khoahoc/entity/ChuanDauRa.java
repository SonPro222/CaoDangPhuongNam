package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chuan_dau_ra")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChuanDauRa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    private String maNangLuc;
    private String tenNangLuc;
    private String loaiNangLuc;
}