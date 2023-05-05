/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
                    + "?useUnicode=true&characterEncoding=utf-8", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public boolean addUser(User u) {
        System.out.println("Chạy addUser " + u.getCode() + " " + u.getFullname() + " " + u.getUsername() + " " + u.getPassword() );
        if(u.getCode() == null){
            return false;
        }
        String sql = "INSERT INTO tblUser(code, username,password, fullname) VALUE (?,?,?,?)";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getCode());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getFullname());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
}
