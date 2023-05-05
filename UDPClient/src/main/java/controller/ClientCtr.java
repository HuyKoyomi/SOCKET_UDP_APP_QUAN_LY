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

/**
 *
 * @author huylm6
 */
public class ClientCtr {

    private int serverPort, clientPort;
    private String serverHost;
    private DatagramSocket mySocket;
    private DatagramPacket receivePacket;

    public ClientCtr() {
        serverPort = 7777;
        serverHost = "localhost";
        clientPort = 8888;
        openConnection();

    }

    // kết nối
    public void openConnection() {
        try {
            mySocket = new DatagramSocket(clientPort);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    // đóng kết nối
    public void closeConnection() {
        System.out.println("Close!");
        try {
            if (mySocket != null) {
                mySocket.close();
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    // send acction
    public void sendAcction(String acction) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(acction);
            byte[] data = baos.toByteArray();
            DatagramPacket pkg = new DatagramPacket(data, data.length, InetAddress.getByName(serverHost), serverPort);
            mySocket.send(pkg);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    // gửi thông tin user
    public void sendUser(User u) {
        try {
            // nhét dữ liệu vòa object để gửi
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(u);
            byte[] data = baos.toByteArray();
            // tạo pak
            DatagramPacket senPkg = new DatagramPacket(data, data.length, InetAddress.getByName(serverHost), serverPort);
            mySocket.send(senPkg);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    // nhận thông tin user
    public String receiveUser() {
        try {
            // tạo ra một bộ đệm
            byte[] data = new byte[1024];
            DatagramPacket receivePkg = new DatagramPacket(data, data.length);
            mySocket.receive(receivePkg);
            ByteArrayInputStream bais = new ByteArrayInputStream(receivePkg.getData());
            // lây dư liệu
            ObjectInputStream ois = new ObjectInputStream(bais);
            closeConnection();
            return (String) ois.readObject();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return "";
    }

}
