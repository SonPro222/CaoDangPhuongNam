package org.example.caodangphuongnam.domain_nghiepvu.phongban.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "nhan_su")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class NhanSu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ten;
    private String loai;

    @ManyToOne @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    @ManyToOne @JoinColumn(name = "phong_ban_id")
    private PhongBan phongBan;

    private String trangThai;
    private LocalDateTime createdAt = LocalDateTime.now();
}