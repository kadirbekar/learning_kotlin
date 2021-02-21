package com.example.learningkotlinseries.oop

open class Employee(name:String, age:Int,department:String) : WithDrawMoney() {
    var name:String? = null
    var age:Int? = null
    var department:String? = null

    private var companyLocation:String = "Sakarya"

    init {
        println("Employee Init function => Name : $name, Age : $age, Department : $department, Company Location : $companyLocation")
    }

    open fun work(){
        println("Work without listening to music.")
    }
}