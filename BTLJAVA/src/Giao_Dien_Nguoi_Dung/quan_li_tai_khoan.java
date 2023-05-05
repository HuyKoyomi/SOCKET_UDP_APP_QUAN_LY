/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Giao_Dien_Nguoi_Dung;

import CSDL.DocGia;
import CSDL.TaiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author Koyomi
 */
public class quan_li_tai_khoan extends javax.swing.JFrame {

    /**
     * Creates new form quan_li_tai_khoan
     */
    private TaiKhoan tk = CSDL.CSDL.tai_khoan("admin");
    private DocGia dg ;
    
    public quan_li_tai_khoan() {
        initComponents();
        setLocationRelativeTo(this);
        dg = CSDL.CSDL.tim_kiem_DocGia_bang_id(tk.getID_DocGia());
        update_thong_tin();
    }
    
    private void update_thong_tin(){
        txt_tk.setText(tk.gettaikhoan());
        txt_tk1.setText(tk.gettaikhoan());
        txt_ID_DocGia.setText(dg.getID_DocGia()+"");
        txt_TenNguoiDung.setText(dg.getTenNguoiDung());
        txt_NgaySinh.setText(dg.getNgaySinh());
        txt_SDT.setText(dg.getSDT());
        txt_nghe_nghiep.setText(dg.getNgheNghiep());
        txt_DiaChi.setText(dg.getDiaChi());
    }
    public void set_TaiKhoan(TaiKhoan x){
        tk = x;
        txt_tk.setText(tk.gettaikhoan());
        dg = CSDL.CSDL.tim_kiem_DocGia_bang_id(tk.getID_DocGia());
        update_thong_tin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_mk_cu = new javax.swing.JPasswordField();
        txt_mk_moi = new javax.swing.JPasswordField();
        txt_nhap_lai = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_tk1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_ID_DocGia = new javax.swing.JTextField();
        txt_TenNguoiDung = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_NgaySinh = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        txt_nghe_nghiep = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_DiaChi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Đổi Mật Khẩu");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 131, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tài Khoản");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 25));

        txt_tk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_tk.setEnabled(false);
        txt_tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tkActionPerformed(evt);
            }
        });
        jPanel2.add(txt_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mật Khẩu cũ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mật Khẩu Mớii");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nhập lại Mật Khẩu");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 25));

        jButton3.setText("Cập Nhật");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 121, -1));

        txt_mk_cu.setText("jPasswordField1");
        jPanel2.add(txt_mk_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 25));

        txt_mk_moi.setText("jPasswordField2");
        jPanel2.add(txt_mk_moi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 25));

        txt_nhap_lai.setText("jPasswordField3");
        jPanel2.add(txt_nhap_lai, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 25));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        bg1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        bg1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel2.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 660, 600));

        jTabbedPane2.addTab("Đổi Mật Khẩu", jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Tài Khoản");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 25));

        txt_tk1.setEditable(false);
        txt_tk1.setEnabled(false);
        txt_tk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tk1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_tk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 210, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Mã Độc giả");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 25));

        txt_ID_DocGia.setEditable(false);
        jPanel1.add(txt_ID_DocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 25));
        jPanel1.add(txt_TenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 210, 25));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Tên Độc Giả");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 25));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Ngày Sinh");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 25));
        jPanel1.add(txt_NgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 25));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Số Điện Thoại");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 25));
        jPanel1.add(txt_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 210, 25));
        jPanel1.add(txt_nghe_nghiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 210, 25));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Nghề Nghiệp");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, 25));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Địa Chỉ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 25));

        txt_DiaChi.setColumns(20);
        txt_DiaChi.setRows(5);
        jScrollPane4.setViewportView(txt_DiaChi);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Sửa Thông Tin Tài Khoản");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Cập Nhật ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 110, 30));

        bg2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        bg2.setAlignmentY(0.0F);
        bg2.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        jTabbedPane2.addTab("Thông Tin Tài Khoản", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 680, 640));

        jMenu1.setText("Quay Lại");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tkActionPerformed

    }//GEN-LAST:event_txt_tkActionPerformed
    
    private String getString(char x[]){
        String res = "";
        for(char i : x) res+=i;
        return res;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String mk1 = getString(txt_mk_cu.getPassword());
        String mk2 = getString(txt_mk_moi.getPassword());
        String mk3 = getString(txt_nhap_lai.getPassword());
        if(mk1.equalsIgnoreCase("") ||mk2.equalsIgnoreCase("") || mk3.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
        else if(!mk1.equalsIgnoreCase(tk.getMatkhau())){
                JOptionPane.showMessageDialog(this, "Sai mật khẩu");
        } 
        else if(!mk2.equals(mk3)){
            JOptionPane.showMessageDialog(this, "Mật khẩu không khớp");
        }
        else { //update
            tk.setMatkhau(mk3);
            CSDL.CSDL.update_TaiKhoan(tk);
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_tk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tk1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dg.setDiaChi(txt_DiaChi.getText());
        dg.setNgaySinh(txt_NgaySinh.getText());
        dg.setNgheNghiep(txt_nghe_nghiep.getText());
        dg.setTenNguoiDung(txt_TenNguoiDung.getText());
        dg.setSDT(txt_SDT.getText());
        CSDL.CSDL.update_DocGia(dg);
        System.out.println("Update Thanh COng");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(quan_li_tai_khoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quan_li_tai_khoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quan_li_tai_khoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quan_li_tai_khoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quan_li_tai_khoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea txt_DiaChi;
    private javax.swing.JTextField txt_ID_DocGia;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenNguoiDung;
    private javax.swing.JPasswordField txt_mk_cu;
    private javax.swing.JPasswordField txt_mk_moi;
    private javax.swing.JTextField txt_nghe_nghiep;
    private javax.swing.JPasswordField txt_nhap_lai;
    private javax.swing.JTextField txt_tk;
    private javax.swing.JTextField txt_tk1;
    // End of variables declaration//GEN-END:variables
}