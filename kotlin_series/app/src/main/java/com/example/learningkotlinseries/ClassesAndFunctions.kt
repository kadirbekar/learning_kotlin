package com.example.learningkotlinseries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_classes_and_functions.*

class ClassesAndFunctions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classes_and_functions)

        val result: Int = calculate()
        println("Result : $result")

        showResultInTextView(15, 20)
        createClassInstance()

        nullSafety()
    }

    //  function without parameter and return an int value
    private fun calculate(): Int {
        val first = 10
        val second = 20
        return first + second
    }

    //  function with parameter and set value to text view
    private fun showResultInTextView(first: Int, second: Int) {
        resultTextView.text = "Result : ${first + second}"
    }

    private fun createClassInstance() {
        val superHero = SuperHero("Kadir",24,"Full Stack Mobile Application Developer")
        println("Name : "+superHero.name+ ", "+"Age : "+superHero.age+", "+ "Job : "+superHero.job)
        superHero.getSuperHeroName()
        println(superHero.getCountry())
        superHero.changeCounty("Pakistan")
        println(superHero.getCountry())
    }

    //  I allowed that name value could be null
    private fun nullSafety(){
        val name:String? = null
        println(name)

        //  if phone brand is null then initialize it as Android.
        var phoneBrand:String? = null

        if(phoneBrand != null)
            println("Phone Brand: $phoneBrand")
        else
            phoneBrand = "Android"
            println("Phone Brand: $phoneBrand")


        //  !! => value cannot be null, ?. => value could be null

        val computerGameName:String? = null
        //  println(computerGameName!!.toString())  it throws exception because of null value
        //  println(computerGameName?.toString())   //  it does not throw an error, it could be null or not

        //  it does not throw an error because if this value is not equal to null it will print it otherwise it won't get in
        computerGameName?.let { x ->     
            println(x)
        }
    }
}