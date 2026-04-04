package org.example.caodangphuongnam.domain_nghiepvu.cms.entity;

import org.example.caodangphuongnam.domain_nghiepvu.lichtrinh.entity.LopMon;
import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "lich_su_thoi_khoa_bieu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class LichSuThoiKhoaBieu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "lop_mon_id")
    private LopMon lopMon;

    private LocalDate ngayCu;
    private LocalTime gioBatDauCu;
    private LocalTime gioKetThucCu;

    private LocalDate ngayMoi;
    private LocalTime gioBatDauMoi;
    private LocalTime gioKetThucMoi;

    private String phongCu;
    private String phongMoi;

    @ManyToOne @JoinColumn(name = "nguoi_sua_id")
    private NguoiDung nguoiSua;

    private LocalDateTime createdAt = LocalDateTime.now();
}