package org.example.trungcapphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.NoiDungBaiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.NoiDungBaiFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.NoiDungBaiService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/noi_dung_bai")
@RequiredArgsConstructor
public class NoiDungBaiController {

    private final NoiDungBaiService service;

    @GetMapping
    public ResponseEntity<Page<NoiDungBaiDTO>> findAll(
            @ModelAttribute NoiDungBaiFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoiDungBaiDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<NoiDungBaiDTO> create(@RequestBody NoiDungBaiDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoiDungBaiDTO> update(@PathVariable Integer id, @RequestBody NoiDungBaiDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}