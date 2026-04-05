package org.example.trungcapphuongnam.domain_nghiepvu.cms.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.dto.MucTieuBaiDTO;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.MucTieuBai;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.filter.MucTieuBaiFilter;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.mapper.MucTieuBaiMapper;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.repository.MucTieuBaiRepository;
import org.example.trungcapphuongnam.domain_nghiepvu.cms.service.MucTieuBaiService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MucTieuBaiServiceImpl implements MucTieuBaiService {

    private final MucTieuBaiRepository repository;
    private final MucTieuBaiMapper mapper;

    @Override
    public Page<MucTieuBaiDTO> findAll(MucTieuBaiFilter filter, Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toDto);
    }

    @Override
    public MucTieuBaiDTO findById(Integer id) {
        return repository.findById(id).map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Mục Tiêu Bài với ID: " + id));
    }

    @Override
    @Transactional
    public MucTieuBaiDTO create(MucTieuBaiDTO dto) {
        MucTieuBai entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    @Transactional
    public MucTieuBaiDTO update(Integer id, MucTieuBaiDTO dto) {
        if (!repository.existsById(id)) throw new RuntimeException("Không tìm thấy Mục Tiêu Bài với ID: " + id);
        dto.setId(id);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}