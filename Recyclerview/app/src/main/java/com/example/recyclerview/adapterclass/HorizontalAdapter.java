package com.example.recyclerview.adapterclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modelclass.HorizontalModel;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyHolder> {
    ArrayList<HorizontalModel> modelArrayList;

    public HorizontalAdapter(ArrayList<HorizontalModel> modelArrayList){
        this.modelArrayList=modelArrayList;
    }
    @NonNull
    @Override
    public HorizontalAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list,parent,false);

        MyHolder myHolder=new MyHolder(view);//create object for holder file
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.MyHolder holder, int position) {//set  text
        holder.image.setImageResource(modelArrayList.get(position).getImage());
        holder.txtName.setText(modelArrayList.get(position).getName());
        holder.txtCity.setText(modelArrayList.get(position).getCity());
        holder.txtState.setText(modelArrayList.get(position).getState());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();// set array size
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtCity,txtState;
        ImageView image;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            txtName=itemView.findViewById(R.id.txtName);
            txtCity=itemView.findViewById(R.id.txtCity);
            txtState=itemView.findViewById(R.id.txtState);
        }
    }
}
