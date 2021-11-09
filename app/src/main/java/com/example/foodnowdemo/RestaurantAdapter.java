package com.example.foodnowdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    Context context;
    ArrayList<Restaurant> restaurants;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_item_restaurant, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Restaurant restaurant = restaurants.get(position);
        holder.txtName.setText(restaurant.name);
        holder.txtAddress.setText(restaurant.address);
        holder.imgLogo.setImageResource(restaurant.logo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, restaurant.name, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ActivityFood.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAddress;
        ImageView imgLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtNameRestaurant);
            txtAddress = itemView.findViewById(R.id.txtAddressRestaurant);
            imgLogo = itemView.findViewById(R.id.imgRestaurant);

        }
    }

}
