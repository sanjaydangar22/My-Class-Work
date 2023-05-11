package com.example.pro1.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.adapterclass.AddDetailsAdapterClass
import com.example.pro1.adapterclass.ItemSuggestionAdapter
import com.example.pro1.databinding.ActivityAddDetailsBinding
import com.example.pro1.modelclass.CategoryModelClass
import java.text.SimpleDateFormat
import java.util.*


class AddDetailsActivity : AppCompatActivity() {

    lateinit var detailsBinding: ActivityAddDetailsBinding
    lateinit var dbB: SqliteDatabaseHelper   // data base class define
//    var list1 = ArrayList<AddItemModelClass>()

    var addItemAdapter = AddDetailsAdapterClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsBinding = ActivityAddDetailsBinding.inflate(layoutInflater)
        setContentView(detailsBinding.root)
        dbB = SqliteDatabaseHelper(this)
        initView()
    }

    private fun initView() {
        //static date Format
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val currentDateFormat: String = simpleDateFormat.format(Date())
        detailsBinding.edtDate.setText(currentDateFormat)





            detailsBinding.rcvItemSuggestion.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            detailsBinding.rcvItemSuggestion.setHasFixedSize(true)

            detailsBinding.edtItemAdd.doOnTextChanged { text, start, before, count ->
                if (start < count || start > count) {

                    dbB.displayCategory().forEach {
                        if (it.itemName.startsWith(text.toString())) {
                            val suggestionList = ArrayList<CategoryModelClass>()
                            Log.e("suggestionItem: ", text.toString())
                            suggestionList.add(it)
                            detailsBinding.rcvItemSuggestion.adapter =
                                ItemSuggestionAdapter(this, suggestionList) { itemSug, s_price ->
                                    detailsBinding.edtItemAdd.setText(itemSug)
                                    detailsBinding.edtPriceAdd.setText(s_price)

                                    detailsBinding.edtQtyAdd.addTextChangedListener(object :
                                        TextWatcher {
                                        override fun onTextChanged(
                                            s: CharSequence?,
                                            start: Int,
                                            before: Int,
                                            count: Int
                                        ) {
                                            // TODO Auto-generated method stub

                                        }

                                        override fun beforeTextChanged(
                                            s: CharSequence?, start: Int,
                                            count: Int, after: Int
                                        ) {
                                            // TODO Auto-generated method stub
                                        }

                                        override fun afterTextChanged(s: Editable?) {
                                            // TODO Auto-generated method stub
                                            val v1 = if (detailsBinding.edtPriceAdd.text.toString()
                                                    .isNotEmpty()
                                            ) {
                                                detailsBinding.edtPriceAdd.text.toString().toInt()
                                            } else {
                                                s_price.toInt()
                                            }
                                            val v2 = if (detailsBinding.edtQtyAdd.text.toString()
                                                    .isNotEmpty()
                                            ) {
                                                detailsBinding.edtQtyAdd.text.toString().toString()
                                                    .toInt()
                                            } else {
                                                "0".toInt()
                                            }
                                            val value = v1 * v2
                                            detailsBinding.edtTotalAdd.setText(value.toString())

                                        }
                                    })

                                    detailsBinding.edtPriceAdd.addTextChangedListener(object :
                                        TextWatcher {
                                        override fun onTextChanged(
                                            s: CharSequence?,
                                            start: Int,
                                            before: Int,
                                            count: Int
                                        ) {
                                            // TODO Auto-generated method stub

                                        }

                                        override fun beforeTextChanged(
                                            s: CharSequence?, start: Int,
                                            count: Int, after: Int
                                        ) {
                                            // TODO Auto-generated method stub
                                        }

                                        override fun afterTextChanged(s: Editable?) {
                                            // TODO Auto-generated method stub
                                            val v1 = if (detailsBinding.edtPriceAdd.text.toString()
                                                    .isNotEmpty()
                                            ) {
                                                detailsBinding.edtPriceAdd.text.toString().toInt()
                                            } else {
                                                "0".toInt()
                                            }
                                            val v2 = if (detailsBinding.edtQtyAdd.text.toString()
                                                    .isNotEmpty()
                                            ) {
                                                detailsBinding.edtQtyAdd.text.toString().toString()
                                                    .toInt()
                                            } else {
                                                "0".toInt()
                                            }
                                            val value = v1 * v2
                                            detailsBinding.edtTotalAdd.setText(value.toString())

                                        }
                                    })
                                }
                        }
                    }
                }
            }

        detailsBinding.btnAddItem.setOnClickListener {
            var id = 0
            var item = detailsBinding.edtItemAdd.text.toString()
            var qty = detailsBinding.edtQtyAdd.text.toString()
            var price = detailsBinding.edtPriceAdd.text.toString()
            var total = detailsBinding.edtTotalAdd.text.toString()

            dbB. insertSalesData(item,qty,price,total)


//            var model = AddItemModelClass(id, item, qty, price, total)
//            list1.add(model)

            Log.e("salle add ", "item Name: " + detailsBinding.edtItemAdd.toString())
            Log.e("salle add ", "qty: " + detailsBinding.edtQtyAdd.toString())
            addItemAdapter = AddDetailsAdapterClass()
            val manger1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            detailsBinding.rcvBill.layoutManager = manger1
            detailsBinding.rcvBill.adapter = addItemAdapter

            detailsBinding.btnDisplayItem.setOnClickListener{
                var    list1=dbB.displaySalesData()
                addItemAdapter.updateList(list1)
            }


            val totalM = if (  detailsBinding.txtTotal.text.toString().isNotEmpty()) {
                detailsBinding.txtTotal.text.toString().toInt()
            } else {
                "0".toInt()
            }
            val totalMain =   totalM + total.toInt()
            detailsBinding.txtTotal.text = totalMain.toString()


            detailsBinding.edtItemAdd.setText("")
            detailsBinding.edtQtyAdd.setText("")
            detailsBinding.edtPriceAdd.setText("")
            detailsBinding.edtTotalAdd.setText("")
        }

    }


}