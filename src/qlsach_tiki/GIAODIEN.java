/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach_tiki;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngosi
 */
public class GIAODIEN extends javax.swing.JFrame {

    /**
     * Creates new form GIAODIEN
     */
    public static DefaultTableModel dtm ;
    private ConnectDB connDB;
    public GIAODIEN() {
        initComponents();
        connDB = new ConnectDB();
        getSach();
        getTacGia();
        getLoaiSach();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        maSach = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtMaTacGia = new javax.swing.JTextField();
        txtMaLoaiSach = new javax.swing.JTextField();
        txtHinhAnh = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtNgayXuatBan = new javax.swing.JTextField();
        txtKichThuoc = new javax.swing.JTextField();
        txtSoTrang = new javax.swing.JTextField();
        txtSKU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        cBoxLoaiSach = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cBoxTacGia = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maSach.setText("MÃ SÁCH:");

        jLabel2.setText("TÊN SÁCH:");

        jLabel3.setText("MÃ TÁC GIẢ:");

        jLabel4.setText("MÃ LOẠI SÁCH:");

        jLabel5.setText("HÌNH ẢNH");

        jLabel6.setText("GIÁ TIỀN");

        jLabel7.setText("SỐ LƯỢNG: ");

        jLabel8.setText("NGÀY XUẤT BẢN:");

        jLabel9.setText("KÍCH THƯỚC:");

        jLabel10.setText("SỐ TRANG:");

        jLabel11.setText("SKU:");

        jLabel12.setText("MÔ TẢ:");

        txtMaTacGia.setEnabled(false);

        txtMaLoaiSach.setEnabled(false);

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        cBoxLoaiSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cBoxLoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBoxLoaiSachMouseClicked(evt);
            }
        });
        cBoxLoaiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxLoaiSachActionPerformed(evt);
            }
        });

        jLabel13.setText("LOẠI SÁCH:");

        cBoxTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cBoxTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBoxTacGiaMouseClicked(evt);
            }
        });
        cBoxTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTacGiaActionPerformed(evt);
            }
        });

        jLabel14.setText("TÁC GIẢ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maSach)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSach)
                            .addComponent(txtTenSach)
                            .addComponent(txtMaTacGia)
                            .addComponent(txtMaLoaiSach)
                            .addComponent(txtHinhAnh)
                            .addComponent(txtGiaTien)
                            .addComponent(txtSoLuong)
                            .addComponent(txtNgayXuatBan)
                            .addComponent(txtKichThuoc)
                            .addComponent(txtSoTrang)
                            .addComponent(txtSKU, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxTacGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxLoaiSach, 0, 352, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maSach)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cBoxTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cBoxLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNgayXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnLuu.setText("LƯU");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel3.add(btnLuu);

        btnXoa.setText("XOÁ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);

        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat);

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH", "MÃ TÁC GIẢ", "MÃ LOẠI SÁCH", "HÌNH ẢNH", "GIÁ TIỀN", "SỐ LƯỢNG", "NGÀY XUẤT BẢN", "KÍCH THƯỚC", "SỐ TRANG", "SKU", "MÔ TẢ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSach);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getSach() {
        dtm = (DefaultTableModel) tbSach.getModel();
        connDB.getSach();
        tbSach.setModel(dtm);
    }
    private void getTacGia() {
        cBoxTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ArrayList<String> tacgia = connDB.getTacGia();
        for (String item : tacgia) {
            cBoxTacGia.addItem(item);
        }
    }
    private void getLoaiSach() {
        cBoxLoaiSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
         ArrayList<String> loaisach =connDB.getLoaiSach();
        for (String item : loaisach) {
            cBoxLoaiSach.addItem(item);
        }
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String masach =  txtMaSach.getText();
        String tensach = txtTenSach.getText();
        String matacgia = txtMaTacGia.getText();
        String maloaisach = txtMaLoaiSach.getText();
        String hinhanh = txtHinhAnh.getText();
        String regexDate = "\\d{4}-\\d{2}-\\d{2}";
        String kichthuoc = txtKichThuoc.getText();
        
        String mota = txtMoTa.getText();
        if(masach.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã Sách Không Được Để Trống");
            return;
        }
        else if (tensach.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tên Sách Không Được Để Trống");
            return;
        }
        else if (matacgia.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã Tác Giả Không Được Để Trống");
            return;
        }
        else if (maloaisach.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã Loại Sách Không Được Để Trống");
            return;
        }
        else if (hinhanh.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Hình Ảnh Không Được Để Trống");
            return;
        }
        else if (txtGiaTien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Giá Tiền Không Được Để Trống");
            return;
        }
        else if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số Lượng Không Được Để Trống");
            return;
        }
        else if (txtNgayXuatBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ngày Xuất Bản Không Được Để Trống");
            return;
        }else if (!txtNgayXuatBan.getText().matches(regexDate)) {
           JOptionPane.showMessageDialog(rootPane, "Định Dạng NXB Phải Là: yyyy-mm-dd");
           return;
        }
        else if (kichthuoc.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Kích Thước Không Được Để Trống");
            return;
        }
        else if (txtSoTrang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số Trang Không Được Để Trống");
            return;
        }
        else if (txtSKU.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "SKU Không Được Để Trống");
            return;
        }
        else if (mota.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mô Tả Không Được Để Trống");
            return;
        }else {
            int giatien = 0;
            int soluong = 0;
            Date nxb = null;
            int sotrang=0;
            int sku =0;
            try {
             giatien = Integer.parseInt(txtGiaTien.getText());
             soluong = Integer.parseInt(txtSoLuong.getText());
             nxb     = Date.valueOf(txtNgayXuatBan.getText());
             sotrang = Integer.parseInt(txtSoTrang.getText());
             sku     = Integer.parseInt(txtSKU.getText());
            SACH sach = new SACH(masach,tensach,matacgia,maloaisach,hinhanh,giatien,soluong,nxb,kichthuoc,sotrang,sku,mota);
             if(connDB.saveSach(sach) == 1) {
                 JOptionPane.showMessageDialog(rootPane, "Lưu Thành Công");
                 getSach();
             }else JOptionPane.showMessageDialog(rootPane, "Lưu Thất Bại");
            } catch (Exception e) {
                if(giatien == 0 ) JOptionPane.showMessageDialog(rootPane, "Giá Tiền Chỉ Nhận Số");
                else if(soluong == 0) JOptionPane.showMessageDialog(rootPane, "Số Lượng Chỉ Nhận Số");
                else if(nxb == null) JOptionPane.showMessageDialog(rootPane, "Định Dạng NXB là: yyyy-mm-dd");
                else if(sotrang == 0) JOptionPane.showMessageDialog(rootPane, "Số Trang Chỉ Nhận Số");
                else if(sku == 0) JOptionPane.showMessageDialog(rootPane, "SKU Chỉ Nhận Số");
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         int checkConfirm =  JOptionPane.showConfirmDialog(rootPane, "Xác Nhận Xoá Sách");
          if(checkConfirm == JOptionPane.YES_OPTION) {
             int checkXoaSach = connDB.delSach(txtMaSach.getText());
             if(checkXoaSach == 1) {
                 JOptionPane.showMessageDialog(rootPane, "Xoá Sách Thành Công");
                 getSach();
             }else 
                 JOptionPane.showMessageDialog(rootPane, "XOÁ THẤT BẠI");
          }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        int i = tbSach.getSelectedRow();
        txtMaSach.setText(dtm.getValueAt(i,0).toString());
        txtTenSach.setText(dtm.getValueAt(i, 1).toString());
        txtMaTacGia.setText(dtm.getValueAt(i, 2).toString());
        txtMaLoaiSach.setText(dtm.getValueAt(i, 3).toString());
        txtHinhAnh.setText(dtm.getValueAt(i, 4).toString());
        txtGiaTien.setText(dtm.getValueAt(i, 5).toString());
        txtSoLuong.setText(dtm.getValueAt(i, 6).toString());
        txtNgayXuatBan.setText(dtm.getValueAt(i, 7).toString());
        txtKichThuoc.setText(dtm.getValueAt(i, 8).toString());
        txtSoTrang.setText(dtm.getValueAt(i, 9).toString());
        txtSKU.setText(dtm.getValueAt(i, 10).toString());
        txtMoTa.setText(dtm.getValueAt(i, 11).toString());
        cBoxTacGia.setSelectedItem(connDB.getTacGia(txtMaTacGia.getText()));
        cBoxLoaiSach.setSelectedItem(connDB.getLoaiSach(txtMaLoaiSach.getText()));
    }//GEN-LAST:event_tbSachMouseClicked

    private void cBoxLoaiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxLoaiSachMouseClicked
        try {
            if(evt.getClickCount() == 2 && !evt.isConsumed()) {
           evt.consume();
         String loaiSach = JOptionPane.showInputDialog("Nhập Tên Loại Sách");
         if(loaiSach.isEmpty()) return;
         
         else {
             ConnectDB connectDB = connDB;
             String maloaisach = connectDB.randMaLoaiSach();
             int check = connectDB.saveLoaiSach(new LOAISACH(maloaisach,loaiSach));
             if(check == 1) {
                 JOptionPane.showMessageDialog(rootPane, "Thêm Loại Sách Thành Công");
                 getLoaiSach();
                 cBoxLoaiSach.setSelectedItem(loaiSach );
             }else  JOptionPane.showMessageDialog(rootPane, "Thêm Loại Sách Thất Bại");
         }
       }
        } catch (Exception e) {
            return;
        }
         
    }//GEN-LAST:event_cBoxLoaiSachMouseClicked

    private void cBoxTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxTacGiaActionPerformed
        String itemSelectCbox = cBoxTacGia.getSelectedItem().toString();
        String matacgia = connDB.getMaTacGia(itemSelectCbox);
        txtMaTacGia.setText(matacgia);
    }//GEN-LAST:event_cBoxTacGiaActionPerformed

    private void cBoxLoaiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxLoaiSachActionPerformed
        String itemSelectCbox = cBoxLoaiSach.getSelectedItem().toString();
        String maloaisach = connDB.getMaLoaiSach(itemSelectCbox);
        txtMaLoaiSach.setText(maloaisach);
    }//GEN-LAST:event_cBoxLoaiSachActionPerformed

    private void cBoxTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxTacGiaMouseClicked
        try {
            if(evt.getClickCount() == 2 && !evt.isConsumed()) {
           evt.consume();
         String tenTacGia = JOptionPane.showInputDialog("Nhập Tên Tác Giả");
         if(tenTacGia.isEmpty()) return;
         
         else {
             String matacgia = connDB.randMaTacGia();             
             int check = connDB.saveTacGia(new TACGIA(matacgia,tenTacGia));
             if(check == 1) {
                 JOptionPane.showMessageDialog(rootPane, "Thêm Tác Giả Thành Công");
                 getTacGia();
                 cBoxTacGia.setSelectedItem(tenTacGia);
             }else  JOptionPane.showMessageDialog(rootPane, "Thêm Tác Giả Thất Bại");
         }
       }
        } catch (Exception e) {
            return;
        }
    }//GEN-LAST:event_cBoxTacGiaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GIAODIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GIAODIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GIAODIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GIAODIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GIAODIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cBoxLoaiSach;
    private javax.swing.JComboBox<String> cBoxTacGia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel maSach;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtHinhAnh;
    private javax.swing.JTextField txtKichThuoc;
    private javax.swing.JTextField txtMaLoaiSach;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaTacGia;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtNgayXuatBan;
    private javax.swing.JTextField txtSKU;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoTrang;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
