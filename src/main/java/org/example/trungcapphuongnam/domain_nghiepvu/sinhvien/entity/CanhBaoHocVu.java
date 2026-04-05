package org.example.trungcapphuongnam.domain_nghiepvu.sinhvien.entity;

import org.example.trungcapphuongnam.domain_nghiepvu.lichtrinh.entity.HocKyThucTe;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "canh_bao_hoc_vu")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CanhBaoHocVu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "sinh_vien_id", nullable = false)
    private SinhVien sinhVien;

    @ManyToOne @JoinColumn(name = "hoc_ky_id", nullable = false)
    private HocKyThucTe hocKy;

    private String mucDo;
    private String lyDo;
    private LocalDate ngayCanhBao;
    private String trangThai;
}