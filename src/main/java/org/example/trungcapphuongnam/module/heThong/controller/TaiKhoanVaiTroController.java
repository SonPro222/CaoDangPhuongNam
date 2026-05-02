package org.example.trungcapphuongnam.module.heThong.controller;

import org.example.trungcapphuongnam.common.constant.Path.HeThongPath;
import org.example.trungcapphuongnam.common.response.ApiResponse;
import org.example.trungcapphuongnam.module.heThong.dto.request.TaiKhoanVaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.TaiKhoanVaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.service.TaiKhoanVaiTroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(HeThongPath.TAI_KHOAN_VAI_TRO)
@RequiredArgsConstructor
public class TaiKhoanVaiTroController {

    private final TaiKhoanVaiTroService taiKhoanVaiTroService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<TaiKhoanVaiTroResponse>>> getAll() {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanVaiTroService.getAll())
        );
    }

    @GetMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<TaiKhoanVaiTroResponse>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanVaiTroService.getById(id))
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<TaiKhoanVaiTroResponse>> create(@RequestBody TaiKhoanVaiTroRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.created(taiKhoanVaiTroService.create(request)));
    }

    @PutMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<TaiKhoanVaiTroResponse>> update(@PathVariable Long id,
                                                             @RequestBody TaiKhoanVaiTroRequest request) {
        return ResponseEntity.ok(
                ApiResponse.ok(taiKhoanVaiTroService.update(id, request))
        );
    }

    @DeleteMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        taiKhoanVaiTroService.delete(id);
        return ResponseEntity.ok(ApiResponse.deleted());
    }
}
