package com.example.foodnowdemo;

import java.util.ArrayList;

public class Food {
    String name;
    int image;
    int price;

    public Food(String name, int image, int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public static ArrayList<Food> getMockData() {
        String[] names = {"Apple", "Audicar", "BmwCar", "Canon", "Debian", "Dribble", "Intel", "Ruby", "SpaceX", "Tesla", "TeslaCar", "Uber", "Vinfast"};
        int[] images = {R.drawable.apple, R.drawable.audicar, R.drawable.bmwcar, R.drawable.canon, R.drawable.debian, R.drawable.dribble, R.drawable.intel, R.drawable.ruby, R.drawable.spacex, R.drawable.tesla, R.drawable.teslacar, R.drawable.uber, R.drawable.vinfast};
        int[] prices = {1000, 100000, 150000, 500, 300, 200, 400, 150, 1000000, 1500000, 200000, 50, 50000};
        ArrayList<Food> foods = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foods.add(new Food(names[i], images[i], prices[i]));
        }
        return foods;
    }

    public static ArrayList<Food> getFood1Data() {
        String[] names = {"Lẩu riêu cá Chép", "Xôi 79", "Gỏi sò huyết ốc tương",
                "Bào ngư sốt nấm đông cô và dầu hào", "Miến cua tay cầm", "Sét 79 sashimi",
                "Lẩu samurai 79"};
        int[] images = {R.drawable.pho79laurieucachep, R.drawable.pho79xoi79,
                R.drawable.pho79goisohuyetoctuong, R.drawable.pho79baongudongco,
                R.drawable.pho79miencuataycam, R.drawable.pho79sashimi, R.drawable.pho79lausamurai};
        int[] prices = {200, 20, 50, 60, 100, 150, 250};
        ArrayList<Food> foods = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foods.add(new Food(names[i], images[i], prices[i]));
        }
        return foods;
    }

    public static ArrayList<Food> getFood2Data() {
        String[] names = {"Gà lên mâm", "Gỏi bò An Nam",
        "Bún thịt nướng tứ quý", "Gỏi bồn tôm thịt", "Tốp mỡ chan xả",
         "Gân bò bóp chua", "Combo khai vị 2", "Trứng non sốt samba",
        "Bún diếp bò", "Lẩu riêu Hàu", "Bạch tuột sốt samba", "Bún chả cá tam hoa",
        "Gân bò um tiêu", "Bún tôm yum", "Cá hồi sốt chanh dây", "An nam lục vị",
        "Cá tuyết nướng muối ớt", "Tôm sốt gừng", "Hến xào xúc bánh tráng",
        "Bánh tráng đập", "Chả ram tôm đất", "Bán ướt cuốn thịt nướng", "Bánh tét chiên dưa món",
        "Tré chua trộn", "Nem lụi thịt nướng", "Chả giò tôm", "Cải thìa xào tỏi",
        "Đậu hủ chiên giòn", "Bánh ướt thịt heo quay", "Bánh mì chiên tôm thịt",
        "Chả bò", "Bò nướng xả cây", "Chả mỡ", "Gỏi vả", "Rau muống xào tỏi",
        "Gỏi xoài tôm khô trững bách thảo", "Chả cá ôm măng", "Chả cá Lã Vọng",
        "Gà nướng chum", "Cơm chiên hải sản", "Miến xào cua", "Mực cơm chiên mắm",
        "Cơm chiên xanh", "Bánh tráng thịt heo Đà Nẵng", "Heo nướng cơm lam",
        "Ếch chiên bơ", "Sườn chìa nướng kim chi", "Lươn bằm xúc bánh đa", "Miến trộn tôm cay",
        "Chả đùm", "Cơm chiên trái dừa", "Cari tôm", "Cá lóc nướng lá chuối",
        "Tôm sú xóc tỏi", "Chả cua ôm măng", "Tôm sú sốt bơ tỏi", "Mực cơm hấp",
        "Tôm đất băm", "Lươn nướng cay", "TomYum", "Gỏi nấm gà", "Cá lóc chiên xù",
        "Bò nhúng ớt", "Lẩu cá thác lác", "Lẩu thái", "Lẩu hồng sa"};
        int[] images = {R.drawable.anqgalenmam, R.drawable.anqgoibopthitbo, R.drawable.anqbunthitnuongtuquy,
                R.drawable.anqgoibontomthit, R.drawable.anqtopmochanhxa, R.drawable.anqganbobopchua,
                R.drawable.anqcombokhaivi2, R.drawable.anqtrungnonsotsamba, R.drawable.anqbundiepbo,
                R.drawable.anqlaurieuhau, R.drawable.anqbachtuotsotsamba, R.drawable.anqbunchacatamhoa,
                R.drawable.anqganboumtieu, R.drawable.anqbuntomyum, R.drawable.anqcahoisotchanhday,
                R.drawable.anqannamlucvi, R.drawable.anqcatuyetnuongmuoiot, R.drawable.anqtomsotgung,
                R.drawable.anqhenxaoxucbanhtrang, R.drawable.anqbanhtrangdap, R.drawable.anqcharamtomdat,
                R.drawable.anqbanhuotcuonthitnuong, R.drawable.anqbanhtetchienduamon, R.drawable.anqtrechuatron,
                R.drawable.anqnemluithitnuong, R.drawable.anqchagiotom, R.drawable.anqcaithiaxaotoi, R.drawable.anqdauhuuchiengion,
                R.drawable.anqbanhuotthitheoquay, R.drawable.anqbanhmichientomthit, R.drawable.anqchabo, R.drawable.anqbonuongxacay,
                R.drawable.anqchamo, R.drawable.anqgoiva, R.drawable.anqraumuongxaotoi, R.drawable.anqgoixaotomkhotrungbachthao,
                R.drawable.anqchacaommang, R.drawable.anqchacalavong, R.drawable.anqganuongchum, R.drawable.anqcomchienhaisan,
                R.drawable.anqmienxaocua, R.drawable.anqmuccomchiennuocmam, R.drawable.anqcomchienxanh, R.drawable.anqbanhtrangthitheodanang,
                R.drawable.anqheonuongcomlam, R.drawable.anqechchienbo, R.drawable.anqsuonchianuongkimchi, R.drawable.anqluongbamxucbanhda,
                R.drawable.anqmientrontomcay, R.drawable.anqchadum, R.drawable.anqcomchientraidua, R.drawable.anqcaritom,
                R.drawable.anqcalocnuonglachuoi, R.drawable.anqtomsuxoctoi, R.drawable.anqchacuaommang, R.drawable.anqtomsusotbotoi,
                R.drawable.anqmuccomhap, R.drawable.anqtomdatbam, R.drawable.anqluongnuongcay, R.drawable.anqtomyum,
                R.drawable.anqgoinamga, R.drawable.anqcalocchienxu, R.drawable.anqbonhungot, R.drawable.anqlaucathaclac,
                R.drawable.anqlauthai, R.drawable.anqlauhongsa};
        int[] prices = {381, 120, 59, 99, 105, 159, 108, 105, 86, 333, 149, 59, 159, 65, 295, 169, 220, 195, 85, 39, 86,
         111, 129, 85, 97, 189, 99, 55, 49, 159, 75, 105, 174, 105, 80, 45, 95, 135, 280, 369, 119, 135, 165, 99, 233, 175, 125,
        195, 165, 155, 155, 149, 195, 159, 196, 165, 196, 165, 145, 150, 207, 260, 118, 165, 199, 285, 269};
        ArrayList<Food> foods = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foods.add(new Food(names[i], images[i], prices[i]));
        }
        return foods;
    }

    public static ArrayList<Food> getFood3Data() {
        String[] names = {"Lẩu hải sản Hàn Quốc", "Canh kim chi", "Bánh xèo hải sản Hàn Quốc", "Cơm cuốn lá kim",
        "súp tương đậu", "Sườn nướng Hàn Quốc", "Bò xào nấm", "Thịt ba chỉ nướng", "kimbap", "Tokbokki"};
        int[] images = {R.drawable.bbqlauhaisanhanquoc, R.drawable.bbqcanhkimchi, R.drawable.bbqbanhxeohaisanhanquoc,
        R.drawable.bbqcomcuonlakim, R.drawable.bbqsuptuongdau, R.drawable.bbqsuongnuonghanquoc, R.drawable.bbqbaoxaonam,
        R.drawable.bbqthitbachinuong, R.drawable.bbqkimbap, R.drawable.bbqtokbokki};
        int[] prices = {250, 59, 49, 39, 67, 99, 79, 109, 49, 111};
        ArrayList<Food> foods = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foods.add(new Food(names[i], images[i], prices[i]));
        }
        return foods;
    }
}

