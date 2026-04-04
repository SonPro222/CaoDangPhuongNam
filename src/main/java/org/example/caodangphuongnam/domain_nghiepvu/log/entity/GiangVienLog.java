package org.example.caodangphuongnam.domain_nghiepvu.log.entity;

import org.example.caodangphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "giang_vien_log")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class GiangVienLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;

    private String hanhDong;
    private String doiTuong;
    private Integer doiTuongId;
    private String noiDungCu;
    private String noiDungMoi;
    private LocalDateTime createdAt = LocalDateTime.now();
}