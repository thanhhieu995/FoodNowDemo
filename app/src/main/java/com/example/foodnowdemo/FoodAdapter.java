package com.example.foodnowdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    ArrayList<Food> foods;
    //OnFoodItemClicklistener mListener;
    Context context;

    public FoodAdapter(ArrayList<Food> foods, Context context) {
        this.foods = foods;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Food food = foods.get(position);
        holder.txtItemName.setText(food.name);
        holder.txtPrice.setText(String.valueOf(food.price));
        holder.imgLogo.setImageResource(food.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //mListener.onFoodItemClick(food);
                Toast.makeText(context, ">>>>", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public interface OnFoodItemClicklistener {
        void onFoodItemClick(Food food);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtItemName, txtPrice;
        ImageView imgLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtItemName = itemView.findViewById(R.id.txtItemName);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            imgLogo = itemView.findViewById(R.id.imgLogo);
        }
    }
}
