package com.example.pro1.adapterclass

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pro1.R
import com.example.pro1.modelclass.AddItemModelClass


class AddDetailsAdapterClass() :RecyclerView.Adapter<AddDetailsAdapterClass.MyViewHolder>() {

    var list= ArrayList<AddItemModelClass>()
    class MyViewHolder(v: View) :RecyclerView.ViewHolder(v) {
        var txtID:TextView=v.findViewById(R.id.txtID)
        var edtItemName:TextView=v.findViewById(R.id.edtItemName)
        var edtQty:TextView=v.findViewById(R.id.edtQty)
        var edtPrice:TextView=v.findViewById(R.id.edtPrice)
        var edtTotalItem:TextView=v.findViewById(R.id.edtTotalItem)
        var layoutItem:LinearLayout=v.findViewById(R.id.layoutItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var v=LayoutInflater.from(parent.context).inflate(R.layout.add_details_list,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtID.text= list[position].id.toString()
        holder.edtItemName.text=list[position].itemName
        holder.edtPrice.text=list[position].price


        Log.e("AddAdapter", "Item: "+holder.edtItemName )
        Log.e("AddAdapter", "price: "+holder.edtPrice )

var total=0

//        holder.edtQty.text=list[position].
        holder.edtQty.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val qty = s.toString()
//                try {
                    val input = qty.toDouble()
                    val rate: Double =  holder.edtPrice.getText().toString().toDouble()
                     total = (rate * input).toInt()
                    holder.edtTotalItem.setText(java.lang.Double.toString(total.toDouble()))
//                } catch (e: NumberFormatException) {
//                    holder.edtTotalItem.setText("")
//                } catch (e: Exception) {
//                    holder.edtTotalItem.setText("")
//                }
            }

            override fun afterTextChanged(s: Editable) {
//                holder.edtTotalItem.setText(java.lang.Double.toString(total.toDouble()))
            }
        })
//        holder.edtQty.text=list[position].qty
//        holder.edtPrice.text=list[position].total



    }

    fun updateList(list1: java.util.ArrayList<AddItemModelClass>) {
        list=list1
        notifyDataSetChanged()
    }

//    fun update() {
//
//
//    }


}