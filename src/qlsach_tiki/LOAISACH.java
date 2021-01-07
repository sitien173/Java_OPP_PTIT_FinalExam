/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach_tiki;

/**
 *
 * @author ngosi
 */
public class LOAISACH {
    private String maLoaiSach;
    private String loaiSach;

    public LOAISACH() {
        
    }

    public LOAISACH(String maLoaiSach, String loaiSach) {
        this.maLoaiSach = maLoaiSach;
        this.loaiSach = loaiSach;
    }

    public String getMaLoaiSach() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }
    
}
