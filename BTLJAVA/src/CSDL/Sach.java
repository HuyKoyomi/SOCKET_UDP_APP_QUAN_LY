/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author Koyomi
 */
public class Sach {
    private int MaSach,NamXB,SoLuong;
    private String TenSach,TheLoai,TacGia,ThoiGianThem;
    
    public Sach(){};

    public Sach(int MaSach, int NamXB, int SoLuong, String TenSach, String TheLoai, String TacGia, String ThoiGianThem) {
        this.MaSach = MaSach;
        this.NamXB = NamXB;
        this.SoLuong = SoLuong;
        this.TenSach = TenSach;
        this.TheLoai = TheLoai;
        this.TacGia = TacGia;
        this.ThoiGianThem = ThoiGianThem;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getThoiGianThem() {
        return ThoiGianThem;
    }

    public void setThoiGianThem(String ThoiGianThem) {
        this.ThoiGianThem = ThoiGianThem;
    }
    
    
}
