package com.example.thuthujava6_1.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonProperty("MaKhachHang")
    private Long maKhachHang;
    @NotBlank(message = "trống TenKhachHang")
    @JsonProperty("TenKhachHang")
    private String tenKhachHang;
    @Max(value = 10 ,message = "SoDienThoai phải 10 số")
    @JsonProperty("SoDienThoai")
    private int soDienThoai;
    @JsonProperty("GioiTinh")
    private int gioiTinh;
    @ManyToOne @JoinColumn(name = "HangKhachHang")
    @JsonProperty("HangKhachHang")
    private HangKhachHang hangKhachHang;
}

