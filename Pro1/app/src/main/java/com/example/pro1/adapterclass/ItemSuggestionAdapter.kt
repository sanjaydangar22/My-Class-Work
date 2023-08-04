package com.example.pro1.adapterclass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pro1.R
import com.example.pro1.modelclass.AddItemModelClass
import com.example.pro1.modelclass.CategoryModelClass

class ItemSuggestionAdapter(
    var context: Context,
    var suggestionList: ArrayList<CategoryModelClass>,
    var onClick:( String, String)-> Unit
) : RecyclerView.Adapter<ItemSuggestionAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtItemSuggestion: TextView = itemView.findViewById(R.id.txtItemSug)
        var txtPriceSug: TextView = itemView.findViewById(R.id.txtPriceSug)
        var suggestionLayout: LinearLayout = itemView.findViewById(R.id.suggestionLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_suggestion_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return suggestionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtItemSuggestion.text = suggestionList[position].itemName
        holder.txtPriceSug.text = suggestionList[position].s_Price

        holder.suggestionLayout.setOnClickListener {
            onClick.invoke(suggestionList[position].itemName,suggestionList[position].s_Price)
        }
    }
}