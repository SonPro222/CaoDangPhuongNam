package org.example.trungcapphuongnam.module.heThong.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tai_khoan_vai_tro")
public class TaiKhoanVaiTro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tai_khoan_id", nullable = false)
    private Long taiKhoanId;

    @Column(name = "vai_tro_id", nullable = false)
    private Long vaiTroId;

}
