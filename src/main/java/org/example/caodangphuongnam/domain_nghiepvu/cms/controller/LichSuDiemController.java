package org.example.caodangphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.LichSuDiemDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.LichSuDiemFilter;
import org.example.caodangphuongnam.domain_nghiepvu.cms.service.LichSuDiemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/lich_su_diem")
@RequiredArgsConstructor
public class LichSuDiemController {

    private final LichSuDiemService service;

    @GetMapping
    public ResponseEntity<Page<LichSuDiemDTO>> findAll(
            @ModelAttribute LichSuDiemFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LichSuDiemDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<LichSuDiemDTO> create(@RequestBody LichSuDiemDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LichSuDiemDTO> update(@PathVariable Integer id, @RequestBody LichSuDiemDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}