package org.example.trungcapphuongnam.module.chuongTrinh.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "syllabus_chuong_bai")
public class SyllabusChuongBai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "syllabus_mon_id")
    private Long syllabusMonId;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tong_gio")
    private BigDecimal tongGio;

    @Column(name = "gio_ly_thuyet")
    private BigDecimal gioLyThuyet;

    @Column(name = "gio_thuc_hanh")
    private BigDecimal gioThucHanh;

    @Column(name = "gio_kiem_tra")
    private BigDecimal gioKiemTra;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "muc_tieu")
    private String mucTieu;

    @Column(name = "thu_tu")
    private Integer thuTu;

=======
public class syllabus_chuong_bai {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
