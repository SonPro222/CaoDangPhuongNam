package org.example.caodangphuongnam.domain_nghiepvu.giaovien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NhanSu;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "cham_cong")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChamCong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "nhan_su_id", nullable = false)
    private NhanSu nhanSu;

    private LocalDate ngay;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private Double soGio;
    private String trangThai;
    private LocalDateTime createdAt = LocalDateTime.now();
}