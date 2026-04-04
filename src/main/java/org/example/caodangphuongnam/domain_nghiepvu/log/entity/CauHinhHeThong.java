package org.example.caodangphuongnam.domain_nghiepvu.log.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cau_hinh_he_thong")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CauHinhHeThong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean choNoTienQuyet = false;
    private Integer soMonNoToiDa = 0;
}