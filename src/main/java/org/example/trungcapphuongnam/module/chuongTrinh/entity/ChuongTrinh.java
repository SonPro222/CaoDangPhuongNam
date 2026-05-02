package org.example.trungcapphuongnam.module.chuongTrinh.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "chuong_trinh")
public class ChuongTrinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nganh_id")
    private Long nganhId;

    @Column(name = "trinh_do_id")
    private Long trinhDoId;

    @Column(name = "loai_chuong_trinh_id")
    private Long loaiChuongTrinhId;

    @Column(name = "ma_chuong_trinh")
    private String maChuongTrinh;

    @Column(name = "ten_chuong_trinh")
    private String tenChuongTrinh;

    @Column(name = "doi_tuong_tuyen_sinh")
    private String doiTuongTuyenSinh;

    @Column(name = "thoi_gian_dao_tao")
    private String thoiGianDaoTao;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

=======
public class chuong_trinh {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
