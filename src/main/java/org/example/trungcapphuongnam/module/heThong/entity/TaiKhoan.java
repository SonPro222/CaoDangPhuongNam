package org.example.trungcapphuongnam.module.heThong.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;
import org.example.trungcapphuongnam.common.enums.LoaiTaiKhoan;
import org.example.trungcapphuongnam.common.enums.TrangThaiTaiKhoan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mat_khau_hash", columnDefinition = "TEXT")
    private String matKhauHash;

    @Enumerated(EnumType.STRING)
    @Column(name = "loai_tai_khoan", nullable = false)
    private LoaiTaiKhoan loaiTaiKhoan;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai")
    private TrangThaiTaiKhoan trangThai;

    @Column(name = "lan_dang_nhap_cuoi")
    private LocalDateTime lanDangNhapCuoi;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

}
