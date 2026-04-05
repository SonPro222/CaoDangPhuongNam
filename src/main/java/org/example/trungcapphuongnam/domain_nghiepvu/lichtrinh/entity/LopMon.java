package org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.Lop;
import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity.GiangVien;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "lop_mon")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class LopMon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String maLopMon;

    @ManyToOne @JoinColumn(name = "lop_id")
    private Lop lop;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    @ManyToOne @JoinColumn(name = "giang_vien_id")
    private GiangVien giangVien;

    @ManyToOne @JoinColumn(name = "hoc_ky_id", nullable = false)
    private HocKyThucTe hocKyThucTe;

    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private Integer siSoToiDa;
    private String trangThai;
}