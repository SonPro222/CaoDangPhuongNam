package org.example.caodangphuongnam.domain_nghiepvu.doanhthu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;
import java.math.BigDecimal;

@Entity
@Table(name = "doanh_thu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DoanhThu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate ngay;
    private BigDecimal tongTien;
    private String loai;
    private LocalDateTime createdAt = LocalDateTime.now();
}