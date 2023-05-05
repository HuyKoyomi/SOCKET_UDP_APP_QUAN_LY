/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien_Nguoi_Dung;

import CSDL.CSDL;
import CSDL.DocGia;
import CSDL.PhieuMuon;
import CSDL.Sach;
import CSDL.TaiKhoan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Koyomi
 */
public class tra_sach extends javax.swing.JPanel {

    private TaiKhoan tk;
    private DocGia dg;
    DefaultTableModel model;
    private DefaultTableModel tm;
    ArrayList<PhieuMuon> list = new ArrayList<PhieuMuon>();
    
    public tra_sach() {
        initComponents();
        String[] cols={"Mã Mượn", "Mã Sách","Tên Sách","Ngày Mượn", "Ngày Trả" ,"Trạng Thái" };
        tm = new DefaultTableModel(cols, 0);
        bang1.setModel(tm);
        model = (DefaultTableModel) bang1.getModel();
        bt_tra_sach.setEnabled(false);
    }
    
    private void xoa_bang(){
        model.setRowCount(0); // xóa bảng
    }
    private void show_bang(PhieuMuon x){
        x.setTenSach(CSDL.tim_sach_theo_id(x.getMaSach()));
        model.addRow(new Object[]{
            x.getMaMuon(),x.getMaSach(),x.getTenSach(),x.getNgayMuon(),x.getNgayTra(),x.getTrangThai()
        });   
    }
    private void show_bang(ArrayList<PhieuMuon> list){
        for(PhieuMuon x : list){
            x.setTenSach(CSDL.tim_sach_theo_id(x.getMaSach()));
            model.addRow(new Object[]{
                x.getMaMuon(),x.getMaSach(),x.getTenSach(),x.getNgayMuon(),x.getNgayTra(),x.getTrangThai()
            });   
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_loc = new javax.swing.JButton();
        cb_loc_the_loai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        bt_tim_kiem = new javax.swing.JButton();
        txt_tim_kiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_TenNguoiDung = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_MaPhieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ma_sach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ten_sach = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ngay_muon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ngay_tra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_trang_thai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bt_tra_sach = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(70, 70));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(bang1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 630, 450));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Cập Nhật Lại Bảng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 160, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        jLabel10.setText("Trả Sách");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 128, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel1.setText("Lọc Sách Theo Thể Loại");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 181, 23));

        bt_loc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_loc.setText("Lọc");
        bt_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_locActionPerformed(evt);
            }
        });
        add(bt_loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 92, -1));

        cb_loc_the_loai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_loc_the_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Đang Mượn", "Đã Trả" }));
        cb_loc_the_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loc_the_loaiActionPerformed(evt);
            }
        });
        add(cb_loc_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 92, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel9.setText("Tìm Kiếm Theo ID Phiếu Mượn :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 320, 21));

        bt_tim_kiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_tim_kiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/search-icon-16.png"))); // NOI18N
        bt_tim_kiem.setText("Tim kiem");
        bt_tim_kiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tim_kiemActionPerformed(evt);
            }
        });
        add(bt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 130, 120, 25));

        txt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tim_kiemActionPerformed(evt);
            }
        });
        add(txt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel3.setText("Thông Tin Phiếu Mượn");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 190, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Người Mượn");
        jLabel2.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel2.setMinimumSize(null);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, 100, 25));

        txt_TenNguoiDung.setEditable(false);
        txt_TenNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenNguoiDungActionPerformed(evt);
            }
        });
        add(txt_TenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mã Phiếu");
        jLabel6.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel6.setMinimumSize(null);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 100, 25));

        txt_MaPhieu.setEditable(false);
        add(txt_MaPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã Sách");
        jLabel4.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel4.setMinimumSize(null);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 290, 100, 25));

        txt_ma_sach.setEditable(false);
        txt_ma_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ma_sachActionPerformed(evt);
            }
        });
        add(txt_ma_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tên Sách");
        jLabel5.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel5.setMinimumSize(null);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 100, 25));

        txt_ten_sach.setEditable(false);
        add(txt_ten_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Ngày Mượn");
        jLabel13.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel13.setMinimumSize(null);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 370, 100, 25));

        txt_ngay_muon.setEditable(false);
        add(txt_ngay_muon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Trả");
        jLabel7.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel7.setMinimumSize(null);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 410, 100, 25));

        txt_ngay_tra.setEditable(false);
        txt_ngay_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ngay_traActionPerformed(evt);
            }
        });
        add(txt_ngay_tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Trạng Thái");
        jLabel8.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel8.setMinimumSize(null);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 450, 100, 25));

        txt_trang_thai.setEditable(false);
        add(txt_trang_thai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 25));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setText("Lấy Thông Tin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 150, 30));

        bt_tra_sach.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_tra_sach.setText("Trả Sách");
        bt_tra_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tra_sachActionPerformed(evt);
            }
        });
        add(bt_tra_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 120, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenNguoiDungActionPerformed

    }//GEN-LAST:event_txt_TenNguoiDungActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        xoa_bang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_MaPhieu.setText("");
        txt_ma_sach.setText("");
        txt_ma_sach.setText("");
        txt_ngay_muon.setText("");
        txt_ngay_tra.setText("");
        txt_trang_thai.setText("");
        bt_tra_sach.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int i = bang1.getSelectedRow(); // hang đang chỉ định
            PhieuMuon x = list.get(i); 
            txt_MaPhieu.setText(x.getMaMuon()+"");
            txt_ma_sach.setText(x.getMaSach()+"");
            txt_ten_sach.setText(x.getTenSach());
            txt_ngay_muon.setText(x.getNgayMuon());
            txt_ngay_tra.setText(x.getNgayTra());
            txt_trang_thai.setText(x.getTrangThai());
            if(txt_trang_thai.getText().equalsIgnoreCase("Dang Muon"))
                bt_tra_sach.setEnabled(true); // lay thong tin xong moi dc muon
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Phiếu Mượn cần lấy thông tin");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cb_loc_the_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loc_the_loaiActionPerformed

    }//GEN-LAST:event_cb_loc_the_loaiActionPerformed

    private void bt_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_locActionPerformed
        ArrayList<PhieuMuon> x = new ArrayList<>();
        String the_loai = (String) cb_loc_the_loai.getSelectedItem();
        if(the_loai.equalsIgnoreCase("ALL")){
            x = CSDL.tim_kiem_PhieuMuon_bang_id(dg.getID_DocGia());
        } 
        else if(the_loai.equalsIgnoreCase("Đang Mượn")){
            x = CSDL.tim_kiem_PhieuMuon_bang_id_va_Trang_Thai(dg.getID_DocGia(), "Dang Muon");
        }
        else if(the_loai.equalsIgnoreCase("Đã Trả")){
            x = CSDL.tim_kiem_PhieuMuon_bang_id_va_Trang_Thai(dg.getID_DocGia(), "Da Tra");
        }
        xoa_bang();
        show_bang(x);
    }//GEN-LAST:event_bt_locActionPerformed

    private void txt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tim_kiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tim_kiemActionPerformed

    private void bt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tim_kiemActionPerformed
        if (txt_tim_kiem.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Thông Tin Tìm Kiếm");
        } else {
            xoa_bang();       
            PhieuMuon x = CSDL.tim_kiem_PhieuMuon_bang_id_PhieuMuon(dg.getID_DocGia(),Integer.parseInt(txt_tim_kiem.getText()));
            show_bang(x);
        }
    }//GEN-LAST:event_bt_tim_kiemActionPerformed

    private void bt_tra_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tra_sachActionPerformed
        CSDL.update_PhieuMuon(Integer.parseInt(txt_MaPhieu.getText()));
        bt_tra_sach.setEnabled(false);
        this.list = CSDL.tim_kiem_PhieuMuon_bang_id(dg.getID_DocGia());
    }//GEN-LAST:event_bt_tra_sachActionPerformed

    private void txt_ngay_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ngay_traActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ngay_traActionPerformed

    private void txt_ma_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ma_sachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ma_sachActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JButton bt_loc;
    private javax.swing.JButton bt_tim_kiem;
    private javax.swing.JButton bt_tra_sach;
    private javax.swing.JComboBox<String> cb_loc_the_loai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_MaPhieu;
    private javax.swing.JTextField txt_TenNguoiDung;
    private javax.swing.JTextField txt_ma_sach;
    private javax.swing.JTextField txt_ngay_muon;
    private javax.swing.JTextField txt_ngay_tra;
    private javax.swing.JTextField txt_ten_sach;
    private javax.swing.JTextField txt_tim_kiem;
    private javax.swing.JTextField txt_trang_thai;
    // End of variables declaration//GEN-END:variables
    
    void set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(TaiKhoan tk, DocGia dg) {
        this.tk = tk;
        this.dg = dg;
        this.list = CSDL.tim_kiem_PhieuMuon_bang_id(dg.getID_DocGia());
        txt_TenNguoiDung.setText(dg.getTenNguoiDung());
    }
}
