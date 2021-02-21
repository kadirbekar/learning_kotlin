package com.example.learningkotlinseries.oop

abstract class WithDrawMoney {
    fun getMoney(amount:Int?){
        println("$amount₺ loaded to bank account.")
    }
}