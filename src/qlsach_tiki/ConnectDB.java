/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach_tiki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ngosi
 */
public class ConnectDB {
    public ConnectDB() { 
    }
    
      public Connection getConnect (){
        Connection conn = null;
        String URL = "jdbc:sqlserver://;databaseName=QLSACH_TIKI";
        String user = "sa";
        String password = "11413476";
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             conn = DriverManager.getConnection(URL, user, password);
             System.out.println("ConnectDB Success");
        } catch (Exception e) {
            System.out.println("ConnectDB Failed");
        }
        return conn;
    }
    public void getSach() {
        Connection connect = this.getConnect();
        String sqlSelect = "SELECT * FROM dbo.SACH";
        try {
            PreparedStatement ps = connect.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();
            Vector vt = null;
            GIAODIEN.dtm.setNumRows(0);
            while(rs.next()) {
               vt = new Vector();
               vt.add(rs.getString(1));
               vt.add(rs.getString(2));
               vt.add(rs.getString(3));
               vt.add(rs.getString(4));
               vt.add(rs.getString(5));
               vt.add(rs.getString(6));
               vt.add(rs.getString(7));
               vt.add(rs.getString(8));
               vt.add(rs.getString(9));
               vt.add(rs.getString(10));
               vt.add(rs.getString(11));
               vt.add(rs.getString(12));
               GIAODIEN.dtm.addRow(vt);
            }
            rs.close();
            ps.close();
            connect.close();
        } catch (Exception e) {
            System.out.println("getSach Failed");
        }
    }
    public int saveSach(SACH sach) {
        Connection conn = this.getConnect();
        String sqlSave = "INSERT dbo.SACH "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlSave);
            ps.setString(1, sach.getMaSach());
            ps.setNString(2, sach.getTenSach());
            ps.setString(3, sach.getMaTacGia());
            ps.setNString(4, sach.getMaLoaiSach());
            ps.setNString(5, sach.getHinhAnh());
            ps.setInt(6, sach.getGiaTien());
            ps.setInt(7, sach.getSoLuong());
            ps.setDate(8, sach.getNgayXuatBan());
            ps.setString(9, sach.getKichThuoc());
            ps.setInt(10, sach.getSoTrang());
            ps.setInt(11, sach.getSKU());
            ps.setString(12, sach.getMoTa());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            return -1;
        }
        return 1;
    }
    
    public int delSach(String masach) {
        Connection conn = this.getConnect();
        String sqlDelete = "DELETE FROM dbo.SACH WHERE MASACH = '"+masach+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlDelete);
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            return -1;
        }
        return 1;
    }
    public String getMaTacGia(String tentacgia) {
        Connection conn = this.getConnect();
        String sqlGetMaTacGia = "SELECT * FROM dbo.TACGIA WHERE TENTACGIA = N'"+tentacgia+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlGetMaTacGia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getString("MATACGIA");
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("getMaTacGia Failed");
        }
        return null;
    }
    public String getMaLoaiSach(String loaisach) {
        Connection conn = this.getConnect();
        String sqlGetMaTacGia = "SELECT * FROM dbo.LOAISACH WHERE LOAISACH = N'"+loaisach+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlGetMaTacGia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getString("MALOAISACH");
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("getMaLoaiSach Failed");
        }
        return null;
    }
    public String randMaTacGia() {
        Connection conn = this.getConnect();
        String sqlGetMaTacGia = "SELECT MATACGIA FROM dbo.TACGIA ORDER BY MATACGIA ASC";
        String matacgia = "";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlGetMaTacGia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                matacgia =  rs.getString("MATACGIA");
            }
            rs.close();
            ps.close();
            conn.close();
           
            String randMaTacGia = "TG";
            int intTemp = Integer.parseInt(matacgia.substring(2));
            intTemp++;
            randMaTacGia += intTemp;
            return randMaTacGia;
        } catch (Exception e) {
            System.out.println("getMaTacGia Failed");
        }
        return null;
    }
    public String randMaLoaiSach() {
        Connection conn = this.getConnect();
        String sqlGetMaTacGia = "SELECT MALOAISACH FROM dbo.LOAISACH ORDER BY MALOAISACH ASC";
        String maloaisach = "";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlGetMaTacGia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                maloaisach =  rs.getString("MALOAISACH");
            }
            rs.close();
            ps.close();
            conn.close();
           
            String randMaLoaiSach = "L";
            int intTemp = Integer.parseInt(maloaisach.substring(1));
            intTemp++;
            randMaLoaiSach += intTemp;
            return randMaLoaiSach;
        } catch (Exception e) {
            System.out.println("getMaTacGia Failed");
        }
        return null;
    }
    public int saveTacGia(TACGIA tacgia) {
        Connection conn = this.getConnect();
        String sql = "INSERT dbo.TACGIA(MATACGIA,TENTACGIA) VALUES(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tacgia.getMaTacGia());
            ps.setString(2,tacgia.getTenTacGia());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            return -1;
        }
        return 1;
    }
    public int saveLoaiSach(LOAISACH loaiSach) {
        Connection conn = this.getConnect();
        String sql = "INSERT dbo.LOAISACH(MALOAISACH,LOAISACH) VALUES(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaiSach.getMaLoaiSach());
            ps.setNString(2,loaiSach.getLoaiSach());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            return -1;
        }
        return 1;
    }
    public ArrayList<String> getTacGia(){
        Connection conn = this.getConnect();
        String sql = "Select TENTACGIA from dbo.TACGIA";
        ArrayList<String> tacgia = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                tacgia.add(rs.getNString("TENTACGIA"));
            }
            return tacgia;
        } catch (Exception e) {
            return null;
        }
    }
    public String getTacGia(String matacgia) {
        Connection conn = this.getConnect();
        String sql = "Select * from dbo.TACGIA Where MATACGIA = '"+matacgia+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getNString("TENTACGIA");
            }
        } catch (Exception e) {
          return null;
        }
        return null;
    }
    public ArrayList<String> getLoaiSach(){
        Connection conn = this.getConnect();
        String sql = "Select LOAISACH from dbo.LOAISACH";
        ArrayList<String> loaisach = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                loaisach.add(rs.getNString("LOAISACH"));
            }
            return loaisach;
        } catch (Exception e) {
            return null;
        }
    }
    public String getLoaiSach(String maloaisach) {
        Connection conn = this.getConnect();
        String sql = "Select * from dbo.LOAISACH Where MALOAISACH = '"+maloaisach+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getNString("LOAISACH");
            }
        } catch (Exception e) {
          return null;
        }
        return null;
    }
}
