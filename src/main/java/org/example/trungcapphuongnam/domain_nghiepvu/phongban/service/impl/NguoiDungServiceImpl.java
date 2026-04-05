package org.example.trungcapphuongnam.domain_nghiepvu.phongban.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.dto.NguoiDungDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.mapper.NguoiDungMapper;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.repo.NguoiDungRepository;
import org.example.trungcapphuongnam.domain_nghiepvu.phongban.service.NguoiDungService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NguoiDungServiceImpl implements NguoiDungService {

    private final NguoiDungRepository repository;
    private final NguoiDungMapper mapper;

    @Override
    public Page<NguoiDungDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public NguoiDungDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy người dùng ID: " + id));
    }

    @Override
    @Transactional
    public NguoiDungDTO create(NguoiDungDTO dto) {
        NguoiDung entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public NguoiDungDTO update(Integer id, NguoiDungDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy ID: " + id);
        NguoiDung entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}