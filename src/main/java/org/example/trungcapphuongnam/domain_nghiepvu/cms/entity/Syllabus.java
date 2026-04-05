package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.MonHoc;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "syllabus")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Syllabus {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "mon_hoc_id", nullable = false)
    private MonHoc monHoc;

    private String ten;
    private String maMon;
    private Integer tongGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private String viTri;
    private String tinhChat;
    private String mucTieuKienThuc;
    private String mucTieuKyNang;
    private String mucTieuThaiDo;
    private String phuongPhapDanhGia;
    private String dieuKienHoc;
    private String taiLieu;
    private String trangThai;
}