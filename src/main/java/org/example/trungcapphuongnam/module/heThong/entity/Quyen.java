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
@Table(name = "quyen")
public class Quyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_quyen", nullable = false)
    private String maQuyen;

    @Column(name = "ten_quyen", nullable = false)
    private String tenQuyen;

    @Column(name = "mo_ta", columnDefinition = "TEXT")
    private String moTa;

}
