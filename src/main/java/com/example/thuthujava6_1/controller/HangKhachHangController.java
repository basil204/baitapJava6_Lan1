package com.example.thuthujava6_1.controller;

import com.example.thuthujava6_1.model.HangKhachHang;
import com.example.thuthujava6_1.service.HangKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class HangKhachHangController {
    @Autowired
    HangKhachHangService hangKhachHangService;

        @GetMapping("/list")
    public List<HangKhachHang> list() {
            return hangKhachHangService.GetAll();
        }

        @PostMapping("/create")
public HangKhachHang create(@RequestBody HangKhachHang hangKhachHang) {
            return hangKhachHangService.create(hangKhachHang);
        }
    }

