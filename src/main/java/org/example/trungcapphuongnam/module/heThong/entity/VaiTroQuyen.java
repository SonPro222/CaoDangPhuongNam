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
@Table(name = "vai_tro_quyen")
public class VaiTroQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vai_tro_id", nullable = false)
    private Long vaiTroId;

    @Column(name = "quyen_id", nullable = false)
    private Long quyenId;

}
