package org.example.trungcapphuongnam.domain_nghiepvu.cms.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity.DiemThanhPhan;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lich_su_diem")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class LichSuDiem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "diem_thanh_phan_id")
    private DiemThanhPhan diemThanhPhan;

    private Double diemCu;
    private Double diemMoi;

    @ManyToOne @JoinColumn(name = "nguoi_sua_id")
    private NguoiDung nguoiSua;

    private String lyDo;
    private String ipAddress;
    private LocalDateTime createdAt = LocalDateTime.now();
}