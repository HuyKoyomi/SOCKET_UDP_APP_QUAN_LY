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

import model.Supplies;
import model.TypeSup;
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
            case "3":
                Supplies s3 = receiveSupplies();
                if (dao.addSuppies(s3)) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;
            case "4": // add Loại
                TypeSup t4 = receiveType();
                if (dao.addType(t4)) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;

            case "5": // tìm đồ dùng theo mã
                Supplies s5 = receiveSupplies();
                Supplies res = dao.getByCode(s5.getSuppliescode());
                sendResult(res);
                break;
            case "6":
                Supplies s6 = receiveSupplies();
                if (dao.editSuppies(s6)) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;
            case "7":
                Supplies s7 = receiveSupplies();
                if (dao.deleteSuppies(s7.getSuppliescode())) {
                    sendResult("ok");
                    new ServerView().showMessage("action " + action + " Thành công");
                } else {
                    sendResult("fail");
                    new ServerView().showMessage("action " + action + "Thất bại");
                }
                break;

            default:
                new ServerView().showMessage("action " + action + "không tồn tại");
                break;


        }


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
    public TypeSup receiveType() {
        TypeSup u = new TypeSup();
        try {
            byte[] data = new byte[1024];
            receivePacket = new DatagramPacket(data, data.length);
            myServer.receive(receivePacket);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData());
            ObjectInputStream ois = new ObjectInputStream(bais);
            TypeSup result = (TypeSup) ois.readObject();
            return result ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    public Supplies receiveSupplies() {
        Supplies u = new Supplies();
        try {
            byte[] data = new byte[1024];
            receivePacket = new DatagramPacket(data, data.length);
            myServer.receive(receivePacket);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Supplies result = (Supplies) ois.readObject();
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
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (String) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public String receiveString() {
        try {
            byte[] data = new byte[1024];
            DatagramPacket receivePkg = new DatagramPacket(data, data.length);
            myServer.receive(receivePkg);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePkg.getData());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (String) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
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
    public void sendResult(Supplies res) {
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
    

}
