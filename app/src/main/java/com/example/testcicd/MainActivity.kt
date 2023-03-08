package com.example.testcicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val textView: TextView = findViewById(R.id.txtCICD)
        val btnCICD: Button = findViewById(R.id.btnChange)

        textView.setText("CICD")

        btnCICD.setOnClickListener {
            textView.text = "Hello World!"
        }
    }
}