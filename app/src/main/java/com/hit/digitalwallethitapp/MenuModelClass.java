package com.hit.digitalwallethitapp;

public class MenuModelClass {
    int id,img, img1;
    String item_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public MenuModelClass(int id, int img, int img1, String item_name) {
        this.id = id;
        this.img = img;
        this.img1 = img1;
        this.item_name = item_name;
    }
}
