package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "muc_tieu_bai")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MucTieuBai {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "bai_hoc_id", nullable = false)
    private BaiHoc baiHoc;

    private String loai;
    private String noiDung;
}