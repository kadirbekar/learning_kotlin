package com.example.learningkotlinseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BasicsOfKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics_of_kotlin)

        //  Variables

        //  Int
        val firstNumber = 10
        val secondNumber = 20
        println("Result : ${firstNumber * secondNumber}")

        println("-----------------------------")

        //  String
        val name = "Kadir"
        val surname = "BEKAR"
        println("$name $surname")

        println("-----------------------------")

        //  Double
        val pi = 3.14

        println("-----------------------------")

        //  Boolean
        val isKotlinNice = true

        println("-----------------------------")

        //  Collections
        val stringCollection = arrayOf("Turkey", "Germany", "Russia", "India")
        println(stringCollection[2])
        stringCollection[3] = "China"
        println(stringCollection[3])
        stringCollection.set(1, "Netherlands")
        println(stringCollection.get(1))

        println("-----------------------------")

        val doubleArray = doubleArrayOf(1.2, 2.3, 1.4, 5.4)
        println(doubleArray[1])

        println("-----------------------------")

        //  ArrayList

        //  kotlin type array list
        val stringArrayListOf = arrayListOf<String>("Kadir", "Osman", "Ali", "Burak")
        println(stringArrayListOf[3])
        stringArrayListOf.add("Haydar Tarantino")
        println(stringArrayListOf.last())
        println("Lenght of list items : ${stringArrayListOf.size}")
        println("Does list contain Burak : ${stringArrayListOf.contains("Burak")}")

        //  java type array list
        val javaTypeArrayList = ArrayList<Int>(5)

        println("-----------------------------")

        //  Usage of setOf

        val getsOnlyOneItemForTheSameValue = setOf<Int>(1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8)
        println("Size : ${getsOnlyOneItemForTheSameValue.size}")

        println("-----------------------------")

        //  Usage of HasMap -> Key, Value
        val hasMap = hashMapOf<Any, Any>("TR" to "Turkey", "PL" to "Poland", "XX" to "Germany")
        println("TR : ${hasMap["TR"]}")
        println("PL : ${hasMap["PL"]}")

        println("-----------------------------")

        //  if - else statements
        val age = 24
        when {
            age > 18 -> {
                println("Bigger than 24")
            }
            age < 24 -> {
                println("Lower than 24")
            }
            else -> {
                println("Age is 24")
            }
        }

        println("-----------------------------")

        //  When - Switch case example

        when(50) {
            50 -> println("Grade is 50")
            40 -> println("Grade is 40")
            30 -> println("Grade is 30")
            20 -> println("Grade is 20")
        }

        println("-----------------------------")
        //  Loops

        val listOfNumbers = arrayOf(1,2,3,4,5,6)
        val newListItems = arrayListOf<Int>()
        for (item in listOfNumbers.indices) {
            if(item % 2 == 0) {
                val newValue = (item * 2) + 5
                newListItems.add(newValue)
            }
        }
        newListItems.forEach { item ->
            println(item)
        }
    }
}