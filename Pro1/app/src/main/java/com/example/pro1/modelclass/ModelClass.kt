package com.example.pro1.modelclass

data class CategoryModelClass(
    val id: Int,
    var itemName: String,
    var p_Price: String,
    var s_Price: String
)

data class AddItemModelClass(

    var id: Int,
    var itemName: String,
    var qty: String,
    var price: String,
    var total: String

)
data class CustomerNameModelClass(

    var id: Int,
    var customerName: String,


)