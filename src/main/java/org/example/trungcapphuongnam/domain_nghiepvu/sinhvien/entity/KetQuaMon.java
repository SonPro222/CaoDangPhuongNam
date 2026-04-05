package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ket_qua_mon")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class KetQuaMon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    private Double diemCaoNhat;
    private String trangThai;
}