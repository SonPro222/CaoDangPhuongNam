package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "diem_danh")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DiemDanh {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "dang_ky_hoc_id", nullable = false)
    private DangKyHoc dangKyHoc;

    private LocalDate ngay;
    private String trangThai;

    @ManyToOne @JoinColumn(name = "nguoi_diem_danh_id")
    private NguoiDung nguoiDiemDanh;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}