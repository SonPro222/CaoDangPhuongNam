package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.Lop;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "sinh_vien_lop")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SinhVienLop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "lop_id", nullable = false)
    private Lop lop;

    private LocalDate ngayVao;
    private LocalDate ngayRa;
    private String trangThai;
    private LocalDateTime createdAt = LocalDateTime.now();
}