/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import Giao_Dien_Quan_Li.admin;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Koyomi
 */
public class CSDL {
    
    //ket noi csdl
    public static Connection jdbcConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=thuvienjava;"
             + "username=sa;password=admin";
            Connection conn = DriverManager.getConnection(url);
            return conn;
            } catch (Exception e){
                e.printStackTrace();
            }
        return null;
    }

//---------------------------------------------------------------------------------------------------------    
    // kiểm tra tài khoàn tồn tại
    public static boolean check_TaiKhoan_ton_tai(String tk){
         try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT * FROM TaiKhoan ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String x  =re.getString("TaiKhoan");
                if(x.equals(tk)) return false;
            }
        } catch (Exception e) {
        }
        return true;
    }
    // kiem tra thong tin dang nhap  
    public static boolean check_TaiKhoan(String taikhoan, String matkhau){
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT * FROM TaiKhoan ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String mk=re.getString("matkhau");
                if(mk.equalsIgnoreCase(matkhau)) return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    // hien thi thong tin dang nhap ton tai  
    public static ArrayList<TaiKhoan> select_tai_khoan(){
        ArrayList<TaiKhoan> x = new ArrayList<TaiKhoan>();
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT * FROM TaiKhoan ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {      
                TaiKhoan tmp = new TaiKhoan();
                tmp.settaikhoan(re.getString("TaiKhoan"));
                tmp.setMatkhau(re.getString("MatKhau"));
                tmp.setID_DocGia(re.getInt("ID_DocGia"));
                x.add(tmp);
            }
        } catch (Exception e) {
        }
        return x;
    }
    // lay thong tin tai khoan
    public static TaiKhoan tai_khoan(String tk){
        try {
            String where="SELECT * FROM TaiKhoan Where TaiKhoan=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setString(1, tk);
            ResultSet re=ps.executeQuery();
            while (re.next()) {      
                TaiKhoan x = new TaiKhoan();
                x.settaikhoan(tk);
                x.setMatkhau(re.getString("MatKhau"));
                x.setID_DocGia(re.getInt("ID_DocGia"));
                return x;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
     // them tai khoan
    public static boolean add_TaiKhoan(TaiKhoan x){
        try {
            String sql= "insert into TaiKhoan(TaiKhoan,MatKhau,ID_DocGia) values(?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            
            ps.setString(1, x.gettaikhoan());
            ps.setString(2, x.getMatkhau());
            ps.setInt(3, x.getID_DocGia());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //update tk
    public static boolean update_TaiKhoan(TaiKhoan x){
        try {
            String sql= "UPDATE TaiKhoan SET TaiKhoan=?,MatKhau=?, ID_DocGia=?  WHERE TaiKhoan =?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setString(1, x.gettaikhoan());
            ps.setString(2, x.getMatkhau());
            ps.setInt(3, x.getID_DocGia());
            ps.setString(4, x.gettaikhoan());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // xoa tai khoan
    public static boolean delete_TaiKhoan(TaiKhoan x){
        try {
            String sql= "DELETE FROM TaiKhoan WHERE TaiKhoan =?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setString(1, x.gettaikhoan());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // tim kiem tai khoan
    public static String tim_kiem_tai_khoan_bang_id(int id){
        try {
            String where="SELECT * FROM TaiKhoan Where ID_DocGia=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ResultSet re=ps.executeQuery();
            while(re.next()){
                String x = re.getString("TaiKhoan");
                return x;
            }
             
        } catch (Exception e) {
        }
        return null;
    }
    
//------------------------------------------------------------------------------------------------------------
    // lay tat ca 
    public static ArrayList<Sach> all_sach(){
        ArrayList<Sach> list = new ArrayList<>();
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT * FROM Sach ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {      
                Sach x = new Sach();
                x.setMaSach(re.getInt("MaSach"));
                x.setNamXB(re.getInt("NamXB"));
                x.setSoLuong(re.getInt("SoLuong"));
                x.setTenSach(re.getString("TenSach"));
                x.setTheLoai(re.getString("TheLoai"));
                x.setThoiGianThem(re.getString("ThoiGianThem"));
                x.setTacGia(re.getString("TacGia"));
                list.add(x);
            }
        } catch (Exception e) {
        }
        return list;
    }
    // tim sach theo the loai
    public static ArrayList<Sach> loc_sach_theo_the_loai(String s){
        ArrayList<Sach> list = new ArrayList<>();
        try {
            String where="SELECT * FROM Sach Where TheLoai=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setString(1, s);
            ResultSet re=ps.executeQuery();
            while (re.next()) {      
                Sach x = new Sach();
                x.setMaSach(re.getInt("MaSach"));
                x.setNamXB(re.getInt("NamXB"));
                x.setSoLuong(re.getInt("SoLuong"));
                x.setTenSach(re.getString("TenSach"));
                x.setTheLoai(re.getString("TheLoai"));
                x.setThoiGianThem(re.getString("ThoiGianThem"));
                x.setTacGia(re.getString("TacGia"));
                list.add(x);
            }
        } catch (Exception e) {
        }
        return list;
    }
    //tim sach theo id sach
    public static String tim_sach_theo_id(int id){
        try {
            String where="SELECT * FROM Sach Where MaSach=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ResultSet re=ps.executeQuery();
            while (re.next()) {      
                return re.getString("TenSach");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    // tim sach theo ten gan dung
    public static ArrayList<Sach> loc_sach_theo_ten(String s){
        ArrayList<Sach> list = new ArrayList<>();
        try {
            String where="SELECT * FROM Sach Where TenSach LIKE ? ";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setString(1, s+"%");
            ResultSet re=ps.executeQuery();
            while (re.next()) {      
                Sach x = new Sach();
                x.setMaSach(re.getInt("MaSach"));
                x.setNamXB(re.getInt("NamXB"));
                x.setSoLuong(re.getInt("SoLuong"));
                x.setTenSach(re.getString("TenSach"));
                x.setTheLoai(re.getString("TheLoai"));
                x.setThoiGianThem(re.getString("ThoiGianThem"));
                x.setTacGia(re.getString("TacGia"));
                list.add(x);
            }
        } catch (Exception e) {
            System.out.println("loi");
        }
        return list;
    }
    //them sach
    public static void add_Sach(Sach x){
        try {
                String sql= "insert into Sach(TenSach,TheLoai,TacGia,NamXB,ThoiGianThem,SoLuong) values(?,?,?,?,?,?)";
                PreparedStatement ps=jdbcConnection().prepareStatement(sql);
                ps.setString(1, x.getTenSach());
                ps.setString(2, x.getTheLoai());
                ps.setString(3, x.getTacGia());
                ps.setInt(4, x.getNamXB());
                ps.setString(5, x.getThoiGianThem());
                ps.setInt(6, x.getSoLuong());
                int n=ps.executeUpdate();
       
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //sua sach
    public static boolean update_Sach(Sach x){
        try {
            String sql= "UPDATE Sach SET TenSach=?,TheLoai=?,TacGia=?,NamXB=?,ThoiGianThem=?,SoLuong=? WHERE MaSach=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
                ps.setString(1, x.getTenSach());
                ps.setString(2, x.getTheLoai());
                ps.setString(3, x.getTacGia());
                ps.setInt(4, x.getNamXB());
                ps.setString(5, x.getThoiGianThem());
                ps.setInt(6, x.getSoLuong());
                ps.setInt(7, x.getMaSach());
                int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // xoa sach
    public static boolean delete_Sach(Sach x){
        try {
            String sql= "DELETE FROM Sach WHERE MaSach =?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setInt(1, x.getMaSach());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
//------------------------------------------------------------------------------------------------------------
    public static ArrayList<DocGia> all_DocGia(){
        ArrayList<DocGia> list = new ArrayList<>();
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT * FROM DocGia ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {      
                DocGia x = new DocGia();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setTenNguoiDung(re.getString("TenNguoiDung"));
                x.setNgaySinh(re.getString("NgaySinh"));
                x.setNgheNghiep(re.getString("NgheNghiep"));
                x.setSDT(re.getString("SDT"));
                x.setDiaChi(re.getString("DiaChi"));
                list.add(x);
            }
        } catch (Exception e) {
        }
        return list;
    }
    // xoa doc gia
    public static boolean delete_DocGia(DocGia x){
        try {
            String sql= "DELETE FROM DocGia WHERE ID_DocGia =?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setInt(1, x.getID_DocGia());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // tim kiem doc gia
    public static DocGia tim_kiem_DocGia_bang_id(int id){
        try {
            String where="SELECT * FROM DocGia Where ID_DocGia=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ResultSet re=ps.executeQuery();
            while(re.next()){
                DocGia x = new DocGia();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setTenNguoiDung(re.getString("TenNguoiDung"));
                x.setNgaySinh(re.getString("NgaySinh"));
                x.setNgheNghiep(re.getString("NgheNghiep"));
                x.setSDT(re.getString("SDT"));
                x.setDiaChi(re.getString("DiaChi"));
                return x;
            }
             
        } catch (Exception e) {
        }
        return null;
    }
    public static int tim_kiem_ID_DocGia(DocGia x){
        try {
            String where="SELECT * FROM DocGia Where TenNguoiDung=? and NgaySinh=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setString(1, x.getTenNguoiDung());
            ps.setString(2, x.getNgaySinh());
            ResultSet re=ps.executeQuery();
            while(re.next()){
                return  re.getInt("ID_DocGia");
            }
             
        } catch (Exception e) {
        }
        return -1;
    }
    // them doc gian
    public static boolean add_DocGia(DocGia x){
        try {
            String sql= "insert into DocGia(TenNguoiDung,NgaySinh,NgheNghiep,SDT,DiaChi) values(?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setString(1, x.getTenNguoiDung());
            ps.setString(2, x.getNgaySinh());
            ps.setString(3, x.getNgheNghiep());
            ps.setString(4, x.getSDT());
            ps.setString(5, x.getDiaChi());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //tim kie  doc gia theo ten
    public static ArrayList<DocGia> loc_DoCGia_theo_ten(String s){
        ArrayList<DocGia> list = new ArrayList<>();
        try {
            String where="SELECT * FROM DocGia Where TenNguoiDung LIKE ? ";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setString(1, "%"+s+"%");
            ResultSet re=ps.executeQuery();
            while (re.next()) {      
                DocGia x = new DocGia();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setTenNguoiDung(re.getString("TenNguoiDung"));
                x.setNgaySinh(re.getString("NgaySinh"));
                x.setNgheNghiep(re.getString("NgheNghiep"));
                x.setSDT(re.getString("SDT"));
                x.setDiaChi(re.getString("DiaChi"));
                list.add(x);
            }
        } catch (Exception e) {
            System.out.println("loi");
        }
        return list;
    }
    
    //update dg
    public static boolean update_DocGia(DocGia x){
        try {
            String sql= "UPDATE DocGia SET TenNguoiDung=?, NgaySinh=?, NgheNghiep=?,SDT=?,DiaChi=? WHERE ID_DocGia =?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setString(1, x.getTenNguoiDung());
            ps.setString(2, x.getNgaySinh());
            ps.setString(3, x.getNgheNghiep());
            ps.setString(4, x.getSDT());
            ps.setString(5, x.getDiaChi());
            ps.setInt(6, x.getID_DocGia());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
//------------------------------------------------------------------------------------------------------------
    public static boolean add_PhieuMuon(PhieuMuon x){
        try {
            String sql= "insert into PhieuMuon(NgayMuon,NgayTra,TrangThai,ID_DocGia,MaSach) values(?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
            ps.setString(1, x.getNgayMuon());
            ps.setString(2, x.getNgayTra());
            ps.setString(3, x.getTrangThai());
            ps.setInt(4, x.getID_DocGia());
            ps.setInt(5, x.getMaSach());
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // lấy tất cả
    public static ArrayList<PhieuMuon> tim_kiem_PhieuMuon_bang_id(int id){
        ArrayList<PhieuMuon> list = new ArrayList<PhieuMuon>();
        try {
            String where="SELECT * FROM PhieuMuon Where ID_DocGia=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ResultSet re=ps.executeQuery();
            while(re.next()){
                PhieuMuon x = new PhieuMuon();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setMaMuon(re.getInt("MaMuon"));
                x.setNgayMuon(re.getString("NgayMuon"));
                x.setNgayTra(re.getString("NgayTra"));
                x.setMaSach(re.getInt("MaSach"));
                x.setTrangThai(re.getString("TrangThai"));
                list.add(x) ;
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    // lay nhung pieu chua tra
    public static ArrayList<PhieuMuon> tim_kiem_PhieuMuon_bang_id_va_Trang_Thai(int id, String s){
        ArrayList<PhieuMuon> list = new ArrayList<PhieuMuon>();
        try {
            String where="SELECT * FROM PhieuMuon Where ID_DocGia=? And TrangThai = ?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ps.setString(2,s);
            ResultSet re=ps.executeQuery();
            while(re.next()){
                PhieuMuon x = new PhieuMuon();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setMaMuon(re.getInt("MaMuon"));
                x.setNgayMuon(re.getString("NgayMuon"));
                x.setNgayTra(re.getString("NgayTra"));
                x.setMaSach(re.getInt("MaSach"));
                x.setTrangThai(re.getString("TrangThai"));
                list.add(x) ;
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    //tim kiem phieu muon bang id phieu muon
    public static PhieuMuon tim_kiem_PhieuMuon_bang_id_PhieuMuon(int id,int id2){
       
        try {
            String where="SELECT * FROM PhieuMuon Where ID_DocGia=? and MaMuon=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(where);
            ps.setInt(1, id);
            ps.setInt(2, id2);
            ResultSet re=ps.executeQuery();
            while(re.next()){
                PhieuMuon x = new PhieuMuon();
                x.setID_DocGia(re.getInt("ID_DocGia"));
                x.setMaMuon(re.getInt("MaMuon"));
                x.setNgayMuon(re.getString("NgayMuon"));
                x.setNgayTra(re.getString("NgayTra"));
                x.setMaSach(re.getInt("MaSach"));
                x.setTrangThai(re.getString("TrangThai"));
                return x;
            }
        } catch (Exception e) {
        }
        return null;
    }
    //update tra sach
    public static boolean update_PhieuMuon(int x){
        try {
            String sql= "UPDATE PhieuMuon SET TrangThai=? WHERE MaMuon=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(sql);
                ps.setString(1, "Da Tra");
                ps.setInt(2, x);               
                int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
//------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        System.out.println(tim_sach_theo_id(2));
    }

}
    