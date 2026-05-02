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
@Table(name = "mon_hoc")
public class MonHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_mon")
    private String maMon;

    @Column(name = "ten_mon")
    private String tenMon;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

=======
public class mon_hoc {
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c
}
