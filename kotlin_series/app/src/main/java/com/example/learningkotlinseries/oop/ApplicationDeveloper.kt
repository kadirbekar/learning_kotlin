package com.example.learningkotlinseries.oop

class ApplicationDeveloper(name:String,age:Int,department:String) : Employee(name,age,department), FixBug{
    override fun work(){
        println("Work by listening to music.")
    }
}