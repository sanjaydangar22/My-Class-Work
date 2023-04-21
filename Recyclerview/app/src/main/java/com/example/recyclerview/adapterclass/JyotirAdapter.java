package com.example.recyclerview.adapterclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.interfac.JyotirClickListener;
import com.example.recyclerview.modelclass.JyotirModel;

import java.util.ArrayList;

public class JyotirAdapter extends RecyclerView.Adapter<JyotirAdapter.JyotirHolder> {
    ArrayList<JyotirModel> modelArrayList;
    JyotirClickListener clickListener;
    public JyotirAdapter(ArrayList<JyotirModel> modelArrayList,   JyotirClickListener clickListener) {
        this.modelArrayList = modelArrayList;
        this.clickListener=clickListener;
    }

    @NonNull
    @Override
    public JyotirHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jyotirlinga_list, parent, false);

        JyotirHolder holder = new JyotirHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull JyotirHolder holder, int position) {
        holder.imgJyotirlinga.setImageResource(modelArrayList.get(position).getJyotirImage());
        holder.txtName.setText(modelArrayList.get(position).getJyotirName());
        holder.txtCity.setText(modelArrayList.get(position).getJyotirCity());
        holder.txtState.setText(modelArrayList.get(position).getJyotirState());
        holder.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(modelArrayList.get(position).getJyotirImage(), modelArrayList.get(position).getJyotirName(), modelArrayList.get(position).getJyotirCity(), modelArrayList.get(position).getJyotirState());
            }
        });

    }


    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class JyotirHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtCity, txtState;
        ImageView imgJyotirlinga;
        LinearLayout data;

        public JyotirHolder(@NonNull View itemView) {
            super(itemView);

            imgJyotirlinga = itemView.findViewById(R.id.imgJyotirlinga);
            txtName = itemView.findViewById(R.id.txtName);
            txtCity = itemView.findViewById(R.id.txtCity);
            txtState = itemView.findViewById(R.id.txtState);
            data = itemView.findViewById(R.id.data);
        }
    }
}