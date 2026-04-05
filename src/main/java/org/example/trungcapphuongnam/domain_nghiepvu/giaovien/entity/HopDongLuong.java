package org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NhanSu;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "hop_dong_luong")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HopDongLuong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "nhan_su_id", nullable = false)
    private NhanSu nhanSu;

    private BigDecimal luongCoBan;
    private BigDecimal luongTheoGio;
    private String hinhThuc;
    private LocalDateTime createdAt = LocalDateTime.now();
}