package com.example.pro1.activity

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.adapterclass.CategoryAdapterClass
import com.example.pro1.databinding.ActivityCategoryListBinding
import com.example.pro1.databinding.DialogCategoryAddBinding
import com.example.pro1.databinding.DialogCategoryUpdateBinding
import com.example.pro1.modelclass.AddItemModelClass
import com.example.pro1.modelclass.CategoryModelClass
import com.example.pro1.utilti.FirestroreHelper
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.QuerySnapshot

class CategoryListActivity : AppCompatActivity() {

    lateinit var categoryBinding: ActivityCategoryListBinding  //activity binding
    lateinit var db: SqliteDatabaseHelper   //define database class
    lateinit var adapter: CategoryAdapterClass   //define adapter class
    companion object{
        var categoryList = ArrayList<CategoryModelClass>()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        categoryBinding = ActivityCategoryListBinding.inflate(layoutInflater)  //
        setContentView(categoryBinding.root) //set xml file

        db = SqliteDatabaseHelper(this)  //data base class in set context class
        FirebaseAnalytics.getInstance(this)

        initView()
        getProducts()
    }

    private fun initView() {
        categoryBinding.imgBack.setOnClickListener {   //back button
            var i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
        categoryBinding.imgDone.setOnClickListener {    // activity done
            var i = Intent(this, HomeActivity::class.java)
            startActivity(i)
            Toast.makeText(this, "your category added", Toast.LENGTH_SHORT).show()
        }
        categoryBinding.imgAdd.setOnClickListener {  //data add

            val dialog = Dialog(this)   //dialog set
            val dialogBinding = DialogCategoryAddBinding.inflate(layoutInflater)
            dialog.setContentView(dialogBinding.root)  //dialog in xml file set

            dialogBinding.btnSet.setOnClickListener {
                var id = 0
                var itemName = dialogBinding.edtItem.text.toString()   //variable define
                var p_Price = dialogBinding.edtPPrice.text.toString()   //variable define
                var s_Price = dialogBinding.edtSPrice.text.toString()   //variable define
                addProducts(dialogBinding)
//                db.insertCategory(itemName, p_Price, s_Price)      //data store in sqlite database
//                categoryList.add(CategoryModelClass( itemName, p_Price, s_Price))
                Toast.makeText(this, "your data save", Toast.LENGTH_SHORT).show()


                updatefunction()   //define function


                var manger = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                categoryBinding.rcvCategory.layoutManager = manger
                categoryBinding.rcvCategory.adapter = adapter

//                var list = db.displayCategory()    //data display
                adapter.update(categoryList)  //list pass in adapter class in function
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
//                i.putExtra("id_no", click.id)  //set new value and update key pass
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

    fun addProducts(dialogBinding: DialogCategoryAddBinding) {
        var hashMap= hashMapOf<String,Any>(
            "ProductName" to dialogBinding.edtItem.text.toString(),
            "ProductCostPrice" to dialogBinding.edtPPrice.text.toString(),
            "ProductSalePrice" to dialogBinding.edtSPrice.text.toString(),
        )
        FirestroreHelper.firedatabase.collection("Shops")
            .document("Shop Name")
            .collection("Products")
            .add(hashMap)
    }

    fun getProducts() {

        FirestroreHelper.firedatabase.collection("Shops")
            .document("Shop Name")
            .collection("Products")
            .get()
            .addOnCompleteListener {
                    if (it.isSuccessful) {
                        for (i in it.result) {
                            Log.e("onComplete: ", i.id)
                            var itemName = i.get("ProductName").toString()
                            var p_price = i.get("ProductCostPrice").toString()
                            var price = i.get("ProductSalePrice").toString()
//

                            categoryList.add(CategoryModelClass(itemName,p_price,  price))
                        }
                    }

            }
    }
}