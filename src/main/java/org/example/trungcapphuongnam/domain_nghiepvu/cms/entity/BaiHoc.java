package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bai_hoc")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BaiHoc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "syllabus_id", nullable = false)
    private Syllabus syllabus;
    private String ten;
    private Integer thuTu;
    private Integer tongGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private String mucTieu;
}