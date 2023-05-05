/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien_Quan_Li;


import CSDL.Sach;
import CSDL.CSDL;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Koyomi
 */
public class them_sach extends javax.swing.JPanel {

    DefaultTableModel tm;
    ArrayList<Sach> list = new ArrayList<>();
    DefaultTableModel model;
    
    public them_sach() {
        initComponents();
        setSize(900,900);
        String [] cols = {"STT Sách", "Tên Sách", "Tác Giả", "Thể Loại", "Năm Xuất Bản", "Thời Gian Thêm", "Số Lượng"};
        tm = new DefaultTableModel(cols,0);
        bang1.setModel(tm);
        model = (DefaultTableModel) bang1.getModel(); // hien thi
        jButton3.setEnabled(false);
    }

    private void show_bang(){
        Sach x = list.get(list.size()-1);
        model.addRow(new Object[]{
            list.size(),x.getTenSach(),x.getTacGia(),x.getTheLoai(),x.getNamXB(),x.getThoiGianThem(),x.getSoLuong()  
        });
    }
    
     private void show_all_bang(){
        model.setRowCount(0); // xóa bảng
        int dem = 1;
        for(Sach x : list){
        model.addRow(new Object[]{
                dem++,x.getTenSach(),x.getTacGia(),x.getTheLoai(),x.getNamXB(),x.getThoiGianThem(),x.getSoLuong()  
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        txt_ma_sach = new javax.swing.JTextField();
        txt_ten_sach = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tac_gia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_the_loai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_namxb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_tg_them = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_so_luong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bt_xoa_hang = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thêm Sách");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, -1));

        bang1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Sach", "Ten Sach", "Tac Gia", "The Loai", "Năm XB", "TG Them", "So luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bang1.setGridColor(new java.awt.Color(153, 153, 255));
        bang1.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(bang1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 590, 460));

        txt_ma_sach.setEditable(false);
        txt_ma_sach.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txt_ma_sach.setText("Thêm Tự Động");
        txt_ma_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ma_sachActionPerformed(evt);
            }
        });
        add(txt_ma_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 250, 25));
        add(txt_ten_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 250, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Sách");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên Sách");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tác Giả");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 25));
        add(txt_tac_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 250, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thể Loại");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 25));
        add(txt_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 250, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xuất Bản");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 25));
        add(txt_namxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 250, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TG Thêm");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 25));
        add(txt_tg_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 250, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số Lượng");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 25));
        add(txt_so_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 250, 25));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setText("Tạo Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 25));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setText("Hiển Thị");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, 25));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton3.setText("Cập Nhật");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 25));

        bt_xoa_hang.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bt_xoa_hang.setText("Xoá hàng");
        bt_xoa_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoa_hangActionPerformed(evt);
            }
        });
        add(bt_xoa_hang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 100, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thông Tin Sách");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setText("Xóa Bảng");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        bg.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg3.jpg"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_namxb.setText("");
        txt_so_luong.setText("");
        txt_tac_gia.setText("");
        txt_ten_sach.setText("");
        txt_tg_them.setText("");
        txt_the_loai.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_ma_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ma_sachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ma_sachActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(txt_ten_sach.getText().equalsIgnoreCase("") ||
            txt_namxb.getText().equalsIgnoreCase("")  ||
            txt_so_luong.getText().equalsIgnoreCase("")  ||
            txt_tac_gia.getText().equalsIgnoreCase("")  ||
            txt_the_loai.getText().equalsIgnoreCase("") ||
            txt_tg_them.getText().equalsIgnoreCase("")  
                )
            JOptionPane.showMessageDialog(this, "Không được để trắng thông tin");
        Sach x = new Sach();
//        x.setMaSach(Integer.parseInt(txt_ma_sach.getText()));
        x.setTacGia(txt_tac_gia.getText());
        x.setTenSach(txt_ten_sach.getText());
        x.setThoiGianThem(txt_tg_them.getText());
        x.setTheLoai(txt_the_loai.getText());
        x.setNamXB(Integer.parseInt(txt_namxb.getText()));
        x.setSoLuong(Integer.parseInt(txt_so_luong.getText()));
        list.add(x);
        show_bang();
        jButton3.setEnabled(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for(Sach i : list) CSDL.add_Sach(i);  
        model.setRowCount(0); // xóa bảng
        JOptionPane.showMessageDialog(this, "Cập Nhật Sách Vào Kho Thành Công");
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_xoa_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoa_hangActionPerformed
        int i = bang1.getSelectedRow();
        Sach x = list.get(i);
        list.remove(x);
        model.removeRow(i);
        
        show_all_bang();
        
    }//GEN-LAST:event_bt_xoa_hangActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        model.setRowCount(0); // xóa bảng
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_xoa_hang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ma_sach;
    private javax.swing.JTextField txt_namxb;
    private javax.swing.JTextField txt_so_luong;
    private javax.swing.JTextField txt_tac_gia;
    private javax.swing.JTextField txt_ten_sach;
    private javax.swing.JTextField txt_tg_them;
    private javax.swing.JTextField txt_the_loai;
    // End of variables declaration//GEN-END:variables

}
