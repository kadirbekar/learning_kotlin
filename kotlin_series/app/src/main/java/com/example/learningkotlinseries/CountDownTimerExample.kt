package com.example.learningkotlinseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_count_down_timer_example.*

class CountDownTimerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_down_timer_example)

        runTimer()
        countSeconds()
    }

    private fun runTimer(){
        object : CountDownTimer(15000,15000){
            override fun onTick(p0: Long) {
                countDownTimerTextView.text = "Result : Started"
                Toast.makeText(this@CountDownTimerExample,"Timer started!",Toast.LENGTH_LONG).show()
            }

            override fun onFinish() {
                countDownTimerTextView.text = "Result : Finished"
                Toast.makeText(this@CountDownTimerExample,"Timer finished and will be started again!",Toast.LENGTH_LONG).show()
                runTimer()
            }
        }.start()
    }

    private fun countSeconds(){
        object : CountDownTimer(15000,1000) {
            override fun onTick(p0: Long) {
                countSecondsTextView.text = "Second : ${p0 / 1000}"
            }

            override fun onFinish() {
                countSecondsTextView.text = "Second : 0"
                countDownTimerTextView.text = "Result : Finished"
                countSeconds()
            }
        }.start()
    }
}