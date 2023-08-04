package com.example.pro1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.pro1.modelclass.AddItemModelClass
import com.example.pro1.modelclass.BillModelClass
import com.example.pro1.modelclass.CategoryModelClass
import com.example.pro1.modelclass.CustomerNameModelClass

class SqliteDatabaseHelper(context: Context) : SQLiteOpenHelper(context, "MyDatabase", null, 1) {

    var categoryList = ArrayList<CategoryModelClass>()
    var salleList = ArrayList<AddItemModelClass>()
    var customerList = ArrayList<CustomerNameModelClass>()
    var billList = ArrayList<BillModelClass>()
    override fun onCreate(db: SQLiteDatabase?) {

        var categoryTable =
            "create table categoryTB(category_ID integer Primary Key Autoincrement,itemName text,p_price text,s_price text)"
        db?.execSQL(categoryTable)

        var salesTable =
            "create table salesTb(sales_Id integer Primary Key Autoincrement,itemNameS text,qtyS text,priceS text,totalS text)"
        db?.execSQL(salesTable)

        var customerTable =
            "create table customerTb(customer_Id integer Primary Key Autoincrement,CustomerName text)"
        db?.execSQL(customerTable)

        var billTable ="create table billTb(bill_Id integer Primary Key Autoincrement,date text,customerNameB text,itemNameB text,qtyB text,priceB text,totalB text,mainTotalB text)"
        db?.execSQL(billTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insertCategory(itemName: String, p_Price: String, s_Price: String) {
        var db = writableDatabase
        var contentValues = ContentValues()

        contentValues.put("itemName", itemName)
        contentValues.put("p_price", p_Price)
        contentValues.put("s_price", s_Price)
        db.insert("categoryTB", null, contentValues)

    }

    fun displayCategory(): ArrayList<CategoryModelClass> {

    categoryList.clear()

    var db = readableDatabase
    var sql = "select * from categoryTB"
    var cursor = db.rawQuery(sql, null)
    if (cursor.count > 0) {
        cursor.moveToFirst()
        do {
            var id = cursor.getInt(0)
            var itemName = cursor.getString(1)
            var p_Price = cursor.getString(2)
            var s_Price = cursor.getString(3)

            var model = CategoryModelClass( itemName, p_Price, s_Price)

            Log.e("displayCategory", "data: $itemName $p_Price $s_Price")
            categoryList.add(model)
        } while (cursor.moveToNext())
    } else {
        Log.e("TAG", "No data Found")
    }

    return categoryList
}

    fun updateRecord(newItem: String?, newpPrice: String?, newsPrice: String?, idNumber: Int) {
        val update = writableDatabase
        val updateSql =
            "update categoryTB set itemName='$newItem' ,p_price='$newpPrice',s_price='$newsPrice'  where category_ID='$idNumber' "
        update.execSQL(updateSql)
    }

    fun deleteRecord(id: Int) {
        var delete = writableDatabase
        var sqlDelete = "delete from categoryTB where category_ID='$id' "
        delete.execSQL(sqlDelete)
    }

    fun insertSalesData(itemS: String, qtyS: String, priceS: String, totalS: String) {
        var db = writableDatabase
        var c = ContentValues()

        c.put("itemNameS", itemS)
        c.put("qtyS", qtyS)
        c.put("priceS", priceS)
        c.put("totalS", totalS)
        db.insert("salesTb", null, c)

        Log.e("insertSalesData", "itemNameS:- " + itemS)
        Log.e("insertSalesData", "qtyS:- " + qtyS)
        Log.e("insertSalesData", "priceS:- " + priceS)
        Log.e("insertSalesData", "totalS:- " + totalS)
    }

    fun displaySalesData(): ArrayList<AddItemModelClass> {

        salleList.clear()

        var db = readableDatabase
        var sql = "select * from salesTb"
        var cursor = db.rawQuery(sql, null)
        if (cursor.count > 0) {
            cursor.moveToFirst()
            do {
                var id = cursor.getInt(0)
                var itemName = cursor.getString(1)
                var qty = cursor.getString(2)
                var price = cursor.getString(3)
                var total=cursor.getString(4)

                var model = AddItemModelClass( itemName, qty, price,total)

                Log.e("displaySalesData", "data: $itemName $qty $price")
                salleList.add(model)
            } while (cursor.moveToNext())
        } else {
            Log.e("TAG", "No data Found")
        }

        return salleList
    }


    fun insertCustomer(CustomerName: String) {
        var db = writableDatabase
        var contentValues = ContentValues()

        contentValues.put("CustomerName", CustomerName)
        db.insert("customerTb", null, contentValues)
        Log.e("insertCustomer" ,"Customer Name: "+CustomerName )

    }

    fun displayCustomer(): ArrayList<CustomerNameModelClass> {

        categoryList.clear()

        var db = readableDatabase
        var sql = "select * from customerTb"
        var cursor = db.rawQuery(sql, null)
        if (cursor.count > 0) {
            cursor.moveToFirst()
            do {
                var id = cursor.getInt(0)
                var CustomerName = cursor.getString(1)

                var model = CustomerNameModelClass(id, CustomerName)

                Log.e("displayCustomer", "data: $CustomerName ")
                customerList.add(model)
            } while (cursor.moveToNext())
        } else {
            Log.e("TAG", "No data Found")
        }

        return customerList
    }

    fun insertBillData(date:String,customerNameB: String,itemB: String, qtyB: String, priceB: String, totalB: String,mainTotalB :String) {
        var db = writableDatabase
        var c = ContentValues()


        c.put("date", date)
        c.put("customerNameB", customerNameB)
        c.put("itemB", itemB)
        c.put("qtyB", qtyB)
        c.put("priceB", priceB)
        c.put("totalB", totalB)
        c.put("mainTotalB", mainTotalB)
        db.insert("billTb", null, c)

        Log.e("insertBillData", "date:- " + date)
        Log.e("insertBillData", "customerNameB:- " + customerNameB)
        Log.e("insertBillData", "itemB:- " + itemB)
        Log.e("insertBillData", "qtyB:- " + qtyB)
        Log.e("insertBillData", "priceB:- " + priceB)
        Log.e("insertBillData", "totalB:- " + totalB)
        Log.e("insertBillData", "mainTotalB:- " + mainTotalB)
    }

    fun displayBillData(): ArrayList<BillModelClass> {

        billList.clear()

        var db = readableDatabase
        var sql = "select * from billTb"
        var cursor = db.rawQuery(sql, null)
        if (cursor.count > 0) {
            cursor.moveToFirst()
            do {
                var id = cursor.getInt(0)
                var date = cursor.getString(1)
                var customerName = cursor.getString(2)
                var itemName = cursor.getString(3)
                var qty = cursor.getString(4)
                var price = cursor.getString(5)
                var total=cursor.getString(6)
                var mainTotal=cursor.getString(7)

                var model = BillModelClass(id,date, customerName,itemName, qty, price,total,mainTotal)

                Log.e("displayBillData", "data:$id $date $customerName $itemName $qty $price")
                billList.add(model)
            } while (cursor.moveToNext())
        } else {
            Log.e("TAG", "No data Found")
        }

        return billList
    }
}