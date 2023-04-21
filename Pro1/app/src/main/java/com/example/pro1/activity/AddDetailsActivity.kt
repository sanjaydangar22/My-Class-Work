package com.example.pro1.activity

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.adapterclass.AddDetailsAdapterClass
import com.example.pro1.adapterclass.DialogCategoryAdapter
import com.example.pro1.databinding.ActivityAddDetailsBinding
import com.example.pro1.databinding.DialogCategoryBinding
import com.example.pro1.modelclass.AddItemModelClass

class AddDetailsActivity : AppCompatActivity() {

    lateinit var detailsBinding: ActivityAddDetailsBinding
    lateinit var dbB: SqliteDatabaseHelper   // data base class define
    var list1 = ArrayList<AddItemModelClass>()
    var itemS = ""
    var priceS = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsBinding = ActivityAddDetailsBinding.inflate(layoutInflater)
        setContentView(detailsBinding.root)
        dbB = SqliteDatabaseHelper(this)
        initView()
    }

    private fun initView() {
//        detailsBinding.btnAdd.setOnClickListener {
//
//
//            val dialog = Dialog(this)
//            val dialogBinding = DialogCategoryBinding.inflate(layoutInflater)
//            dialog.setContentView(dialogBinding.root)
//
//            val list = dbB.displayCategory()
//
//            var adapter = DialogCategoryAdapter(list) { itemname, price ->
//                Log.e("TAG", "categoryDialogData: $itemname $price")
//                itemS = itemname
//                priceS = price
//
//                Log.e("TAG", "itemS: $itemS")
//                Log.e("TAG", "priceS: $priceS")
//                dbB.insertSalleBill(itemS, priceS)
//            }
//
//            val manger = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//            dialogBinding.recycleDialog.layoutManager = manger
//            dialogBinding.recycleDialog.adapter = adapter
//
//
//            dialogBinding.btnSet.setOnClickListener {
//                Toast.makeText(this, "Your data is sava", Toast.LENGTH_SHORT).show()
//
//
//                dialog.dismiss()
//            }
//            dialogBinding.btnCancel.setOnClickListener {
//
//                Toast.makeText(this, "Your data is not Save", Toast.LENGTH_SHORT).show()
//                dialog.dismiss()
//            }
//            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))   //dialog box TRANSPARENT
//            dialog.window?.setLayout(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//            )
//            dialog.show()

detailsBinding.btnAddItem.setOnClickListener{
    val list = dbB.displayCategory()
    var adapter = DialogCategoryAdapter(list) { itemname, price ->
        Log.e("TAG", "categoryDialogData: $itemname $price")
        itemS = itemname
        priceS = price

        Log.e("TAG", "itemS: $itemS")
        Log.e("TAG", "priceS: $priceS")
        dbB.insertSalleBill(itemS, priceS)
    }
}
            list1=   dbB.displaySalleBill()

            val adapter1 = AddDetailsAdapterClass()
            val manger1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            detailsBinding.rcvBill.layoutManager = manger1
            detailsBinding.rcvBill.adapter = adapter1

            adapter1.updateList(list1)
        }






}