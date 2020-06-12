package com.compsys.pcpartmart;

import java.util.ArrayList;

public class DataProvider {
    static String[] cpuNames = {
            // CPU Names
            "Intel Coffee Lake Core i7 9700K",
            "Intel Coffee Lake Core i9 9900K",
            "Intel Coffee Lake Core i5 9400",
            "Intel Coffee Lake Core i3 9100",
            "Intel Pentium Gold G5400",
            "AMD Athlon 3000G",
            "AMD Ryzen 9 3900X",
            "AMD Ryzen 7 3700X",
            "AMD Ryzen 5 2600",
            "AMD Ryzen 5 3600X"};

    static String[] gpuNames = {
            // GPU Names
            "Gigabyte GeForce GTX 1660 SUPER OC",
            "ASUS TUF GeForce GTX 1650",
            "Gigabyte Geforce RTX 2070 SUPER GAMING OC",
            "Gigabyte Geforce RTX 2080 Ti Turbo",
            "Sapphire Radeon PULSE RX 5500 XT",
            "Sapphire PULSE Radeon RX 5700XT",
            "Powercolor Red Dragon RX 570",
            "Powercolor Red Dragon RX 5700XT",
            "NVIDIA Quadro RTX 4000",
            "Leadtek Quadro P1000"};

    static String[] mntrNames = {
            // Monitor Names
            "LG UltraGear 24GL600F-B",
            "ASUS ROG Strix XG258Q",
            "Dell UltraSharp U2421HE",
            "BenQ SW2700PT",
            "ASUS ROG Swift PG65UQ 65",
            "LG 34WL75C-B",
            "Dell UltraSharp U3818DW",
            "Dell P2415Q",
            "Samsung C49HG90",
            "Philips 499P9H1/75",
    };

    static String[] cpuIds = {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};

    static String[] gpuIds = {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};

    static String[] mntrIds = {
            "001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};

    static String[] cpuPrices = {
            // CPU Prices
            "$684.25", "$948.99", "$339.00", "$218.99", "$103.50", "$99.20", "$825.00", "$578.99",
            "$249.00", "$409.00"};

    static String[] gpuPrices = {
            // GPU Prices
            "$499.00", "$343.85", "$1068.99", "$2199.95", "$424.35", "$815.35", "$240.35",
            "$799.00", "$1723.85", "$688.85"};

    static String[] mntrPrices = {
            // Monitor Prices
            "$348.99", "$668.99", "$499.00", "$1298.99", "$6500.00", "$1033.85", "$1848.99",
            "$648.99", "$1899.00", "$2298.85"};


    static int[][] cpuImageAddrs = {
            // CPU Images
            {R.drawable.cpu001, R.drawable.cpu001x2, R.drawable.cpu001x3},
            {R.drawable.cpu002, R.drawable.cpu002x2, R.drawable.cpu002x3},
            {R.drawable.cpu003, R.drawable.cpu003x2, R.drawable.cpu003x3},
            {R.drawable.cpu004, R.drawable.cpu004x2, R.drawable.cpu004x3},
            {R.drawable.cpu005, R.drawable.cpu005x2, R.drawable.cpu005x3},
            {R.drawable.cpu006, R.drawable.cpu006x2, R.drawable.cpu006x3},
            {R.drawable.cpu007, R.drawable.cpu007x2, R.drawable.cpu007x3},
            {R.drawable.cpu008, R.drawable.cpu008x2, R.drawable.cpu008x3},
            {R.drawable.cpu009, R.drawable.cpu009x2, R.drawable.cpu009x3},
            {R.drawable.cpu010, R.drawable.cpu010x2, R.drawable.cpu010x3}};

    static int[][] gpuImageAddrs = {
            // GPU Images
            {R.drawable.gpu001, R.drawable.gpu001x2, R.drawable.gpu001x3},
            {R.drawable.gpu002, R.drawable.gpu002x2, R.drawable.gpu002x3},
            {R.drawable.gpu003, R.drawable.gpu003x2, R.drawable.gpu003x3},
            {R.drawable.gpu004, R.drawable.gpu004x2, R.drawable.gpu004x3},
            {R.drawable.gpu005, R.drawable.gpu005x2, R.drawable.gpu005x3},
            {R.drawable.gpu006, R.drawable.gpu006x2, R.drawable.gpu006x3},
            {R.drawable.gpu007, R.drawable.gpu007x2, R.drawable.gpu007x3},
            {R.drawable.gpu008, R.drawable.gpu008x2, R.drawable.gpu008x3},
            {R.drawable.gpu009, R.drawable.gpu009x2, R.drawable.gpu009x3},
            {R.drawable.gpu010, R.drawable.gpu010x2, R.drawable.gpu010x3}};

    static int[][] mntrImageAddrs = {
            // Monitor Images
            {R.drawable.monitor001, R.drawable.monitor001x2, R.drawable.monitor001x3},
            {R.drawable.monitor002, R.drawable.monitor002x2, R.drawable.monitor002x3},
            {R.drawable.monitor003, R.drawable.monitor003x2, R.drawable.monitor003x3},
            {R.drawable.monitor004, R.drawable.monitor004x2, R.drawable.monitor004x3},
            {R.drawable.monitor005, R.drawable.monitor005x2, R.drawable.monitor005x3},
            {R.drawable.monitor006, R.drawable.monitor006x2, R.drawable.monitor006x3},
            {R.drawable.monitor007, R.drawable.monitor007x2, R.drawable.monitor007x3},
            {R.drawable.monitor008, R.drawable.monitor008x2, R.drawable.monitor008x3},
            {R.drawable.monitor009, R.drawable.monitor009x2, R.drawable.monitor009x3},
            {R.drawable.monitor010, R.drawable.monitor010x2, R.drawable.monitor010x3}};


    public static ArrayList<Item> generateCpuData() {
        ArrayList<Item> cpus = new ArrayList<Item>();

        for (int i = 0; i < 10; i++) {
            String id = cpuIds[i];
            String price = cpuPrices[i];
            String name = cpuNames[i];

            int[] imageAddr = cpuImageAddrs[i];

            Item tempItem = new Item(id, price, name, "CPU", imageAddr);
            cpus.add(tempItem);
        }
        return cpus;
    }

    public static ArrayList<Item> generateGpuData() {
        ArrayList<Item> gpus = new ArrayList<Item>();

        for (int i = 0; i < 10; i++) {
            String id = gpuIds[i];
            String price = gpuPrices[i];
            String name = gpuNames[i];

            int[] imageAddr = gpuImageAddrs[i];

            Item tempItem = new Item(id, price, name, "GPU", imageAddr);
            gpus.add(tempItem);
        }
        return gpus;
    }

    public static ArrayList<Item> generateMntrData() {
        ArrayList<Item> monitors = new ArrayList<Item>();

        for (int i = 0; i < 10; i++) {
            String id = mntrIds[i];
            String price = mntrPrices[i];
            String name = mntrNames[i];

            int[] imageAddr = mntrImageAddrs[i];

            Item tempItem = new Item(id, price, name, "MONITOR", imageAddr);
            monitors.add(tempItem);
        }
        return monitors;
    }
}
