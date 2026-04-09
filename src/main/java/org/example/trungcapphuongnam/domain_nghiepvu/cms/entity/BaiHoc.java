package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bai_hoc")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaiHocs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "syllabus_id", nullable = false)
    private Syllabus syllabus;

    @Column(nullable = false, length = 255)
    private String ten;

    @Column(name = "thu_tu", nullable = false)
    private Integer thuTu;

    @Column(name = "tong_gio")
    private Integer tongGio;

    @Column(name = "gio_ly_thuyet")
    private Integer gioLyThuyet;

    @Column(name = "gio_thuc_hanh")
    private Integer gioThucHanh;

    @Column(name = "gio_kiem_tra")
    private Integer gioKiemTra;

    @Column(columnDefinition = "TEXT")
    private String mucTieu;
}