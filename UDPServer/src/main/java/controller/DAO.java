/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;

import model.Supplies;
import model.TypeSup;
import model.User;

/**
 *
 * @author huylm6
 */
public class DAO {

    private Connection conn;

    public DAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/udpdb"
                    + "?useUnicode=true&characterEncoding=utf-8", "root", "Koyomi@07042001");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public boolean addUser(User u) {
        String sql = "INSERT INTO tblUser(code, username,password, fullname) VALUE (?,?,?,?)";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getCode());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getFullname());
            ps.executeUpdate();
            System.out.println("Chức năng: Đăng ký tài khoản");
            return true;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
    public boolean addType(TypeSup u) {
        String sql = "INSERT INTO tbltype(typecode, typename,description) VALUE (?,?,?)";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getTypecode());
            ps.setString(2, u.getTypename());
            ps.setString(3, u.getDescription());
            ps.executeUpdate();
            System.out.println("Chức năng: Đăng ký loại đồ dùng");
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
    public boolean addSuppies(Supplies u) {
        System.out.println("Chức năng: Đăng ký đồ đạc");
        String sql = "INSERT INTO tblsupplies(suppliescode, suppliesname,image, ages, price,typeid) VALUE (?,?,?,?,?,?)";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getSuppliescode());
            ps.setString(2, u.getSuppliesname());
            ps.setString(3, u.getImage());
            ps.setInt(4, u.getAges());
            ps.setInt(5, u.getPrice());
            ps.setInt(6, u.getTypeid());
            ps.executeUpdate();
            System.out.println("Chức năng: Đăng ký đồ đạc");
            return true;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
    public boolean login(User u) {
        try {
            Statement sta=conn.createStatement();
            String where = "SELECT * FROM tbluser ";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {
                String tk =re.getString("username");
                String mk =re.getString("password");
                System.out.println(u.getUsername() + " " + u.getPassword());
                if(tk.equalsIgnoreCase(u.getUsername()) && mk.equalsIgnoreCase(u.getPassword())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Supplies getByCode (String s){
        Supplies supplies = new Supplies();
        try {
            String where = "SELECT * FROM tblsupplies where suppliescode = ?";
            PreparedStatement ps = conn.prepareStatement(where);
            ps.setString(1, s);
            ResultSet re=ps.executeQuery();
            if  (re.next()) {
                supplies.setId(re.getInt("id"));
                supplies.setAges(re.getInt("ages"));
                supplies.setPrice(re.getInt("price"));
                supplies.setTypeid(re.getInt("typeid"));
                supplies.setSuppliescode(re.getString("suppliescode"));
                supplies.setSuppliesname(re.getString("suppliesname"));
                supplies.setImage(re.getString("image"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return supplies;
    }

    public boolean editSuppies(Supplies u) {
        String sql = "UPDATE  tblsupplies " +
                "SET suppliescode = ?, suppliesname = ?, image = ? , ages = ?, price = ? , typeid = ? " +
                "WHERE suppliescode = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getSuppliescode());
            ps.setString(2, u.getSuppliesname());
            ps.setString(3, u.getImage());
            ps.setInt(4, u.getAges());
            ps.setInt(5, u.getPrice());
            ps.setInt(6, u.getTypeid());
            ps.setString(7, u.getSuppliescode());
            ps.executeUpdate();
            System.out.println("Chức năng: Sửa đồ đạc");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteSuppies (String s){

        try {
            String where = "DELETE FROM tblsupplies where suppliescode = ?";
            PreparedStatement ps = conn.prepareStatement(where);
            ps.setString(1, s);
            ps.executeUpdate();
            System.out.println("Chức năng: Xóa đồ đạc");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Supplies> getSelect(Supplies u){
        ArrayList<Supplies> arrayList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tblsupplies where id != 0";
            if(u.getTypeid() != 0){
                sql += " AND typeid = " +u.getTypeid() + " ";
            }
            if(u.getAges() != 0){
                sql += " AND ages >= " + u.getAges() + " ";
            }
            if(u.getPrice() != 0){
                sql += " AND price >= " + u.getPrice() + " ";
            }
            if(u.getId() != 0){
                sql += " AND price <= " + u.getId() + " ";
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("SQL: " +  sql);
            ResultSet re= ps.executeQuery(sql);
            while (re.next()) {
                Supplies x = new Supplies();
                x.setId(re.getInt("id"));
                x.setTypeid(re.getInt("typeid"));
                x.setAges(re.getInt("ages"));
                x.setPrice(re.getInt("price"));
                x.setSuppliescode(re.getString("suppliescode"));
                x.setSuppliesname(re.getString("suppliesname"));
                x.setImage(re.getString("image"));
                arrayList.add(x);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return arrayList;
    }
}
