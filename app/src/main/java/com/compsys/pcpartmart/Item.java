package com.compsys.pcpartmart;

import java.io.Serializable;
import java.util.Random;

public class Item implements Serializable {

    private String id;
    private String name;
    private String price;
    private String type;
    private int views;
    private int[] images;
    private String desc;

    public Item(String id, String price, String name, String type, String desc, int[] images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.images = images;
        this.desc = desc;

        Random rand = new Random();
        this.views = rand.nextInt(50);
    }

    public String getName() {
        return name;
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

    public int getViews() {
        return views;
    }

    public void incrementView() {
        views++;
    }

    public int[] getImages() {
        return images;
    }
}
