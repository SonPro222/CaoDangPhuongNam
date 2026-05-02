package org.example.trungcapphuongnam.module.chuongTrinh.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mon_tien_quyet")
public class MonTienQuyet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mon_id")
    private Long monId;

    @Column(name = "mon_dieu_kien_id")
    private Long monDieuKienId;

    @Column(name = "loai")
    private String loai;

    @Column(name = "ghi_chu")
    private String ghiChu;

=======
public class mon_tien_quyet {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
