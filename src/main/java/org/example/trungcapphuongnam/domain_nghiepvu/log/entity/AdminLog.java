package org.example.trungcapphuongnam.domain_nghiepvu.log.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "admin_log")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AdminLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;

    private String hanhDong;
    private String bang;
    private Integer recordId;
    private String duLieuCu;
    private String duLieuMoi;
    private LocalDateTime createdAt = LocalDateTime.now();
}