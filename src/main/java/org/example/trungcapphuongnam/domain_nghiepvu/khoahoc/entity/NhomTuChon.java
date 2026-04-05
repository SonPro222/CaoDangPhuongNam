package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nhom_tu_chon")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class NhomTuChon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    private String maNhom;
    private String tenNhom;
    private Integer soMonYeuCau;
}