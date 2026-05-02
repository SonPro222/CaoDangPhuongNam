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
@Table(name = "mon_tu_chon")
public class MonTuChon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nhom_id")
    private Long nhomId;

    @Column(name = "chuong_trinh_mon_id")
    private Long chuongTrinhMonId;

=======
public class mon_tu_chon {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
