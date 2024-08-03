package com.example.thuthujava6_1.repository;

import com.example.thuthujava6_1.model.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang, Long> {
}
