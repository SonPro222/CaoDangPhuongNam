package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "hoa_don_chi_tiet")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HoaDonChiTiet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "hoa_don_id", nullable = false)
    private HoaDon hoaDon;

    @ManyToOne @JoinColumn(name = "cong_no_id", nullable = false)
    private CongNo congNo;

    private BigDecimal soTien;
}