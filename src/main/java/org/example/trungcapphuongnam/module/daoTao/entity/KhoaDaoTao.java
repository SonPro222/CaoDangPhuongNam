package org.example.trungcapphuongnam.module.daoTao.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "khoa_dao_tao")
public class KhoaDaoTao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_khoa", nullable = false, unique = true, length = 50)
    private String maKhoa;

    @Column(name = "ten_khoa")
    private String tenKhoa;

    @Column(name = "nam_bat_dau")
    private Integer namBatDau;

    @Column(name = "nam_ket_thuc")
    private Integer namKetThuc;

    @Column(name = "ghi_chu", columnDefinition = "TEXT")
    private String ghiChu;
=======
public class khoa_dao_tao {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
