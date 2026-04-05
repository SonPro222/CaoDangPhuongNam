package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;

import java.time.LocalDate;

@Entity
@Table(name = "sinh_vien")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SinhVien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String maSv;
    private String ten;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String email;
    private String sdt;
    private Boolean kyLuatCamThi = false;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nguoi_dung_id", referencedColumnName = "id")
    private NguoiDung nguoiDung;
}