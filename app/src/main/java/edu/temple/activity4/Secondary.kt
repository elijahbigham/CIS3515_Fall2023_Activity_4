package edu.temple.activity4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Secondary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val textViewMain = findViewById<TextView>(R.id.textViewMain)
        textViewMain.textSize = intent.getFloatExtra(FONT_DESC, 22F)

    }
}