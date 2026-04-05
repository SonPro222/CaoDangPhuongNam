package org.example.trungcapphuongnam.domain_nghiepvu.cms.repository;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Integer> {
    // Các thao tác CRUD, findAll, findById và Pagination đã được hỗ trợ mặc định
}