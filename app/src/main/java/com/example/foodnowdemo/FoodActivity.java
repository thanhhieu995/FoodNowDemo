package com.example.foodnowdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView txtName, txtAddress, txtOpenHours;
    ImageView imgCover;
    RecyclerView rvFoods;
    FoodAdapter foodAdapter;
    Food food;
    ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        Bundle extras = getIntent().getExtras();
        String value = extras.getString("name");
        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
//        txtName.setText(value);

        Restaurant restaurant = (Restaurant) extras.getSerializable("restaurant");
        txtName.setText(restaurant.name);
        txtAddress.setText(restaurant.address);

        if ("Hệ thống Nhà hàng Phố 79".equals(restaurant.name)) {
            foods = Food.getFood1Data();
        } else {
            foods = Food.getMockData();
        }

        rvFoods = findViewById(R.id.rvListFood);
        foodAdapter = new FoodAdapter(foods, this);
        rvFoods.setAdapter(foodAdapter);
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, foods.get(position).name, Toast.LENGTH_SHORT).show();
    }
}