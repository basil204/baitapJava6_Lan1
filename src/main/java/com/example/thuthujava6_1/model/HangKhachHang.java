package com.example.thuthujava6_1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "HangKhachHang")
public class HangKhachHang {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonProperty("MaHang")
    private Long maHang;
private String TenHang;
}
