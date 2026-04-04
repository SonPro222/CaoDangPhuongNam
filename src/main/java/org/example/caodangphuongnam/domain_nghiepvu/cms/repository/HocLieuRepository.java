package org.example.caodangphuongnam.domain_nghiepvu.cms.repository;

import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.HocLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocLieuRepository extends JpaRepository<HocLieu, Integer> {
}