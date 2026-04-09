package org.example.trungcapphuongnam.domain_nghiepvu.phongban.repo;

import org.example.trungcapphuongnam.domain_nghiepvu.phongban.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
}