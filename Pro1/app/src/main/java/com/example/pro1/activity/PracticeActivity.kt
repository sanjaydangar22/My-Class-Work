package com.example.pro1.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pro1.databinding.ActivityPracticeBinding


class PracticeActivity : AppCompatActivity() {


    lateinit var practiceBinding: ActivityPracticeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        practiceBinding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(practiceBinding.root)

initview()
    }

    private fun initview() {

        practiceBinding.cdSalesDetails.setOnClickListener{
            var sales=Intent(this,AddDetailsActivity::class.java)
            startActivity(sales)
        }
        practiceBinding.cdCategory.setOnClickListener{
            var i=Intent(this,CategoryListActivity::class.java)
            startActivity(i)
        }

    }


}