package model;

import java.io.Serializable;

public class Supplies implements Serializable {

    private int id;
    private int ages;
    private int price;
    private int typeid;
    private String suppliescode;
    private String suppliesname;
    private String image;

    public Supplies() {
    }

    public Supplies(int ages, int price, int typeid, String suppliescode, String suppliesname, String image) {
        this.ages = ages;
        this.price = price;
        this.typeid = typeid;
        this.suppliescode = suppliescode;
        this.suppliesname = suppliesname;
        this.image = image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getSuppliescode() {
        return suppliescode;
    }

    public void setSuppliescode(String suppliescode) {
        this.suppliescode = suppliescode;
    }

    public String getSuppliesname() {
        return suppliesname;
    }

    public void setSuppliesname(String suppliesname) {
        this.suppliesname = suppliesname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
