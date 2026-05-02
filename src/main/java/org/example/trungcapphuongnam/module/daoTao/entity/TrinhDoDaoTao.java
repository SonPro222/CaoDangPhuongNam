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
@Table(name = "trinh_do_dao_tao")
public class TrinhDoDaoTao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_trinh_do", nullable = false, unique = true, length = 50)
    private String maTrinhDo;

    @Column(name = "ten_trinh_do", nullable = false, length = 100)
    private String tenTrinhDo;

    @Column(name = "mo_ta", columnDefinition = "TEXT")
    private String moTa;
=======
public class trinh_do_dao_tao {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
