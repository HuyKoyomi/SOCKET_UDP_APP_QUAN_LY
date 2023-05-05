/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Giao_Dien_Nguoi_Dung;

import CSDL.CSDL;
import CSDL.DocGia;
import CSDL.TaiKhoan;
import Giao_Dien_Bat_Dau.dang_nhap_doc_gia;
import Giao_Dien_Quan_Li.them_sach;

/**
 *
 * @author Koyomi
 */
public class nguoi_dung extends javax.swing.JFrame {
    
    private muon_sach ts;
    private tra_sach tra_sach;
    private TaiKhoan tk;
    private DocGia dg;
    
    public nguoi_dung() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        bt_muon_sach = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        jToolBar1.setMinimumSize(new java.awt.Dimension(130, 20));
        jToolBar1.setPreferredSize(new java.awt.Dimension(130, 20));

        bt_muon_sach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_muon_sach.setText("Mượn Sách");
        bt_muon_sach.setFocusable(false);
        bt_muon_sach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_muon_sach.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_muon_sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_muon_sachActionPerformed(evt);
            }
        });
        jToolBar1.add(bt_muon_sach);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator3);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Trả Sách");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        tplMainBoard.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tplMainBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/iconset4/icon/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        jMenu1.setText("Hệ Thống Người Dùng");

        jMenuItem1.setText("Quản Lí Tài Khoản");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_muon_sachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_muon_sachActionPerformed
        if (ts == null){
            ts = new muon_sach();
            ts.set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(tk,dg);
            tplMainBoard.addTab("Mượn Sách",ts);
        }
        tplMainBoard.setSelectedComponent(ts);
    }//GEN-LAST:event_bt_muon_sachActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        quan_li_tai_khoan qltk = new quan_li_tai_khoan();
        qltk.set_TaiKhoan(tk);
        qltk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tra_sach == null){
            tra_sach = new tra_sach();
            tra_sach.set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(tk,dg);
            tplMainBoard.addTab("Trả Sách",tra_sach);
        }
        tplMainBoard.setSelectedComponent(tra_sach);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dang_nhap_doc_gia dndg = new dang_nhap_doc_gia();
        dndg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(nguoi_dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nguoi_dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nguoi_dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nguoi_dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nguoi_dung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_muon_sach;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables

    public void set_Tai_Khoan_Va_Thong_Tin_Doc_Gia(TaiKhoan tk) {
        this.tk = tk;
        this.dg = CSDL.tim_kiem_DocGia_bang_id(tk.getID_DocGia());
    }
}
