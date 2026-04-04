package org.example.caodangphuongnam.domain_nghiepvu.thanhtoan.entity;

import org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity.SinhVien;
import org.example.caodangphuongnam.domain_nghiepvu.taichinh.entity.CongNo;
import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "thanh_toan")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ThanhToan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "cong_no_id", nullable = false)
    private CongNo congNo;

    private BigDecimal soTien;
    private String phuongThuc;
    private String maGiaoDich;
    private LocalDateTime ngayThanhToan = LocalDateTime.now();

    @ManyToOne @JoinColumn(name = "nguoi_thu_id")
    private NguoiDung nguoiThu;
}
