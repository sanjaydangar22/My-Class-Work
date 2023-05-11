package com.example.pro1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.pro1.modelclass.AddItemModelClass
import com.example.pro1.modelclass.CategoryModelClass

class SqliteDatabaseHelper(context: Context) : SQLiteOpenHelper(context, "DataBase", null, 1) {

    var categoryList = ArrayList<CategoryModelClass>()
    var salleList = ArrayList<AddItemModelClass>()
    override fun onCreate(db: SQLiteDatabase?) {

        var categoryTable =
            "create table categoryTB(category_ID integer Primary Key Autoincrement,itemName text,p_price text,s_price text)"
        db?.execSQL(categoryTable)

        var salesTable =
            "create table salesTb(sales_Id integer Primary Key Autoincrement,itemNameS text,qtyS text,priceS text,totalS text)"
        db?.execSQL(salesTable)

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

                var model = CategoryModelClass(id, itemName, p_Price, s_Price)

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
        var db = readableDatabase
        var sql = "select * from salesTb"
        var cursorS = db.rawQuery(sql, null)
        if (cursorS.count > 0) {
            cursorS.moveToFirst()
            do {
                var id = cursorS.getInt(0)
                var itemName = cursorS.getString(1)
                var qty = cursorS.getString(2)
                var price = cursorS.getString(3)
                var total = cursorS.getString(4)

                var model = AddItemModelClass(id, itemName, qty, price, total)
                Log.e(
                    "displaySalesData",
                    "itemName:- " + itemName + " " + "qty:- " + qty + " " + " " + "price:- " + price
                )
                salleList.add(model)
            } while (cursorS.moveToNext())
        } else {
            Log.e("displaySalesData", "No data Found ")
        }
        return salleList

    }


}