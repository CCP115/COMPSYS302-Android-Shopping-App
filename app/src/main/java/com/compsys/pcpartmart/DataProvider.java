package com.compsys.pcpartmart;

import java.util.ArrayList;

public class DataProvider {
    static String[] cpuNames = {
            // CPU Names
            "Intel Coffee Lake Core i7 9700K",
            "Intel Coffee Lake Core i9 9900K",
            "Intel Coffee Lake Core i5 9400",
            "Intel Coffee Lake Core i3 9100",
            "Intel Coffee Lake Pentium Gold G5400",
            "AMD Athlon 3000G",
            "AMD Ryzen 9 3900X",
            "AMD Ryzen 7 3700X",
            "AMD Ryzen 5 2600",
            "AMD Ryzen 5 3600X"};

    static String[] cpuDescs = {
            "Intel Coffee Lake Core i7 9700K 8 Core 3.6Ghz 12MB LGA 1151 8 Core/ 8 Threads, WITHOUT Cooler, Intel 300 Series Motherboard required",
            "Intel Coffee Lake Core i9 9900K 8 Core 3.6Ghz 16MB LGA 1151 8 Core/ 16 Threads, WITHOUT Cooler, Intel 300 Series Motherboard required",
            "Intel Coffee Lake Core i5 9400 6 Core 2.9Ghz 9MB Cache, LGA 1151 6 Core/ 6 Threads, Intel 300 Series Motherboard required",
            "Intel Coffee Lake Core i3 9100 4 Core 3.6Ghz 6MB Cache, LGA 1151 4 Core/ 4 Threads",
            "Intel Coffee Lake Pentium Gold G5400 Dual Core 3.7Ghz 4MB LGA 1151 2 Core/ 4 Threads, Intel 300 Series Motherboard required",
            "AMD Athlon 3000G 2 Core. 4 Threads. up to 3.5Ghz . 35W, AM4 socket,5MB Cache, with Radeon Vega 3 Graphics",
            "AMD Ryzen 9 3900X 12 Core,24 Threads, up to 4.6 GHz Max Boost, Socket AM4, with Wraith Prism with RGB LED Cooler , 64MB total Cache ,105W TDP ,Extended Frequency Range (XFR) in the presence of better cooling.",
            "AMD Ryzen 7 3700X 8 Core,16 Threads, up to 4.4 GHz Precision Boost, Socket AM4, with Wraith Prism with RGB LED, 32MB total Cache, 65W TDP",
            "AMD Ryzen 5 2600 6 Core, 12 Threads up to 3.9 GHz Max Boost, Socket AM4, 19MB total Cache, 65W TDP, with Wraith Stealth Cooler",
            "AMD Ryzen 5 3600X 6 Core, 12 Threads, up to 4.4 GHz Max Boost, Socket AM4, with Wraith Spire Cooler (No LED), 32MB total Cache, 95W TDP, Extended Frequency Range (XFR) in the presence of better cooling.",
    };

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

    static String[] gpuDescs = {
            "Gigabyte GeForce GTX 1660 SUPER OC 6G GDDR6, GPU Upto 1830MHz, Dual Fans, 2 Slots, 3XDP. 1XHDMI, 1x8 Pin 226mm Length, Max 4 Display",
            "ASUS TUF GeForce GTX 1650 4GB Graphics Card, GPU boost up to 1785 Mhz,Dual Fan, 2.3 slot, DVI/HDMI/DisplayPort, 200mm Length, Max Display: 3",
            "Gigabyte Geforce RTX 2070 SUPER GAMING OC 8GB GDDR6, GPU up to 1815Mhz, 3 X Windforce Fans, HDMI + 3 X DisplayPort, 1 X 8 pin + 1 X 6pin power .289mm length, 2.5 slots, Max 4 Displays, RGB Fusion, Support 2-way NVLINK",
            "Gigabyte Geforce RTX 2080 Ti Turbo 11GB DDR6, GPU Speed 1545 MHz, 2 Slot, Type C + 1X HDMI + 3X DP, 2X 8 Pin, 272mm Length Max 4 Displays",
            "Sapphire Radeon PULSE RX 5500 XT Graphics Card 8GB GDDR6, GPU Upto 1845Mhz, Dual Fan, 2 Slots, DPX 3, HDMI, 1X8 Pin, 500W PSU Requested, 233mm Length, Max 4 Display",
            "Sapphire PULSE Radeon RX 5700XT 8GB GDDR6 Graphics Card, GPU Upto 1925MHz,Dual Fan, HDMI+3XDP, 2 Slot, 1X8 Pin, 1X6 Pin, 254mm Length, Max 4 Display",
            "Powercolor Red Dragon RX 570 Graphics Card 4GB GDDR5, 1x HDMI 1x DVI-D 3x DisplayPort, 2 Slot, 1x 8-Pin, 255mm length, Max 3 Displays",
            "Powercolor Red Dragon RX 5700XT Graphics Card 8GB GDDR6, GPU upto 1905MHz, 1x HDMI 3xDisplayPort, 2 Slot, 2x Fans, 1x 8-Pin, 1x 6-Pin, 240mm length, PCIe 4.0 Ready, Max 4 ",
            "NVIDIA Quadro RTX 4000 8GB GDDR6, 2304 CUDA Cores, Up to 416 GB/s Memory Bandwidth, 36 NVIDIA RT Cores, 288 NVIDIA Tensor Cores, Single Fan, 1 Slot, 1 X 8 Pin Power, For System Builders",
            "Leadtek Quadro P1000 Full Performance Professional Graphics Card, 4GB GDDR5, 4x Mini Display Ports, Low Profile Support with Bracket, 4x Mini DP-DP Adaptors",
    };

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

