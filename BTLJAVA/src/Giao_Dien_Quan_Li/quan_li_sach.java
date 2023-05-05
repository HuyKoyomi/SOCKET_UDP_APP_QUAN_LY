/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien_Quan_Li;

//import static Giao_dien.CSDL.lay_thong_tin_sach;
import CSDL.CSDL;
import CSDL.Sach;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Koyomi
 */
public class quan_li_sach extends javax.swing.JPanel {

    /**
     * Creates new form quan_li_sach
     */
    private DefaultTableModel tm;
    DefaultTableModel model;
    ArrayList<Sach> list = CSDL.all_sach();
    
    public quan_li_sach() {
        initComponents();
        String[] cols={"Mã Sách", "Tên Sách", "Tác Giả", "Thể Loại" ,"Năm Xuất Bản" , "Thời Gian Thêm","Số Lượng"};
        tm= new DefaultTableModel(cols, 0);
        bang1.setModel(tm);
        model = (DefaultTableModel) bang1.getModel();
        bt_ud_sach.setEnabled(false);
        bt_xoa_sach.setEnabled(false);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        bt_xoa_bang = new javax.swing.JButton();
        cb_loc_the_loai = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        bt_lay_tt = new javax.swing.JButton();
        bt_ud_sach = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bt_xoa_sach = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_tg_them = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_so_luong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 650, 460));

        bt_xoa_bang.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bt_xoa_bang.setText("Cập Nhật Lại Bảng");
        bt_xoa_bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoa_bangActionPerformed(evt);
            }
        });
        add(bt_xoa_bang, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 160, 35));

        cb_loc_the_loai.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cb_loc_the_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Toan", "Van", "Anh" }));
        cb_loc_the_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loc_the_loaiActionPerformed(evt);
            }
        });
        add(cb_loc_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 92, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton4.setText("Lọc");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 92, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lọc Sách Theo Thể Loại");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 181, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm Kiếm Sách Theo Mã Sách");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 280, 21));

        bt_tim_kiem.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bt_tim_kiem.setText("Tìm Kiếm");
        bt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tim_kiemActionPerformed(evt);
            }
        });
        add(bt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 25));

        txt_tim_kiem.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tim_kiemActionPerformed(evt);
            }
        });
        add(txt_tim_kiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 163, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sửa Thông Tin Sách");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 200, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã Sách");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, 70, 30));

        txt_ma_sach.setEditable(false);
        add(txt_ma_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên Sách");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 70, 30));
        add(txt_ten_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thể Loại");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 290, 70, 30));
        add(txt_the_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tác Giả");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 70, 30));
        add(txt_tac_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Xuất Bản");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 370, 70, 30));
        add(txt_namxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 25));

        bt_lay_tt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bt_lay_tt.setText("Lấy Thông Tin");
        bt_lay_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lay_ttActionPerformed(evt);
            }
        });
        add(bt_lay_tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 130, 30));

        bt_ud_sach.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bt_ud_sach.setText("Cập Nhật");
        bt_ud_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ud_sachActionPerformed(evt);
            }
        });
        add(bt_ud_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 130, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Xóa trắng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 130, 30));

        bt_xoa_sach.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bt_xoa_sach.setText("Xóa Sách");
        bt_xoa_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoa_sachActionPerformed(evt);
            }
        });
        add(bt_xoa_sach, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TG Thêm");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 410, 70, 30));
        add(txt_tg_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Số Lượng");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 450, 70, 30));
        add(txt_so_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quản Lí  Sách");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg3.jpg"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tim_kiemActionPerformed
        int s  = Integer.parseInt(txt_tim_kiem.getText());
        xoa_bang();
        for(Sach x : list)
            if(x.getMaSach() == s) {
                show_bang(x);
                break;
            }     
    }//GEN-LAST:event_bt_tim_kiemActionPerformed

    private void txt_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tim_kiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tim_kiemActionPerformed

    private void bt_xoa_bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoa_bangActionPerformed
        xoa_bang();
    }//GEN-LAST:event_bt_xoa_bangActionPerformed

    private void cb_loc_the_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loc_the_loaiActionPerformed

    }//GEN-LAST:event_cb_loc_the_loaiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<Sach> x = new ArrayList<Sach>();
        String the_loai = (String) cb_loc_the_loai.getSelectedItem();
        System.out.println("Lua chon cua ban la: " + the_loai);
        if(the_loai.equalsIgnoreCase("ALL"))
            x = CSDL.all_sach();
        else
            x = CSDL.loc_sach_theo_the_loai(the_loai);
        xoa_bang();
        show_bang(x);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_xoa_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoa_sachActionPerformed
        int i = bang1.getSelectedRow(); // hang đang chỉ định
        Sach x = list.get(i);
        CSDL.delete_Sach(x); //xóa trên CSDL
        list.remove(x);// xóa khỏi danh sách
        model.removeRow(i); // xóa hiển thị trên bảng
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_bt_xoa_sachActionPerformed

    private void bt_ud_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ud_sachActionPerformed
        Sach x = new Sach();
        for(Sach i : list)
            if(i.getMaSach() == Integer.parseInt(txt_ma_sach.getText())){
                x = i;break;
            }
        // cap nhan sach
        System.out.println(x.getMaSach());
        x.setTenSach(txt_ten_sach.getText());
        x.setTheLoai(txt_the_loai.getText());
        x.setTacGia(txt_tac_gia.getText());
        x.setNamXB(Integer.parseInt(txt_namxb.getText()));
        x.setThoiGianThem(txt_tg_them.getText());
        x.setSoLuong(Integer.parseInt(txt_so_luong.getText()));
        // cap nhat trong csdl
        CSDL.update_Sach(x);
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_bt_ud_sachActionPerformed

    private void bt_lay_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lay_ttActionPerformed
        int i = bang1.getSelectedRow(); // hang đang chỉ định
        Sach x = list.get(i);
        txt_ma_sach.setText(x.getMaSach()+"");
        txt_ten_sach.setText(x.getTenSach());
        txt_the_loai.setText(x.getTheLoai());
        txt_tac_gia.setText(x.getTacGia());
        txt_namxb.setText(x.getNamXB()+"");
        txt_tg_them.setText(x.getThoiGianThem());
        txt_so_luong.setText(x.getSoLuong()+"");
        bt_ud_sach.setEnabled(true);
        bt_xoa_sach.setEnabled(true);
    }//GEN-LAST:event_bt_lay_ttActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_ma_sach.setText("");
        txt_ten_sach.setText("");
        txt_the_loai.setText("");
        txt_tac_gia.setText("");
        txt_namxb.setText("");
        txt_tg_them.setText("");
        txt_so_luong.setText("");
        bt_ud_sach.setEnabled(false);
        bt_xoa_sach.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_lay_tt;
    private javax.swing.JButton bt_tim_kiem;
    private javax.swing.JButton bt_ud_sach;
    private javax.swing.JButton bt_xoa_bang;
    private javax.swing.JButton bt_xoa_sach;
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
    private javax.swing.JTextField txt_ma_sach;
    private javax.swing.JTextField txt_namxb;
    private javax.swing.JTextField txt_so_luong;
    private javax.swing.JTextField txt_tac_gia;
    private javax.swing.JTextField txt_ten_sach;
    private javax.swing.JTextField txt_tg_them;
    private javax.swing.JTextField txt_the_loai;
    private javax.swing.JTextField txt_tim_kiem;
    // End of variables declaration//GEN-END:variables
}
