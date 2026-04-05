package org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mon_tien_quyet")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MonTienQuyet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    @ManyToOne @JoinColumn(name = "mon_tien_quyet_id", nullable = false)
    private MonHoc monTienQuyet;

    private String loaiDieuKien;
}