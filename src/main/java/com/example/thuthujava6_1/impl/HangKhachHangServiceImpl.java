package com.example.thuthujava6_1.impl;

import com.example.thuthujava6_1.model.HangKhachHang;
import com.example.thuthujava6_1.repository.HangKhachHangRepository;
import com.example.thuthujava6_1.service.HangKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HangKhachHangServiceImpl implements HangKhachHangService {
@Autowired
HangKhachHangRepository hangKhachHangRepository;
    @Override
    public List<HangKhachHang> GetAll() {
        return hangKhachHangRepository.findAll();
    }

    @Override
    public HangKhachHang create(HangKhachHang hangKhachHang) {
        return hangKhachHangRepository.save(hangKhachHang);
    }
}