    static String[] mntrDescs = {
            "LG UltraGear 24GL600F-B 24\" Full HD Monitor , 1920x1080 , 1ms, 144Hz, AMD FreeSync, 2x HDMI + Display Port",
            "ASUS ROG Strix XG258Q 25\" Full HD Monitor , 1920x1080 , 1Ms , Native 240Hz , G-SYNC Compatible, Adaptive-Sync, Asus Aura RGB",
            "Dell UltraSharp U2421HE 24\" Full HD USB-C HUB Monitor , With RJ45 and HDMI+ Display + USB-C Port",
            "BenQ SW2700PT 27\" 2K PhotoVue Photographer Monitor",
            "ASUS ROG Swift PG65UQ 65 4K UHD (3840 x 2160), FALD 384 Zones, Peak Brightness 1000nits, Overclockable 144Hz, G-SYNC",
            "LG 34WL75C-B 34\" Curved UltraWide QHD ( 3440x1440 ) IPS Monitor , Height/ Tilt Adjustable , HDMI+ Display Port",
            "Dell UltraSharp U3818DW 38\" Curved IPS Monitor , 3840 x 1600 , 2x HDMI+Display+ USB Type-C",
            "Dell P2415Q 24\" UHD 4K Business Monitor",
            "Samsung C49HG90 49\" QLED Monitor for the ultimate gaming experience , 3840X1080 , 1ms , 3840x1080",
            "Philips 499P9H1/75 49\" 5k2k USB-C Ultrawide Curved Monitor , 5120X1440 , HDR400 , Built-in KVM switch , HDMI+DisplayPort + USB-C , POP-UP Webcam with Windows Hello",
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
            String desc = cpuDescs[i];

            int[] imageAddr = cpuImageAddrs[i];

            Item tempItem = new Item(id, price, name, "CPU", desc, imageAddr);
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
            String desc = gpuDescs[i];

            int[] imageAddr = gpuImageAddrs[i];

            Item tempItem = new Item(id, price, name, "GPU", desc, imageAddr);
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
            String desc = mntrDescs[i];

            int[] imageAddr = mntrImageAddrs[i];

            Item tempItem = new Item(id, price, name, "MONITOR", desc, imageAddr);
            monitors.add(tempItem);
        }
        return monitors;
    }

    public static ArrayList<Item> searchCPU(String keyword) {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            if ((cpuNames[i].toLowerCase().contains(keyword.toLowerCase())) || (cpuDescs[i].toLowerCase().contains(keyword.toLowerCase()))) {
                String id = cpuIds[i];
                String price = cpuPrices[i];
                String name = cpuNames[i];
                String desc = cpuDescs[i];
                int[] imageAddr = cpuImageAddrs[i];
                Item tempItem = new Item(id, price, name, "CPU", desc, imageAddr);
                items.add(tempItem);
            }
        }
        return items;
    }

    public static ArrayList<Item> searchGPU(String keyword) {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            if ((gpuNames[i].contains(keyword)) || (gpuDescs[i].contains(keyword))) {
                String id = gpuIds[i];
                String price = gpuPrices[i];
                String name = gpuNames[i];
                String desc = gpuDescs[i];
                int[] imageAddr = gpuImageAddrs[i];
                Item tempItem = new Item(id, price, name, "GPU", desc, imageAddr);
                items.add(tempItem);
            }
        }
        return items;
    }

    public static ArrayList<Item> searchMonitors(String keyword) {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            if ((mntrNames[i].contains(keyword)) || (mntrDescs[i].contains(keyword))) {
                String id = mntrIds[i];
                String price = mntrPrices[i];
                String name = mntrNames[i];
                String desc = mntrDescs[i];
                int[] imageAddr = mntrImageAddrs[i];
                Item tempItem = new Item(id, price, name, "MONITOR", desc, imageAddr);
                items.add(tempItem);
            }
        }
        return items;
    }

    public static ArrayList<Item> searchAll(String keyword) {
        ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<Item> items2 = new ArrayList<Item>();
        ArrayList<Item> items3 = new ArrayList<Item>();

        items = searchCPU(keyword);
        items2 = searchGPU(keyword);
        items3 = searchMonitors(keyword);

        items.addAll(items2);
        items.addAll(items3);

        return items;
    }

    public static ArrayList<Item> generateData() {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 3; i++) {
            String id = cpuIds[i];
            String price = cpuPrices[i];
            String name = cpuNames[i];
            String desc = cpuDescs[i];

            int[] imageAddr = cpuImageAddrs[i];

            Item tempItem = new Item(id, price, name, "CPU", desc, imageAddr);
            items.add(tempItem);
        }
        return items;
    }
}
