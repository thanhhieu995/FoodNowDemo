package com.example.foodnowdemo;

import android.speech.RecognitionService;

import java.util.ArrayList;

public class Restaurant {
    String name;
    String address;
    int logo;

    public Restaurant(String name, String address, int logo) {
        this.name = name;
        this.address = address;
        this.logo = logo;
    }

    public static ArrayList<Restaurant> listRestaurantData() {
        String[] names = {"Hệ thống Nhà hàng Phố 79", "Chuỗi Ân Nam Quán",
        "Nhà hàng Sườn Nướng Hàn Quốc", "Chuỗi Lẩu Cua Đất Mũi",
        "Chuỗi Wrap & Roll", "Chuỗi San Fu Lou", "Chuỗi Dìn Ký", "Nhà hàng EON 51",
        "Chuỗi Ngọc Sương Sài Gòn", "Nhà hàng Út Cà Mau", "Buffet Hoàng Yến",
        "Hàng Dương Quán", "Nhà hàng Gạo", "Chuỗi King BBQ - Vua nướng Hàn Quốc"
        , "Soa Soa", "Quê Nhà", "Red Chilli Seafood Buffet", "Tajmasago Castle Buffet",
         "Chen Buffet", "Nhà hàng Hội Ngộ", "Nhà hàng Pachi Pachi"};

        String[] address = {"79 Sương Nguyệt Ánh, P.Bến Thành, Quận 1",
        "59 Nguyễn Bỉnh Khiêm, Đa Kao, Quận 1", "4/4 Nguyễn Bỉnh Khiêm, Quận 1",
         "393/9 Trần Hưng Đạo, P. Cầu Kho, Q. 1", "62 Hai Bà Trưng, P.Bến Nghé, Q. 1",
        "B3, số 72 Lê Thánh Tôn, quận 1", "137C Nguyễn Trãi, Phường Bến Thành, Quận 1, Tp. Hồ Chí Minh",
        "Tầng 51 Bitexco Financial Tower, Số 2 Hải Triều, Phường Bến Nghé, Quận 1",
                "106 Sương Nguyệt Ánh, P. Bến Thành, Q. 1", "215 Điện Biên Phủ, Quận 3",
        "B3-27 Tầng B3, 72 Lê Thánh Tôn, Q.1, TP Hồ Chí Minh", "33 Lê Quý Đôn, Phường 7, Quận 3",
        "33 Lê Quý Đôn, Phường 7, Quận 3", "58C Cao Thắng, Phường 05, Quận 3.",
        "64 Phạm Ngọc Thạch, Phường 6, Quận 3", "28 Phạm Ngọc Thạch, Phường 6, Quận 3",
        "2 Phan Văn Chương, Phường Tân Phú, Quận 7", "6 Phan Văn Chương, Phú Mỹ Hưng, Phường Tân Phú, Quận 7",
        "Số 46 Thoại Ngọc Hầu, Phường Hòa Thạnh, Quận Tân Phú", "19B Nguyễn Thị Diệu, phường 6, quận 3",
        "52 Mạc Đĩnh Chi, Phường Đa Kao, Quận 1"};

        int[] logos = {R.drawable.pho79, R.drawable.annamquan_restaurant, R.drawable.suonnuonghanquoc_restaurant,
        R.drawable.laucuadatmui_restaurant, R.drawable.wraproll_restaurant, R.drawable.sanfulou_restaurant,
        R.drawable.dinky_restaurant, R.drawable.eon51_restaurant, R.drawable.ngocsuongsaigon_restaurant,
        R.drawable.utcamau_restaurant, R.drawable.hoangyen_restaurant, R.drawable.handuongquan,
        R.drawable.gao_restaurant, R.drawable.kingbbq, R.drawable.soasoa_restaurant, R.drawable.quenha_restaurant,
        R.drawable.redchill_seafood, R.drawable.tajmasagocaste, R.drawable.chenbuffet, R.drawable.hoingorestaurant,
        R.drawable.pachipachi};


        ArrayList<Restaurant> restaurants = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            restaurants.add(new Restaurant(names[i], address[i], logos[i]));
        }
        return restaurants;
    }

}
