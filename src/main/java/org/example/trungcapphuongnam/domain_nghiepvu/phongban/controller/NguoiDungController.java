package org.example.trungcapphuongnam.domain_nghiepvu.phongban.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.dto.NguoiDungDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.service.NguoiDungService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/nguoi-dung")
@RequiredArgsConstructor
public class NguoiDungController {

    private final NguoiDungService service;

    @GetMapping
    public ResponseEntity<Page<NguoiDungDTO>> getAll(
            @PageableDefault(size = 10) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<NguoiDungDTO> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }
}