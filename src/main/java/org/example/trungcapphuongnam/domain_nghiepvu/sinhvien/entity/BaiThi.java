package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "bai_thi")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BaiThi {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "lop_mon_id", nullable = false)
    private LopMon lopMon;

    private String ten;
    private String loai;
    private LocalDate ngay;
}