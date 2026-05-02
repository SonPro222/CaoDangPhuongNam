package org.example.trungcapphuongnam.module.heThong.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;
import org.example.trungcapphuongnam.common.enums.TrangThaiNhanVien;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tai_khoan_id")
    private Long taiKhoanId;

    @Column(name = "ma_nhan_vien", nullable = false)
    private String maNhanVien;

    @Column(name = "ho_ten", nullable = false)
    private String hoTen;

    @Column(name = "email")
    private String email;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "phong_ban")
    private String phongBan;

    @Column(name = "chuc_vu")
    private String chucVu;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai")
    private TrangThaiNhanVien trangThai;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

}
