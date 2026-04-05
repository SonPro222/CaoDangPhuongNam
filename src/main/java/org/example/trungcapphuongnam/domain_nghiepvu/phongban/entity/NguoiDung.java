package org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nguoi_dung", schema = "public")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class NguoiDung {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)

    private String tenDangNhap;
    private String matKhau;
    private String vaiTro;
    private String email;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @ManyToOne @JoinColumn(name = "phong_ban_id")
    private PhongBan phongBan;
}