package com.example.thuthujava6_1.impl;

import com.example.thuthujava6_1.model.KhachHang;
import com.example.thuthujava6_1.repository.KhachHangRepository;
import com.example.thuthujava6_1.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
private KhachHangRepository khachHangRepository;


    @Override
    public List<KhachHang> GetAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public Page<KhachHang> GetAlls(Pageable pageable) {
        return khachHangRepository.findAlls(pageable);
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

}
