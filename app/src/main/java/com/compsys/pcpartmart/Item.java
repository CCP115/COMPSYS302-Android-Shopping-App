package com.compsys.pcpartmart;

import java.io.Serializable;

public class Item implements Serializable {

    private int id;
    private String name;
    private String price;
    private String type;
    private int[] images;
    private String desc;

    public Item(int id, String price, String name, String type, String desc, int[] images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.images = images;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }

    public String getPrice() {
        return price;
    }

    public int getImage(int i) {
        return images[i];
    }

    public String getDesc() {
        return this.desc;
    }

    public String getType() {
        return type;
    }

    public int[] getImages() {
        return images;
    }
}
