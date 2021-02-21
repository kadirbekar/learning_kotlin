package com.example.learningkotlinseries.oop

class ProjectManager(name: String,age:Int,department:String) : Employee(name,age,department) {
    fun haveMeetingsWithCustomers(){
        println("Project manager joined to meeting wih customers.")
    }
}