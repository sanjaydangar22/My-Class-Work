package com.example.pro1.adapterclass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pro1.R
import com.example.pro1.modelclass.CategoryModelClass

class DialogCategoryAdapter(var list: ArrayList<CategoryModelClass>, var click: (String,String) -> Unit) :
    RecyclerView.Adapter<DialogCategoryAdapter.MyViewHolder>() {

    var pos = -1


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView = itemView.findViewById(R.id.txtName)
        var txtPrice: TextView = itemView.findViewById(R.id.txtPrice)
        var layDialog: LinearLayout = itemView.findViewById(R.id.layDialog)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.dialog_category_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtName.text = list[position].itemName
        holder.txtPrice.text = list[position].s_Price

        holder.layDialog.setOnClickListener {
            click.invoke(list[position].itemName,list[position].s_Price)
            pos = position
            notifyDataSetChanged()
        }

//        holder.rbCategory.isChecked = position == pos  //radio button position set

//        holder.layDialog.setOnClickListener {
//
//        }

    }


}