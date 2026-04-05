package org.example.trungcapphuongnam.domain_nghiepvu.taichinh.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cong_no")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CongNo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "hoc_phi_id", nullable = false)
    private HocPhi hocPhi;

    private BigDecimal soTienPhaiDong;
    private BigDecimal soTienDaDong = BigDecimal.ZERO;
    private LocalDate hanDong;
    private String trangThai;
    private LocalDateTime createdAt = LocalDateTime.now();
}