package org.example.trungcapphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.BaiHocDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.BaiHocFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.BaiHocService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/bai_hoc")
@RequiredArgsConstructor
public class BaiHocController {

    private final BaiHocService service;

    @GetMapping
    public ResponseEntity<Page<BaiHocDTO>> findAll(
            @ModelAttribute BaiHocFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaiHocDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<BaiHocDTO> create(@RequestBody BaiHocDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BaiHocDTO> update(@PathVariable Integer id, @RequestBody BaiHocDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}