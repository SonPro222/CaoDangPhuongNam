package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "quyet_dinh_bao_luu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class QuyetDinhBaoLuu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    private LocalDate ngayBatDau;
    private LocalDate ngayHetHan;
    private String lyDo;
    private String trangThai;

    @ManyToOne @JoinColumn(name = "nguoi_duyet_id")
    private NguoiDung nguoiDuyet;
}