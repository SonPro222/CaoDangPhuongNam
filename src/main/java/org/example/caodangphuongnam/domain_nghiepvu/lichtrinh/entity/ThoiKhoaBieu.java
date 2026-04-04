package org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "thoi_khoa_bieu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ThoiKhoaBieu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "lop_mon_id", nullable = false)
    private LopMon lopMon;

    private LocalDate ngay;
    private String caHoc;
    private LocalTime gioBatDau;
    private LocalTime gioKetThuc;
    private String phong;
}