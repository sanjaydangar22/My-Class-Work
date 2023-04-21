package com.example.pro1.activity

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.adapterclass.CategoryAdapterClass
import com.example.pro1.databinding.ActivityCategoryListBinding
import com.example.pro1.databinding.DialogCategoryAddBinding
import com.example.pro1.databinding.DialogCategoryUpdateBinding

class CategoryListActivity : AppCompatActivity() {

    lateinit var categoryBinding: ActivityCategoryListBinding  //activity binding
    lateinit var db: SqliteDatabaseHelper   //define database class
    lateinit var adapter: CategoryAdapterClass   //define adapter class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        categoryBinding = ActivityCategoryListBinding.inflate(layoutInflater)  //
        setContentView(categoryBinding.root) //set xml file

        db = SqliteDatabaseHelper(this)  //data base class in set context class

        initView()
    }

    private fun initView() {
        categoryBinding.imgBack.setOnClickListener{   //back button
            var i= Intent(this,PracticeActivity::class.java)
            startActivity(i)
        }
        categoryBinding.imgDone.setOnClickListener{    // activity done
            var i= Intent(this,PracticeActivity::class.java)
            startActivity(i)
            Toast.makeText(this, "your category added", Toast.LENGTH_SHORT).show()
        }
        categoryBinding.imgAdd.setOnClickListener {  //data add

            val dialog = Dialog(this)   //dialog set
            val dialogBinding = DialogCategoryAddBinding.inflate(layoutInflater)
            dialog.setContentView(dialogBinding.root)  //dialog in xml file set

            dialogBinding.btnSet.setOnClickListener {

                var itemName = dialogBinding.edtItem.text.toString()   //variable define
                var p_Price = dialogBinding.edtPPrice.text.toString()   //variable define
                var s_Price = dialogBinding.edtSPrice.text.toString()   //variable define

                db.insertCategory(itemName, p_Price, s_Price)      //data store in sqlite database

                Toast.makeText(this, "your data save", Toast.LENGTH_SHORT).show()
                var list = db.displayCategory()    //data display

                updatefunction()   //define function
                var manger = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                categoryBinding.rcvCategory.layoutManager = manger
                categoryBinding.rcvCategory.adapter = adapter

                adapter.update(list)  //list pass in adapter class in function
                dialog.dismiss()
            }
            dialogBinding.btnCancel.setOnClickListener {

                dialog.dismiss()
            }
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))   //dialog box TRANSPARENT
            dialog.window?.setLayout(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            dialog.show()
        }

    }

    private fun updatefunction() {   //set function
        adapter = CategoryAdapterClass { click ->

            val updatedialog = Dialog(this)   //dialog define
            val dialogBinding = DialogCategoryUpdateBinding.inflate(layoutInflater)
            updatedialog.setContentView(dialogBinding.root)  //set xml file

            updatedialog.window?.setGravity(Gravity.BOTTOM)//dialog position set

            dialogBinding.txtItemDialog.text = click.itemName   //text view in set value
            dialogBinding.txtPPriceDialog.text = click.p_Price  //text view in set value
            dialogBinding.txtSPriceDialog.text = click.s_Price  //text view in set value

            dialogBinding.imgEdite.setOnClickListener {

                var i = Intent(this, UpdatePageActivity::class.java)
                i.putExtra("id_no", click.id)  //set new value and update key pass
                i.putExtra("itemName", click.itemName)  //set new value and update key pass
                i.putExtra("p_Price", click.p_Price)  //set new value and update key pass
                i.putExtra("s_Price", click.s_Price)  //set new value and update key pass
                i.putExtra("updateRecord", true)  //set  update key pass
                startActivity(i)
                finish()
            }
            updatedialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))   //dialog box TRANSPARENT
            updatedialog.window?.setLayout(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            updatedialog.show()

        }
    }
}