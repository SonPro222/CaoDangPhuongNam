package org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "giang_vien")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class GiangVien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String maGv;

    @ManyToOne @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    private String ten;
    private String email;
    private String sdt;
}