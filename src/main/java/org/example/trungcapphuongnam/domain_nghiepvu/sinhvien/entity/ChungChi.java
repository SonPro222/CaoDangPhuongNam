package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.khoahoc.entity.ChuongTrinh;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chung_chi")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ChungChi {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "chuong_trinh_id", nullable = false)
    private ChuongTrinh chuongTrinh;

    private String ten;
}