package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.giaovien.entity.GiangVien;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "hoc_lieu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HocLieu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "bai_hoc_id", nullable = false)
    private BaiHoc baiHoc;

    private String tenTaiLieu;
    private String loaiFile;
    private String duongDanFile;
    private LocalDateTime ngayTaiLen = LocalDateTime.now();

    @ManyToOne @JoinColumn(name = "giang_vien_id", nullable = false)
    private GiangVien giangVien;
}