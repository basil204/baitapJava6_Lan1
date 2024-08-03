package com.example.thuthujava6_1.controller;

import com.example.thuthujava6_1.model.KhachHang;
import com.example.thuthujava6_1.service.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("")
@RestController
@RequestMapping("/rest")
public class KhachhangController {
@Autowired
private KhachHangService khachHangService;
    @GetMapping("/listKH")
    public Object khachhang(@RequestParam(required = false) Integer page,
                            @RequestParam(required = false) Integer size) {
        if (page != null && size != null) {
            Pageable pageable = PageRequest.of(page, size);
            return khachHangService.GetAlls(pageable);
        } else {
            return khachHangService.GetAll();
        }
    }
    @PostMapping("/add")
    public ResponseEntity<Object> add(@Valid @RequestBody KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errorMessages = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();

            // Create an error response structure
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status", "error");
            errorResponse.put("message", "Validation failed");
            errorResponse.put("errors", errorMessages);

            return ResponseEntity.badRequest().body(errorResponse);
        }

        KhachHang savedKhachHang = khachHangService.save(khachHang);
        return ResponseEntity.ok(savedKhachHang);
    }

}
