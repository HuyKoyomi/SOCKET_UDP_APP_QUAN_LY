/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien_Nguoi_Dung;

//import static Giao_dien.CSDL.lay_thong_tin_sach;
import Giao_Dien_Quan_Li.*;
import CSDL.CSDL;
import CSDL.DocGia;
import CSDL.Sach;
import CSDL.TaiKhoan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Koyomi
 */
public class muon_sach extends javax.swing.JPanel {

    private TaiKhoan tk;
    private DocGia dg;
    private DefaultTableModel tm;
    DefaultTableModel model;
    ArrayList<Sach> list = CSDL.all_sach();
    private boolean dang_ki = false;
    
    public muon_sach() {
        initComponents();
        String[] cols={"Mã Sách", "Tên Sách", "Tác Giả", "Thể Loại" ,"Năm XB" , "Thời Gian Thêm","Số Lượng"};
        tm= new DefaultTableModel(cols, 0);
        bang1.setModel(tm);
        model = (DefaultTableModel) bang1.getModel();
        bt_dang_ki_muon.setEnabled(false);
    }
    
    private void show_bang(Sach x){
        model.addRow(new Object[]{
            x.getMaSach(),x.getTenSach(),x.getTacGia(),x.getTheLoai(),x.getNamXB(),x.getThoiGianThem(),x.getSoLuong()  
        });   
    }
    private void show_bang(ArrayList<Sach> ds){
        for(Sach x : ds){
            model.addRow(new Object[]{
                x.getMaSach(),x.getTenSach(),x.getTacGia(),x.getTheLoai(),x.getNamXB(),x.getThoiGianThem(),x.getSoLuong()  
            });
        }
    }
    private void xoa_bang(){
        model.setRowCount(0); // xóa bảng
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        bt_xoa_bang = new javax.swing.JButton();
        muon_sach = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_loc_the_loai = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_tim_kiem = new javax.swing.JButton();
        txt_tim_kiem = new javax.swing.JTextField();
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
        txt_tg_them = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_so_luong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt_lay_tt = new javax.swing.JButton();
        bt_dang_ki_muon = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(900, 600));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 630, 450));

        bt_xoa_bang.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_xoa_bang.setText("Cập Nhật Lại Bảng");
        bt_xoa_bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoa_bangActionPerformed(evt);
            }
        });
        add(bt_xoa_bang, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 160, 30));

        muon_sach.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        muon_sach.setText("Mượn Sách");
        add(muon_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel1.setText("Lọc Sách Theo Thể Loại");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 200, 23));

        cb_loc_the_loai.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cb_loc_the_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Toan", "Van", "Anh" }));
        cb_loc_the_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loc_the_loaiActionPerformed(evt);
            }
        });
        add(cb_loc_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 92, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setText("Lọc");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 92, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel2.setText("Tìm Kiếm Sách Theo Tên Bắt Đầu Bằng :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 350, 21));

        bt_tim_kiem.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_tim_kiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/search-icon-16.png"))); // NOI18N
        bt_tim_kiem.setText("Tìm Kiếm");
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
        jLabel3.setText("Sửa Thông Tin Sách");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 350, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã Sách");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, 70, 30));

        txt_ma_sach.setEditable(false);
        add(txt_ma_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tên Sách");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 70, 30));

        txt_ten_sach.setEditable(false);
        add(txt_ten_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Thể Loại");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 290, 70, 30));

        txt_the_loai.setEditable(false);
        add(txt_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tác Giả");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 70, 30));

        txt_tac_gia.setEditable(false);
        add(txt_tac_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Xuất Bản");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 370, 70, 30));

        txt_namxb.setEditable(false);
        add(txt_namxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 25));

        txt_tg_them.setEditable(false);
        add(txt_tg_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("TG Thêm");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 410, 70, 30));

        txt_so_luong.setEditable(false);
        add(txt_so_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Số Lượng");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 450, 70, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 30));

        bt_lay_tt.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_lay_tt.setText("Lấy Thông Tin");
        bt_lay_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lay_ttActionPerformed(evt);
            }
        });
        add(bt_lay_tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 150, 30));

        bt_dang_ki_muon.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_dang_ki_muon.setText("Đăng Kí Mượn Sách");
        bt_dang_ki_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dang_ki_muonActionPerformed(evt);
            }
        });
        add(bt_dang_ki_muon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 174, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tim_kiemActionPerformed
        if (txt_tim_kiem.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm");
        } else {
            xoa_bang();       
            ArrayList<Sach> tmp = CSDL.loc_sach_theo_ten(txt_tim_kiem.getText());
            System.out.print(tmp.size());
            show_bang(tmp);
        }
    }//GEN-LAST:event_bt_tim_kiemActionPerformed

    private void txt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tim_kiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tim_kiemActionPerformed

    private void bt_xoa_bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoa_bangActionPerformed
        xoa_bang();
    }//GEN-LAST:event_bt_xoa_bangActionPerformed
        private Sach sach = null;
    private void bt_lay_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lay_ttActionPerformed
        try {
            int i = bang1.getSelectedRow(); // hang đang chỉ định
            sach = list.get(i); 
            txt_ma_sach.setText(sach.getMaSach()+"");
            txt_ten_sach.setText(sach.getTenSach());
            txt_the_loai.setText(sach.getTheLoai());
            txt_tac_gia.setText(sach.getTacGia());
            txt_namxb.setText(sach.getNamXB()+"");
            txt_tg_them.setText(sach.getThoiGianThem());
            txt_so_luong.setText(sach.getSoLuong()+"");
            bt_dang_ki_muon.setEnabled(true); // lay thong tin xong moi dc muon
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách cần lấy thông tin");
        }
        
    }//GEN-LAST:event_bt_lay_ttActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_ma_sach.setText("");
        txt_ten_sach.setText("");
        txt_the_loai.setText("");
        txt_tac_gia.setText("");
        txt_namxb.setText("");
        txt_tg_them.setText("");
        txt_so_luong.setText("");
        bt_dang_ki_muon.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_dang_ki_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dang_ki_muonActionPerformed

        dang_ki_muon dkm = new dang_ki_muon();
        dkm.set_Sach(sach);
        dkm.set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(tk,dg);
        dkm.setVisible(true);
    }//GEN-LAST:event_bt_dang_ki_muonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<Sach> x = new ArrayList<Sach>();
        String the_loai = (String) cb_loc_the_loai.getSelectedItem();
        System.out.print(the_loai);
        if(the_loai.equalsIgnoreCase("ALL"))
        x = CSDL.all_sach();
        else
        x = CSDL.loc_sach_theo_the_loai(the_loai);
        xoa_bang();
        show_bang(x);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cb_loc_the_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loc_the_loaiActionPerformed

    }//GEN-LAST:event_cb_loc_the_loaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JButton bt_dang_ki_muon;
    private javax.swing.JButton bt_lay_tt;
    private javax.swing.JButton bt_tim_kiem;
    private javax.swing.JButton bt_xoa_bang;
    private javax.swing.JComboBox<String> cb_loc_the_loai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel muon_sach;
    private javax.swing.JTextField txt_ma_sach;
    private javax.swing.JTextField txt_namxb;
    private javax.swing.JTextField txt_so_luong;
    private javax.swing.JTextField txt_tac_gia;
    private javax.swing.JTextField txt_ten_sach;
    private javax.swing.JTextField txt_tg_them;
    private javax.swing.JTextField txt_the_loai;
    private javax.swing.JTextField txt_tim_kiem;
    // End of variables declaration//GEN-END:variables

    void set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(TaiKhoan tk, DocGia dg) {
        this.tk = tk;
        this.dg = dg;
    }
}
