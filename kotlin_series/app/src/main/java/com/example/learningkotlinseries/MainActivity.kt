package com.example.learningkotlinseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.learningkotlinseries.oop.ApplicationDeveloper
import com.example.learningkotlinseries.oop.BusinessAnalyst
import com.example.learningkotlinseries.oop.Employee
import com.example.learningkotlinseries.oop.ProjectManager

class MainActivity : AppCompatActivity() {

    private lateinit var showMessageButton:Button
    private lateinit var messageTextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageTextView = findViewById(R.id.messageTextView)
        showMessageButton = findViewById(R.id.showMessageButton)

        showMessageButton.setOnClickListener {
            messageTextView.text = "Hello World!"
        }

        println("----OOP----")

        val projectManager = ProjectManager("C. Ronaldo",30,"Project Manager")
        val businessAnalyst = BusinessAnalyst("İbrahim Yattara",40,"Business Analyst")
        val applicationDeveloper = ApplicationDeveloper("Kadir",25,"Application Developer")
        projectManager.haveMeetingsWithCustomers()
        projectManager.getMoney(1000)
        businessAnalyst.getMoney(5000)
        businessAnalyst.openTaskToProgrammer("Base application structure")
        applicationDeveloper.fixBug("Base application structure")
        applicationDeveloper.getMoney(1500)
        applicationDeveloper.work()
    }
}