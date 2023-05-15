package com.example.pro1.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pro1.databinding.ActivityHomeBinding
import com.example.pro1.databinding.AddDetailsListBinding


class HomeActivity : AppCompatActivity() {


    lateinit var homeBinding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)

initview()
    }

    private fun initview() {

        homeBinding.cdSalesDetails.setOnClickListener{
            var sales=Intent(this,SalesDetailsActivity::class.java)
            startActivity(sales)
        }
        homeBinding.cdCategory.setOnClickListener{
            var i=Intent(this,CategoryListActivity::class.java)
            startActivity(i)
        }

        homeBinding.linAdd.setOnClickListener{
            var newBill=Intent(this,AddDetailsActivity::class.java)
            startActivity(newBill)
        }

    }


}