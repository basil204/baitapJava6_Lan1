package com.example.thuthujava6_1.service;

import com.example.thuthujava6_1.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachHangService {
    List<KhachHang> GetAll();


    Page<KhachHang> GetAlls(Pageable pageable);

    KhachHang save(KhachHang khachHang);
}
