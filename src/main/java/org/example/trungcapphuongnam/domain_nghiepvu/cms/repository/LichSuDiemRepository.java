package org.example.trungcapphuongnam.domain_nghiepvu.cms.repository;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.LichSuDiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichSuDiemRepository extends JpaRepository<LichSuDiem, Integer> {
}