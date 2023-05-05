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
        String action = receiveAction();

        System.out.println("action:"+ action);
        switch (action ){
            // đăng nhập
            case "1":
                User u1 = receiveUser();
                if (dao.login(u1)) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;
            // đăng ký
            case "2":
                User u2 = receiveUser();
                if (dao.addUser(u2)) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;
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

    public String receiveAction() {
        try {
            byte[] data = new byte[1024];
            DatagramPacket receivePkg = new DatagramPacket(data, data.length);
            myServer.receive(receivePkg);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePkg.getData());
            // lây dư liệu
            ObjectInputStream ois = new ObjectInputStream(bais);
//            closeConnection();
            return (String) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void closeConnection() {
        System.out.println("Close!");
        try {
            if (myServer != null) {
                myServer.close();
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
