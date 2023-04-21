package com.example.pro1.activity

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.databinding.ActivityUpdatePageBinding
import com.example.pro1.databinding.DialogDeleteBinding

class UpdatePageActivity : AppCompatActivity() {
    lateinit var updateBinding: ActivityUpdatePageBinding  //activity binding
    lateinit var db: SqliteDatabaseHelper    //data class define
    var id_number: Int = 0   //create variable
    var flag = 0      //create variable
    var newItem: String? = null     //create variable
    var newP_Price: String? = null     //create variable
    var newS_Price: String? = null       //create variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        updateBinding = ActivityUpdatePageBinding.inflate(layoutInflater)
        setContentView(updateBinding.root)//set xml file

        db = SqliteDatabaseHelper(this)  //data base class in set context class
        if (intent != null && intent.hasExtra("updateRecord")) {   //set condition  and pass key

            flag = 1   //variable in store 1 value
            newItem = intent.getStringExtra("itemName")  //create variable and pass key
            newP_Price = intent.getStringExtra("p_Price")   //create variable and pass key
            newS_Price = intent.getStringExtra("s_Price") //create variable and pass key
            id_number = intent.getIntExtra("id_no", 0) //create variable and pass key

            Log.e("TAG", "RS_ID: " + id_number)
            Log.e("TAG", "RS_Amount: " + newItem)
            Log.e("TAG", "RS_Amount: " + newP_Price)
            Log.e("TAG", "RS_Amount: " + newS_Price)

            updateBinding.edtItem.setText(newItem)   //variable set in textview
            updateBinding.edtPPrice.setText(newP_Price)   //variable set in textview
            updateBinding.edtSPrice.setText(newS_Price)   //variable set in textview
        }
        initView()  //define function
    }

    private fun initView() {
        updateBinding.imgBack.setOnClickListener{  //activity back define
            var i= Intent(this,PracticeActivity::class.java)
            startActivity(i)
        }
        updateBinding.imgDone.setOnClickListener {

            var itemName = updateBinding.edtItem.text.toString()  //create variable for edit text
            var p_Price = updateBinding.edtPPrice.text.toString() //create variable for edit text
            var s_Price = updateBinding.edtSPrice.text.toString() //create variable for edit text
            Log.e("TAG", "select button: " + updateBinding.imgDone.text.toString())
            if (flag == 1) {  //set condition value true
                db.updateRecord(itemName, p_Price, s_Price, id_number)  //data set in update function in sqlite database
                Log.e("TAG", "initView: " + itemName + " " + p_Price + "" + s_Price)

                Toast.makeText(this, "your data is update", Toast.LENGTH_SHORT).show()
            }
            var intent = Intent(this, CategoryListActivity::class.java)
            finish()
            startActivity(intent)
        }
        updateBinding.imgDelete.setOnClickListener {

            val dialog = Dialog(this)   //define dialog
            val dialogDelete = DialogDeleteBinding.inflate(layoutInflater)
            dialog.setContentView(dialogDelete.root)  //dialog set in xml file

            dialogDelete.btnDeleteCancel.setOnClickListener {
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialogDelete.btnDeleteSelect.setOnClickListener {
                Toast.makeText(this, "DELETED", Toast.LENGTH_SHORT).show()
                db.deleteRecord(id_number)        //delete data in sqlite database
                var i = Intent(this, CategoryListActivity::class.java)
                startActivity(i)
                finish()
                dialog.dismiss()
            }
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.window?.setLayout(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            dialog.show()
        }
    }
}