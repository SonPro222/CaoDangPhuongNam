package org.example.caodangphuongnam.domain_nghiepvu.taichinh.entity;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "hoa_don")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HoaDon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    private BigDecimal tongTien = BigDecimal.ZERO;
    private LocalDateTime ngayXuat = LocalDateTime.now();
    private String trangThai;
    private LocalDateTime createdAt = LocalDateTime.now();
}