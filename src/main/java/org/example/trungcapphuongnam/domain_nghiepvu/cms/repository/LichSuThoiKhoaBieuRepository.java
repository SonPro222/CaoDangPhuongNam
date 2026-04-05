package org.example.trungcapphuongnam.domain_nghiepvu.cms.repository;

import org.example.trungcapphuongnam.domain_nghiepvu.cms.entity.LichSuThoiKhoaBieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichSuThoiKhoaBieuRepository extends JpaRepository<LichSuThoiKhoaBieu, Integer> {
}