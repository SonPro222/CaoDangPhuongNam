package org.example.trungcapphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.LichSuThoiKhoaBieuDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.LichSuThoiKhoaBieuFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.LichSuThoiKhoaBieuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/lich_su_thoi_khoa_bieu")
@RequiredArgsConstructor
public class LichSuThoiKhoaBieuController {

    private final LichSuThoiKhoaBieuService service;

    @GetMapping
    public ResponseEntity<Page<LichSuThoiKhoaBieuDTO>> findAll(
            @ModelAttribute LichSuThoiKhoaBieuFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LichSuThoiKhoaBieuDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<LichSuThoiKhoaBieuDTO> create(@RequestBody LichSuThoiKhoaBieuDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LichSuThoiKhoaBieuDTO> update(@PathVariable Integer id, @RequestBody LichSuThoiKhoaBieuDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}