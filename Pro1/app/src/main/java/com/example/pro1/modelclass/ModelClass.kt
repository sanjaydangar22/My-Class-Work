package com.example.pro1.modelclass

data class CategoryModelClass(
//    val id: Int,
    var itemName: String,
    var p_Price: String,
    var s_Price: String
)

data class AddItemModelClass(

//    var id: Int,
    var itemName: String,
    var qty: String,
    var price: String,
    var total: String

)

data class ProductModel(var ProductList:ArrayList<AddItemModelClass>)
data class CustomerNameModelClass(

    var id: Int,
    var customerName: String,


)

data class BillModelClass(

    var id: Int,
    var date: String,
    var customerName: String,
    var itemName: String,
    var qty: String,
    var price: String,
    var total: String,
    var mainTotal: String

)