package com.example.svet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var currentLight = 0
    private lateinit var lights: Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lights = arrayOf(findViewById(R.id.red_light), findViewById(R.id.yellow_light), findViewById(R.id.green_light))

        val changeButton = findViewById<Button>(R.id.change_button)
        changeButton.setOnClickListener {
            changeLight()
        }
    }

    private fun changeLight() {
        when (currentLight) {
            0 -> {
                lights[currentLight].setBackgroundResource(R.drawable.grey_light)
                currentLight = 1
                lights[currentLight].setBackgroundResource(R.drawable.yellow_light)
            }

            1 -> {
                lights[currentLight].setBackgroundResource(R.drawable.grey_light)
                currentLight = 2
                lights[currentLight].setBackgroundResource(R.drawable.green_light)
            }
            2 -> {
                lights[currentLight].setBackgroundResource(R.drawable.grey_light)
                currentLight = 3
                lights[currentLight-2].setBackgroundResource(R.drawable.yellow_light)
            }
            3 -> {
                lights[currentLight-2].setBackgroundResource(R.drawable.grey_light)
                currentLight = 0
                lights[currentLight].setBackgroundResource(R.drawable.red_light)
            }

        }
    }
}