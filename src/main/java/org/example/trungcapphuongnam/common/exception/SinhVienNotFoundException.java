package org.example.trungcapphuongnam.module.sinhVien.exception;

public class SinhVienNotFoundException extends SinhVienException {
    public SinhVienNotFoundException(String resource, Long id) {
        super(resource + " không tồn tại với id = " + id);
    }
}
