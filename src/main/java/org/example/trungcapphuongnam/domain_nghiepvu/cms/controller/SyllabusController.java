package org.example.trungcapphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.SyllabusDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.SyllabusFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.SyllabusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/syllabus")
@RequiredArgsConstructor
public class SyllabusController {

    private final SyllabusService service;

    @GetMapping
    public ResponseEntity<Page<SyllabusDTO>> findAll(
            @ModelAttribute SyllabusFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SyllabusDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<SyllabusDTO> create(@RequestBody SyllabusDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SyllabusDTO> update(@PathVariable Integer id, @RequestBody SyllabusDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}