package com.example.thuthujava6_1.repository;

import com.example.thuthujava6_1.model.KhachHang;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {
@Query("SELECT p FROM KhachHang p")
    Page<KhachHang> findAlls(Pageable pageable);
}
