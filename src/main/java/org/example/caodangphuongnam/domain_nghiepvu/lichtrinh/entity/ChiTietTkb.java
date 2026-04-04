package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity;

import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.BaiHoc;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chi_tiet_tkb")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChiTietTkb {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "thoi_khoa_bieu_id", nullable = false)
    private ThoiKhoaBieu thoiKhoaBieu;

    @ManyToOne @JoinColumn(name = "bai_hoc_id", nullable = false)
    private BaiHoc baiHoc;
}