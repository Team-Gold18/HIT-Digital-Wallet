package com.hit.digitalwallethitapp.ContactMembers;

import java.io.Serializable;

public class members implements Serializable {

    private String name;
    private int image;

    public members(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
