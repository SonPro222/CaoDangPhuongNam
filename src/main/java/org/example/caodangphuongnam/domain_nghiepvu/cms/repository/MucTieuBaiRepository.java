package org.example.caodangphuongnam.domain_nghiepvu.cms.repository;

import org.example.caodangphuongnam.domain_nghiepvu.cms.entity.MucTieuBai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MucTieuBaiRepository extends JpaRepository<MucTieuBai, Integer> {
}