package org.example.trungcapphuongnam.module.heThong.controller;

import org.example.trungcapphuongnam.common.constant.Path.HeThongPath;
import org.example.trungcapphuongnam.common.response.ApiResponse;
import org.example.trungcapphuongnam.module.heThong.dto.request.NhanVienRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.NhanVienResponse;
import org.example.trungcapphuongnam.module.heThong.service.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(HeThongPath.NHAN_VIEN)
@RequiredArgsConstructor
public class NhanVienController {

    private final NhanVienService nhanVienService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<NhanVienResponse>>> getAll() {
        return ResponseEntity.ok(
                ApiResponse.ok(nhanVienService.getAll())
        );
    }

    @GetMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<NhanVienResponse>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                ApiResponse.ok(nhanVienService.getById(id))
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<NhanVienResponse>> create(@RequestBody NhanVienRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.created(nhanVienService.create(request)));
    }

    @PutMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<NhanVienResponse>> update(@PathVariable Long id,
                                                             @RequestBody NhanVienRequest request) {
        return ResponseEntity.ok(
                ApiResponse.ok(nhanVienService.update(id, request))
        );
    }

    @DeleteMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        nhanVienService.delete(id);
        return ResponseEntity.ok(ApiResponse.deleted());
    }
}
