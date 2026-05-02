package org.example.trungcapphuongnam.module.heThong.controller;

import org.example.trungcapphuongnam.common.constant.Path.HeThongPath;
import org.example.trungcapphuongnam.common.response.ApiResponse;
import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanResponse;
import org.example.trungcapphuongnam.module.heThong.service.TaiKhoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(HeThongPath.TAI_KHOAN)
@RequiredArgsConstructor
public class TaiKhoanController {

    private final TaiKhoanService taiKhoanService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<TaiKhoanResponse>>> getAll() {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanService.getAll())
        );
    }

    @GetMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<TaiKhoanResponse>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanService.getById(id))
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<TaiKhoanResponse>> create(@RequestBody TaiKhoanRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.created(taiKhoanService.create(request)));
    }

    @PutMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<TaiKhoanResponse>> update(@PathVariable Long id,
                                                             @RequestBody TaiKhoanRequest request) {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanService.update(id, request))
        );
    }

    @DeleteMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        taiKhoanService.delete(id);
        return ResponseEntity.ok(ApiResponse.deleted());
    }
}
