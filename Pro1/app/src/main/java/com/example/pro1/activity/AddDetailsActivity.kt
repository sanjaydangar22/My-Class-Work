package com.example.pro1.activity

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pro1.SqliteDatabaseHelper
import com.example.pro1.adapterclass.AddDetailsAdapterClass
import com.example.pro1.adapterclass.CustomerSuggestionAdapter
import com.example.pro1.adapterclass.ItemSuggestionAdapter
import com.example.pro1.databinding.ActivityAddDetailsBinding
import com.example.pro1.databinding.DialogCategoryAddBinding
import com.example.pro1.modelclass.*
import com.example.pro1.utilti.FirestroreHelper
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.QuerySnapshot
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class AddDetailsActivity : AppCompatActivity() {

    lateinit var detailsBinding: ActivityAddDetailsBinding
    lateinit var dbB: SqliteDatabaseHelper   // data base class define
//    var list1 = ArrayList<AddItemModelClass>()

    var addItemAdapter = AddDetailsAdapterClass()
    var ProductList = ArrayList<AddItemModelClass>()
    var customerName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsBinding = ActivityAddDetailsBinding.inflate(layoutInflater)
        setContentView(detailsBinding.root)
        dbB = SqliteDatabaseHelper(this)


        FirebaseAnalytics.getInstance(this)
//        getProducts()
        customerName()

        initView()

        billView()

    }


    private fun customerName() {
        detailsBinding.rcvItemSuggestion.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        detailsBinding.rcvItemSuggestion.setHasFixedSize(true)
        detailsBinding.edtCName.doOnTextChanged { text, start, before, count ->
            if (start < count || start > count) {

                detailsBinding.rcvItemSuggestion.visibility = View.VISIBLE
                detailsBinding.txtAddNewItem.visibility = View.VISIBLE
                detailsBinding.txtAddNewItem.setOnClickListener {
                    customerName = detailsBinding.edtCName.text.toString()

                    dbB.insertCustomer(customerName)
                    Toast.makeText(this, "Customer Name added", Toast.LENGTH_SHORT).show()


                }
                dbB.displayCustomer().forEach {
                    if (it.customerName.startsWith(text.toString())) {
                        val suggestionList = ArrayList<CustomerNameModelClass>()
                        Log.e("suggestionItem: ", text.toString())
                        suggestionList.add(it)
                        detailsBinding.rcvItemSuggestion.adapter =
                            CustomerSuggestionAdapter(this, suggestionList) { customerName ->
                                detailsBinding.edtCName.setText(customerName)


                            }
                    }
                }
            }
        }
    }

    private fun initView() {
        //static date Format
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val currentDateFormat: String = simpleDateFormat.format(Date())
        var date = ""
        date = detailsBinding.edtDate.setText(currentDateFormat).toString()


        var billNo = 0





        detailsBinding.rcvItemSuggestion.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        detailsBinding.rcvItemSuggestion.setHasFixedSize(true)

        detailsBinding.edtItemAdd.doOnTextChanged { text, start, before, count ->
            if (start < count || start > count) {

                detailsBinding.rcvItemSuggestion.visibility = View.VISIBLE
                detailsBinding.txtAddNewItem.visibility = View.VISIBLE
                detailsBinding.txtAddNewItem.setOnClickListener {

                    addNewItem()

                }
                CategoryListActivity.categoryList.forEach {
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


            detailsBinding.txtAddNewItem.visibility = View.GONE
            detailsBinding.rcvItemSuggestion.visibility = View.GONE
            var id = 0
            var item = detailsBinding.edtItemAdd.text.toString()
            var qty = detailsBinding.edtQtyAdd.text.toString()
            var price = detailsBinding.edtPriceAdd.text.toString()
            var total = detailsBinding.edtTotalAdd.text.toString()
            if (item.isEmpty()) {
                Toast.makeText(this, "Value is Empty", Toast.LENGTH_SHORT).show()
            } else {
//                dbB.insertSalesData(item, qty, price, total)

//                ProductList.add(AddItemModelClass(item,qty, price, total))
                uploadInvoice(detailsBinding.edtCName.text.toString())
//            var model = AddItemModelClass(id, item, qty, price, total)
//            list1.add(model)

                Log.e("salle add ", "item Name: " + detailsBinding.edtItemAdd.toString())
                Log.e("salle add ", "qty: " + detailsBinding.edtQtyAdd.toString())
                addItemAdapter = AddDetailsAdapterClass()
                val manger1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                detailsBinding.rcvBill.layoutManager = manger1
                detailsBinding.rcvBill.adapter = addItemAdapter

//                var list1 = dbB.displaySalesData()
                addItemAdapter.updateList(ProductList)

                val total1 = if (detailsBinding.txtTotal.text.toString().isNotEmpty()) {
                    detailsBinding.txtTotal.text.toString().toInt()
                } else {
                    "0".toInt()
                }
                var total2 = if (detailsBinding.edtTotalAdd.text.toString().isNotEmpty()) {
                    detailsBinding.edtTotalAdd.text.toString().toInt()
                } else {
                    "0".toInt()
                }
                val totalMain = total1 + total2
                detailsBinding.txtTotal.text = totalMain.toString()


                detailsBinding.edtItemAdd.setText("")
                detailsBinding.edtQtyAdd.setText("")
                detailsBinding.edtPriceAdd.setText("")
                detailsBinding.edtTotalAdd.setText("")

            }

        }
    }

    private fun addNewItem() {
        val dialog = Dialog(this)   //dialog set
        val dialogBinding = DialogCategoryAddBinding.inflate(layoutInflater)
        dialog.setContentView(dialogBinding.root)  //dialog in xml file set

        dialogBinding.btnSet.setOnClickListener {

            var itemName = dialogBinding.edtItem.text.toString()   //variable define
            var p_Price = dialogBinding.edtPPrice.text.toString()   //variable define
            var s_Price = dialogBinding.edtSPrice.text.toString()   //variable define

            dbB.insertCategory(itemName, p_Price, s_Price)      //data store in sqlite database

            Toast.makeText(this, "your data save", Toast.LENGTH_SHORT).show()

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

    private fun billView() {

    }

    fun uploadInvoice(customer: String) {
        FirestroreHelper.firedatabase.collection("Shops")
            .document("Shop Name")
            .collection("Customer")
            .document(customer)
            .collection("Invoices")
            .document(System.currentTimeMillis().toString())
            .set(ProductModel(ProductList))
    }


}