package org.example.caodangphuongnam.domain_nghiepvu.phongban.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phong_ban")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PhongBan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ten;
}