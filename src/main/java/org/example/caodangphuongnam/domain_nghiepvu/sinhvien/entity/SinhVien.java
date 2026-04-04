package org.example.caodangphuongnam.domain_nghiepvu.sinhvien.entity;

import jakarta.persistence.*;
import lombok.*;
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
}