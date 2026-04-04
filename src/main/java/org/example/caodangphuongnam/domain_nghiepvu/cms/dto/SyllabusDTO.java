package org.example.caodangphuongnam.domain_nghiepvu.cms.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SyllabusDTO {
    private Integer id;
    private Integer monHocId;
    private String ten;
    private String maMon;
    private Integer tongGio;
    private Integer gioLyThuyet;
    private Integer gioThucHanh;
    private Integer gioKiemTra;
    private String viTri;
    private String tinhChat;
    private String mucTieuKienThuc;
    private String mucTieuKyNang;
    private String mucTieuThaiDo;
    private String phuongPhapDanhGia;
    private String dieuKienHoc;
    private String taiLieu;
    private String trangThai;
}