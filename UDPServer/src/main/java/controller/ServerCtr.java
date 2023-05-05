/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import model.User;
import view.ServerView;

/**
 *
 * @author huylm6
 */
public class ServerCtr {

    private int port;
    private DatagramSocket myServer;
    private DatagramPacket receivePacket;
    private DAO dao;

    public ServerCtr() {
        port = 7777;
        dao = new DAO();
        openConnection();
        while (true) {
            execute();
        }
    }

    public void openConnection() {
        try {
            myServer = new DatagramSocket(port);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public void execute() {
        User u = receiveUser();
        if (dao.addUser(u)) {
            sendResult("ok");
            new ServerView().showMessage("Thành công addUser");
        } else {
            new ServerView().showMessage("Thất bại addUser");
        }

    }

    public void sendResult(String res) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(res);
            byte[] data = baos.toByteArray();
            DatagramPacket pkg = new DatagramPacket(data, data.length, receivePacket.getAddress(), receivePacket.getPort());
            myServer.send(pkg);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public User receiveUser() {
        User u = new User();
        try {
            byte[] data = new byte[1024];
            receivePacket = new DatagramPacket(data, data.length);
            myServer.receive(receivePacket);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData());
            ObjectInputStream ois = new ObjectInputStream(bais);
            User result = (User) ois.readObject();
            return result ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

//    public String receiveAction() {
//        String res = "";
//        try {
//            byte[] data = new byte[1024];
//            receivePacket = new DatagramPacket(data, data.length);
//            myServer.receive(receivePacket);
//            ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData());
//            ObjectInputStream ois = new ObjectInputStream(bais);
//            User result = (User) ois.readObject();
//            return result ;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return u;
//    }
//}
