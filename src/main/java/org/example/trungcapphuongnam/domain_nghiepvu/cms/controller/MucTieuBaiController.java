package org.example.trungcapphuongnam.domain_nghiepvu.cms.controller;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.MucTieuBaiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.MucTieuBaiFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.MucTieuBaiService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain_nghiepvu/cms/muc_tieu_bai")
@RequiredArgsConstructor
public class MucTieuBaiController {

    private final MucTieuBaiService service;

    @GetMapping
    public ResponseEntity<Page<MucTieuBaiDTO>> findAll(
            @ModelAttribute MucTieuBaiFilter filter,
            @PageableDefault(size = 15) Pageable pageable) {
        return ResponseEntity.ok(service.findAll(filter, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MucTieuBaiDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<MucTieuBaiDTO> create(@RequestBody MucTieuBaiDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MucTieuBaiDTO> update(@PathVariable Integer id, @RequestBody MucTieuBaiDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}