package com.example.learningkotlinseries.oop

interface OpenTask {
    fun openTaskToProgrammer(task:String?){
        println("$task task just created without description.")
    }
}