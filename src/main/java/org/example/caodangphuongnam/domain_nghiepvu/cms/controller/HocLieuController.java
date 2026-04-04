package org.example.caodangphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.caodangphuongnam.domain_nghiepvu.cms.dto.HocLieuDTO;
import org.example.caodangphuongnam.domain_nghiepvu.cms.filter.HocLieuFilter;
import org.example.caodangphuongnam.domain_nghiepvu.cms.service.HocLieuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/hoc_lieu")
@RequiredArgsConstructor
public class HocLieuController {

    private final HocLieuService service;

    @GetMapping
    public ResponseEntity<Page<HocLieuDTO>> findAll(
            @ModelAttribute HocLieuFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HocLieuDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<HocLieuDTO> create(@RequestBody HocLieuDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<HocLieuDTO> update(@PathVariable Integer id, @RequestBody HocLieuDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}