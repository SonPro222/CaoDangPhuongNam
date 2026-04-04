package org.example.caodangphuongnam.domain_nghiepvu.cms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "noi_dung_bai")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class NoiDungBai {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "bai_hoc_id", nullable = false)
    private BaiHoc baiHoc;

    private String loai;
    private String tieuDe;
    private String noiDung;
}