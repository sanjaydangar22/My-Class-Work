package com.example.aninterface.adapterclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aninterface.R;
import com.example.aninterface.interfac.ClickListener;
import com.example.aninterface.modelclass.ModelClass;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.FoodHolder> {
    ArrayList<ModelClass> foodList;
    ClickListener listener;
    Context context;

    public AdapterClass(ArrayList<ModelClass> foodList, ClickListener listener) {
        this.foodList = foodList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AdapterClass.FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_list, parent, false);
        FoodHolder foodHolder = new FoodHolder(view);
        return foodHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.FoodHolder holder, int position) {
        holder.imageItem.setImageResource(foodList.get(position).getImgItem());
        holder.txtName.setText(foodList.get(position).getItemName());
        holder.txtQuantity.setText(String.valueOf(foodList.get(position).getQuantity()));
        holder.layRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(foodList.get(position).getImgItem(),foodList.get(position).getItemName(),foodList.get(position).getQuantity());
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class FoodHolder extends RecyclerView.ViewHolder {
        ShapeableImageView imageItem;
        TextView txtName, txtQuantity;
        LinearLayout layRecycle;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            imageItem = itemView.findViewById(R.id.imgItem);
            txtName = itemView.findViewById(R.id.txtName);
            txtQuantity = itemView.findViewById(R.id.txtQuantity);
            layRecycle = itemView.findViewById(R.id.layRecycle);

        }
    }
}
