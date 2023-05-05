/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien_Quan_Li;

import CSDL.CSDL;
import CSDL.DocGia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Koyomi
 */
public class quan_li_doc_gia extends javax.swing.JPanel {

    ArrayList<DocGia> list = CSDL.all_DocGia();
    private DefaultTableModel tm;
    DefaultTableModel model;
    
    public quan_li_doc_gia() {
        initComponents();
        String[] cols={"Tài Khoản","Mã Độc Giả","Họ Tên", "Ngày Sinh", "Nghề Nghiệp","SDT","Địa Chỉ"};
        tm= new DefaultTableModel(cols, 0);
        bang1.setModel(tm);
        model = (DefaultTableModel) bang1.getModel();
    }

    private void xoa_bang(){
        model.setRowCount(0); // xóa bảng
    }
    private void show_bang(DocGia x){
        x.setTaiKhoan(CSDL.tim_kiem_tai_khoan_bang_id(x.getID_DocGia()));
        model.addRow(new Object[]{            
            x.getTaiKhoan(),x.getID_DocGia(),x.getTenNguoiDung(),x.getNgaySinh(),x.getNgheNghiep(),x.getSDT(),x.getDiaChi()
        });   
    }
    private void show_bang(ArrayList<DocGia> list){
        for(DocGia x : list){
            x.setTaiKhoan(CSDL.tim_kiem_tai_khoan_bang_id(x.getID_DocGia()));
            model.addRow(new Object[]{            
                x.getTaiKhoan(),x.getID_DocGia(),x.getTenNguoiDung(),x.getNgaySinh(),x.getNgheNghiep(),x.getSDT(),x.getDiaChi()
            }); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_loc_the_loai = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_ID_DocGia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_TenNguoiDung = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_NgaySinh = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_nghe_nghiep = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_DiaChi = new javax.swing.JTextArea();
        bt_xem = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        bt_tim_kiem = new javax.swing.JButton();
        txt_tim_kiem = new javax.swing.JTextField();
        bt_reset_bang = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quản Lí Độc Giả");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lọc Độc Giả");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 181, 23));

        cb_loc_the_loai.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cb_loc_the_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        cb_loc_the_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loc_the_loaiActionPerformed(evt);
            }
        });
        add(cb_loc_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 92, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setText("Lọc");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm Kiếm Độc Giả Theo Tên:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 280, 21));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tài Khoản");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, 90, 20));

        txt_tk.setEditable(false);
        add(txt_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mã Độc giả");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 240, 200, 20));

        txt_ID_DocGia.setEditable(false);
        add(txt_ID_DocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, 25));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tên Độc Giả");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 270, 200, 20));

        txt_TenNguoiDung.setEditable(false);
        add(txt_TenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 25));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ngày Sinh");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 200, 20));

        txt_NgaySinh.setEditable(false);
        add(txt_NgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 210, 25));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Số Điện Thoại");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 200, 20));

        txt_SDT.setEditable(false);
        add(txt_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 25));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nghề Nghiệp");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 360, 200, 20));

        txt_nghe_nghiep.setEditable(false);
        add(txt_nghe_nghiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 210, 25));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Địa Chỉ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 390, 90, 25));

        txt_DiaChi.setEditable(false);
        txt_DiaChi.setColumns(20);
        txt_DiaChi.setRows(5);
        jScrollPane4.setViewportView(txt_DiaChi);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 210, -1));

        bt_xem.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_xem.setText("Hiển Thị");
        bt_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xemActionPerformed(evt);
            }
        });
        add(bt_xem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 100, 25));

        bt_xoa.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_xoa.setText("Xóa Người Dùng");
        bt_xoa.setEnabled(false);
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        bt_reset.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_reset.setText("Xóa Trắng");
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });
        add(bt_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sửa Thông Tin Sách");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 200, 25));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 580, 400));

        bt_tim_kiem.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_tim_kiem.setText("Tìm Kiếm");
        bt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tim_kiemActionPerformed(evt);
            }
        });
        add(bt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, -1, 25));

        txt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tim_kiemActionPerformed(evt);
            }
        });
        add(txt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, 25));

        bt_reset_bang.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bt_reset_bang.setText("Xóa Trắng Bảng");
        bt_reset_bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reset_bangActionPerformed(evt);
            }
        });
        add(bt_reset_bang, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 140, 30));

        bg.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg3.jpg"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1000, 650));
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void cb_loc_the_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loc_the_loaiActionPerformed

    }//GEN-LAST:event_cb_loc_the_loaiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<DocGia> x = new ArrayList<>();
        x = CSDL.all_DocGia();
        xoa_bang();
        show_bang(x);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xemActionPerformed
        if(txt_DiaChi.getText().equalsIgnoreCase("") ||
            txt_ID_DocGia.getText().equalsIgnoreCase("")  ||
            txt_NgaySinh.getText().equalsIgnoreCase("")  ||
            txt_SDT.getText().equalsIgnoreCase("")  ||
            txt_TenNguoiDung.getText().equalsIgnoreCase("") ||
            txt_nghe_nghiep.getText().equalsIgnoreCase("")  
                )
            JOptionPane.showMessageDialog(this, "Không được để trắng thông tin");
        int i = bang1.getSelectedRow(); // hang đang chỉ định
        DocGia x = list.get(i);
        x.setTaiKhoan(CSDL.tim_kiem_tai_khoan_bang_id(x.getID_DocGia()));
        txt_tk.setText(x.getTaiKhoan());
        txt_ID_DocGia.setText(x.getID_DocGia()+"");
        txt_TenNguoiDung.setText(x.getTenNguoiDung());
        txt_NgaySinh.setText(x.getNgaySinh());
        txt_SDT.setText(x.getSDT());
        txt_nghe_nghiep.setText(x.getNgheNghiep());
        txt_DiaChi.setText(x.getDiaChi());
        bt_xoa.setEnabled(true);
    }//GEN-LAST:event_bt_xemActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        int i = bang1.getSelectedRow(); // hang đang chỉ định
        DocGia x = list.get(i);
        CSDL.delete_DocGia(x); //xóa trên CSDL
        list.remove(x);// xóa khỏi danh sách
        model.removeRow(i); // xóa hiển thị trên bảng
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        txt_tk.setText("");
        txt_ID_DocGia.setText("");
        txt_TenNguoiDung.setText("");
        txt_NgaySinh.setText("");
        txt_SDT.setText("");
        txt_nghe_nghiep.setText("");
        txt_DiaChi.setText("");
        bt_xoa.setEnabled(false);
    }//GEN-LAST:event_bt_resetActionPerformed

    private void bt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tim_kiemActionPerformed
        ArrayList<DocGia> x = CSDL.loc_DoCGia_theo_ten(txt_tim_kiem.getText());
        xoa_bang();
        show_bang(x);
    }//GEN-LAST:event_bt_tim_kiemActionPerformed

    private void txt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tim_kiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tim_kiemActionPerformed

    private void bt_reset_bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reset_bangActionPerformed
        xoa_bang();
    }//GEN-LAST:event_bt_reset_bangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_reset;
    private javax.swing.JButton bt_reset_bang;
    private javax.swing.JButton bt_tim_kiem;
    private javax.swing.JButton bt_xem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox<String> cb_loc_the_loai;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txt_DiaChi;
    private javax.swing.JTextField txt_ID_DocGia;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenNguoiDung;
    private javax.swing.JTextField txt_nghe_nghiep;
    private javax.swing.JTextField txt_tim_kiem;
    private javax.swing.JTextField txt_tk;
    // End of variables declaration//GEN-END:variables

    
}
