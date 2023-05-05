/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Giao_Dien_Nguoi_Dung;

import CSDL.DocGia;
import CSDL.PhieuMuon;
import CSDL.Sach;
import CSDL.TaiKhoan;
import CSDL.CSDL;
import javax.swing.JOptionPane;

/**
 *
 * @author Koyomi
 */
public class dang_ki_muon extends javax.swing.JFrame {

    private TaiKhoan tk;
    private DocGia dg;
    private Sach sach;
    
    public dang_ki_muon() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        bt_dk_muon = new javax.swing.JButton();
        bt_quay_lai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ma_sach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ten_sach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_the_loai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_tac_gia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_namxb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_TenNguoiDung = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_ID_DocGia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Ngay_Muon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_Ngay_Tra = new javax.swing.JTextField();
        bt_camket = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setText("Phiếu Mượn Sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 235, 40));

        bt_dk_muon.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bt_dk_muon.setText("Đăng Kí Mượn Sách");
        bt_dk_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dk_muonActionPerformed(evt);
            }
        });
        getContentPane().add(bt_dk_muon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 174, -1));

        bt_quay_lai.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bt_quay_lai.setText("Quay Lại");
        bt_quay_lai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quay_laiActionPerformed(evt);
            }
        });
        getContentPane().add(bt_quay_lai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 156, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel3.setText("Thông Tin Sách");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mã Sách");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 25));

        txt_ma_sach.setEditable(false);
        getContentPane().add(txt_ma_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tên Sách");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 25));

        txt_ten_sach.setEditable(false);
        getContentPane().add(txt_ten_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Thể Loại");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, 25));

        txt_the_loai.setEditable(false);
        getContentPane().add(txt_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tác Giả");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 25));

        txt_tac_gia.setEditable(false);
        txt_tac_gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tac_giaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tac_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Xuất Bản");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 25));

        txt_namxb.setEditable(false);
        txt_namxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namxbActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel2.setText("Thông Tin Phiếu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 150, 30));

        txt_TenNguoiDung.setEditable(false);
        getContentPane().add(txt_TenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 198, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Tên Người Mượn");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID Người Mượn");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 25));

        txt_ID_DocGia.setEditable(false);
        getContentPane().add(txt_ID_DocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 198, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Ngày Mượn");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 100, 25));

        txt_Ngay_Muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ngay_MuonActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ngay_Muon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 198, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ngày Trả");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 100, 25));
        getContentPane().add(txt_Ngay_Tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 198, 25));

        bt_camket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_camket.setText("Tôi cam kết sẽ hoàn sách trước thời hạn");
        getContentPane().add(bt_camket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 315, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Ngay_MuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ngay_MuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ngay_MuonActionPerformed

    private void bt_dk_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dk_muonActionPerformed
        if(txt_Ngay_Muon.getText().equalsIgnoreCase("") || txt_Ngay_Tra.getText().equalsIgnoreCase("")) 
            JOptionPane.showMessageDialog(this, "Thong TIn Khong Duoc De Trang");
        else {
            PhieuMuon x = new PhieuMuon();
            x.setID_DocGia(tk.getID_DocGia());
            x.setNgayMuon(txt_Ngay_Muon.getText());
            x.setNgayTra(txt_Ngay_Tra.getText());
            x.setMaSach(sach.getMaSach());
            x.setTrangThai("Dang Muon");
            CSDL.add_PhieuMuon(x);
            JOptionPane.showMessageDialog(this, "Dang Ki Thanh Cong");
        }
    }//GEN-LAST:event_bt_dk_muonActionPerformed

    private void bt_quay_laiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quay_laiActionPerformed
       this.dispose();
    }//GEN-LAST:event_bt_quay_laiActionPerformed

    private void txt_tac_giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tac_giaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tac_giaActionPerformed

    private void txt_namxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namxbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dang_ki_muon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bt_camket;
    private javax.swing.JButton bt_dk_muon;
    private javax.swing.JButton bt_quay_lai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txt_ID_DocGia;
    private javax.swing.JTextField txt_Ngay_Muon;
    private javax.swing.JTextField txt_Ngay_Tra;
    private javax.swing.JTextField txt_TenNguoiDung;
    private javax.swing.JTextField txt_ma_sach;
    private javax.swing.JTextField txt_namxb;
    private javax.swing.JTextField txt_tac_gia;
    private javax.swing.JTextField txt_ten_sach;
    private javax.swing.JTextField txt_the_loai;
    // End of variables declaration//GEN-END:variables

    void set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(TaiKhoan tk, DocGia dg) {
        this.dg = dg;
        this.tk=tk;
        txt_ID_DocGia.setText(dg.getID_DocGia()+"");
        txt_TenNguoiDung.setText(dg.getTenNguoiDung());
        
    }
    public void set_Sach(Sach sach) {
        this.sach = sach;
        txt_ma_sach.setText(this.sach.getMaSach()+"");
        txt_ten_sach.setText(this.sach.getTenSach()+"");
        txt_the_loai.setText(this.sach.getTheLoai()+"");
        txt_namxb.setText(this.sach.getNamXB()+"");
        txt_tac_gia.setText(this.sach.getTacGia()+"");        
    }
}
