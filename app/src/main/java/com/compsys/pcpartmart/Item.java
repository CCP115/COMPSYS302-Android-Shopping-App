package com.compsys.pcpartmart;

public class Item {
    private String name;
    private String price;
    private int image1;
    private int image2;
    private int image3;

    public Item(String name, String price, int image1, int image2, int image3) {
        this.name = name;
        this.price = price;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public String get_name() {
        return name;
    }

    public String get_price() {
        return price;
    }

    public int get_image(int i) {
        if (i == 2) {
            return image2;
        } else if (i == 3) {
            return image3;
        }
        return image1;
    }
}
