/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach_tiki;

import java.sql.Date;

/**
 *
 * @author ngosi
 */
public class SACH {
   private String maSach;
   private String tenSach;
   private String maTacGia;
   private String maLoaiSach;
   private String hinhAnh;
   private int giaTien;
   private int soLuong;
   private Date ngayXuatBan;
   private String kichThuoc;
   private int soTrang;
   private int SKU;
   private String moTa;

    public SACH() {
       
   }
    public SACH(String maSach, String tenSach, String maTacGia, String maLoaiSach, String hinhAnh, int giaTien, int soLuong, Date ngayXuatBan, String kichThuoc, int soTrang, int SKU, String moTa) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maTacGia = maTacGia;
        this.maLoaiSach = maLoaiSach;
        this.hinhAnh = hinhAnh;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.ngayXuatBan = ngayXuatBan;
        this.kichThuoc = kichThuoc;
        this.soTrang = soTrang;
        this.SKU = SKU;
        this.moTa = moTa;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getMaLoaiSach() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
   
   
}
