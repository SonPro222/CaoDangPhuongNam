package org.example.trungcapphuongnam.module.heThong.controller;

import org.example.trungcapphuongnam.common.constant.Path.HeThongPath;
import org.example.trungcapphuongnam.common.response.ApiResponse;
import org.example.trungcapphuongnam.module.heThong.dto.request.VaiTroRequest;
import org.example.trungcapphuongnam.module.heThong.dto.response.VaiTroResponse;
import org.example.trungcapphuongnam.module.heThong.service.VaiTroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(HeThongPath.VAI_TRO)
@RequiredArgsConstructor
public class VaiTroController {

    private final VaiTroService vaiTroService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<VaiTroResponse>>> getAll() {
        return ResponseEntity.ok(
                ApiResponse.ok(vaiTroService.getAll())
        );
    }

    @GetMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<VaiTroResponse>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                ApiResponse.ok(vaiTroService.getById(id))
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<VaiTroResponse>> create(@RequestBody VaiTroRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.created(vaiTroService.create(request)));
    }

    @PutMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<VaiTroResponse>> update(@PathVariable Long id,
                                                             @RequestBody VaiTroRequest request) {
        return ResponseEntity.ok(
                ApiResponse.ok(vaiTroService.update(id, request))
        );
    }

    @DeleteMapping(HeThongPath.ID)
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        vaiTroService.delete(id);
        return ResponseEntity.ok(ApiResponse.deleted());
    }
}
