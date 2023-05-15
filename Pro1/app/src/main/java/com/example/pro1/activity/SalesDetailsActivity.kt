package com.example.pro1.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pro1.databinding.ActivitySalesDetailsBinding

class SalesDetailsActivity : AppCompatActivity() {
    lateinit var salesBinding: ActivitySalesDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        salesBinding = ActivitySalesDetailsBinding.inflate(layoutInflater)
        setContentView(salesBinding.root)

        initView()
    }

    private fun initView() {
        salesBinding.cdNewBill.setOnClickListener {
            var newBill = Intent(this, AddDetailsActivity::class.java)
            startActivity(newBill)
        }
        salesBinding.cdAllBill.setOnClickListener {
            var newBill = Intent(this, AddDetailsActivity::class.java)
            startActivity(newBill)
        }

        salesBinding.linAdd.setOnClickListener {
            var newBill = Intent(this, AddDetailsActivity::class.java)
            startActivity(newBill)
        }
    }
}