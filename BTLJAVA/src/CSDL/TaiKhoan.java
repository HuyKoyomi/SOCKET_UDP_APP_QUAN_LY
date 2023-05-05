/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author Koyomi
 */
public class TaiKhoan {
    
    private  String taikhoan,matkhau;
    private int ID_DocGia;
    
    public TaiKhoan(){};
    public TaiKhoan(String taikhoan, String matkhau, int ID_DocGia) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.ID_DocGia = ID_DocGia;
    }

    public String gettaikhoan() {
        return taikhoan;
    }

    public void settaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getID_DocGia() {
        return ID_DocGia;
    }

    public void setID_DocGia(int ID_DocGia) {
        this.ID_DocGia = ID_DocGia;
    }
    
}
