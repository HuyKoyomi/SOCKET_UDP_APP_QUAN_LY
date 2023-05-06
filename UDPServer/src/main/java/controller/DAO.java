/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;

import model.Supplies;
import model.Type;
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
    public boolean addType(Type u) {
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
}
