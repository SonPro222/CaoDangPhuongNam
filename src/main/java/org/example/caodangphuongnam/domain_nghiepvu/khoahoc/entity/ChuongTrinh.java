package org.example.caodangphuongnam.domain_nghiepvu.khoahoc.entity;

import org.example.caodangphuongnam.domain_nghiepvu.nganh.entity.Nganh;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chuong_trinh")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChuongTrinh {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "nganh_id", nullable = false)
    private Nganh nganh;

    private String ten;
    private String version;
    private Integer thoiGianThang;
    private Boolean coKy = true;
    private Integer tongTinChi;
    private Integer tongGio;
    private String trangThai;
}