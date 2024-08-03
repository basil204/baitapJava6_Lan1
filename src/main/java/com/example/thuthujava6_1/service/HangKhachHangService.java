package com.example.thuthujava6_1.service;

import com.example.thuthujava6_1.model.HangKhachHang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HangKhachHangService {
    List<HangKhachHang> GetAll();

    HangKhachHang create(HangKhachHang hangKhachHang);
}
