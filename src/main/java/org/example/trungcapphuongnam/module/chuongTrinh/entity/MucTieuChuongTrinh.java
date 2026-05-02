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
@Table(name = "muc_tieu_chuong_trinh")
public class MucTieuChuongTrinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chuong_trinh_version_id")
    private Long chuongTrinhVersionId;

    @Column(name = "loai")
    private String loai;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "thu_tu")
    private Integer thuTu;

=======
public class muc_tieu_chuong_trinh {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
