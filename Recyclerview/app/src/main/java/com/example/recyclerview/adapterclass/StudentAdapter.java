package com.example.recyclerview.adapterclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modelclass.StudentModel;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder> {

    ArrayList<StudentModel> studentList;

    public StudentAdapter(ArrayList<StudentModel> studentList) {//constructor pass Main Activity to Adapter class
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentAdapter.StudentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list, parent, false);//Add xml file

        StudentHolder holder = new StudentHolder(view);//create object for holder file

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.StudentHolder holder, int position) { //set  text
        holder.txtName.setText(studentList.get(position).getName());
        holder.txtGrid.setText(String.valueOf(studentList.get(position).getGrid()));
        holder.txtCourse.setText(studentList.get(position).getCourse());
        holder.txtDuration.setText(String.valueOf(studentList.get(position).getDuration()));

    }

    @Override
    public int getItemCount() {
        return studentList.size();// set array size
    }

    public class StudentHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtGrid, txtCourse, txtDuration;

        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtGrid = itemView.findViewById(R.id.txtGrid);
            txtCourse = itemView.findViewById(R.id.txtCourse);
            txtDuration = itemView.findViewById(R.id.txtDuration);
        }
    }
}
