package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "hoc_phi")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HocPhi {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    @ManyToOne @JoinColumn(name = "ky_hoc_id")
    private KyHoc kyHoc;

    @ManyToOne @JoinColumn(name = "mon_hoc_id")
    private MonHoc monHoc;

    private String loai;
    private BigDecimal soTien;
    private String moTa;
    private LocalDateTime createdAt = LocalDateTime.now();
}