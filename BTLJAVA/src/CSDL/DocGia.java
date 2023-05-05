/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author Koyomi
 */
public class DocGia {
    private int ID_DocGia;
    private String TenNguoiDung, NgaySinh, NgheNghiep,SDT,DiaChi;
    private String TaiKhoan;

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }
    public DocGia(){};

    public DocGia(int ID_DocGia, String TenNguoiDung, String NgaySinh, String NgheNghiep, String SDT, String DiaChi) {
        this.ID_DocGia = ID_DocGia;
        this.TenNguoiDung = TenNguoiDung;
        this.NgaySinh = NgaySinh;
        this.NgheNghiep = NgheNghiep;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public int getID_DocGia() {
        return ID_DocGia;
    }

    public void setID_DocGia(int ID_DocGia) {
        this.ID_DocGia = ID_DocGia;
    }

    public String getTenNguoiDung() {
        return TenNguoiDung;
    }

    public void setTenNguoiDung(String TenNguoiDung) {
        this.TenNguoiDung = TenNguoiDung;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    
}
