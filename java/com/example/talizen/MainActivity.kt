package com.example.talizen

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var count:TextView
    private lateinit var counter:Button
    private lateinit var restart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        var total = 0
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        count = findViewById(R.id.count)
        counter = findViewById(R.id.counter)
        restart = findViewById(R.id.btnRestart)

        counter.setOnClickListener {
            total++
            count.text = "$total"
        }

        restart.setOnClickListener {
            total = 0
            count.text = "$total"
        }
    }
}