package org.example.caodangphuongnam.domain_nghiepvu.nganh.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nganh")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Nganh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_nganh", unique = true, nullable = false, length = 50)
    private String maNganh;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "trang_thai", length = 50)
    private String trangThai;
}