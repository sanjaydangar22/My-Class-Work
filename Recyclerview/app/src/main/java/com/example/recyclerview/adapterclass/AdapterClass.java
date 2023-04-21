package com.example.recyclerview.adapterclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modelclass.ModelClass;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
    ArrayList<ModelClass> arrayList;

    public AdapterClass(ArrayList<ModelClass> arrayList) {
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_list, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.MyViewHolder holder, int position) {
        holder.txtID.setText(String.valueOf(arrayList.get(position).getId()));
        holder.txtName.setText(arrayList.get(position).getName());
        holder.txtCompanyName.setText(arrayList.get(position).getCompanyName());
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtID, txtName, txtCompanyName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtID = itemView.findViewById(R.id.txtID);
            txtName = itemView.findViewById(R.id.txtName);
            txtCompanyName = itemView.findViewById(R.id.txtCompanyName);
        }
    }
}
