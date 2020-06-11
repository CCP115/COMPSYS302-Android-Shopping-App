package com.compsys.pcpartmart;

public class Item {
    private String name;
    private String price;
    private int[] images;

    public Item(String name, String price, int[] images) {
        this.name = name;
        this.price = price;
        this.images = images;
    }

    public String get_name() {
        return name;
    }

    public String get_price() {
        return price;
    }

    public int get_image(int i) {
        return images[i];
    }
}
