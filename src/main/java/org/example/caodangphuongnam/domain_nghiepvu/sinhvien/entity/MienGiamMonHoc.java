package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mien_giam_mon_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MienGiamMonHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    private String lyDo;
    private String fileMinhChung;
    private String trangThai;

    @ManyToOne @JoinColumn(name = "nguoi_duyet_id")
    private NguoiDung nguoiDuyet;

    private LocalDateTime createdAt = LocalDateTime.now();
}