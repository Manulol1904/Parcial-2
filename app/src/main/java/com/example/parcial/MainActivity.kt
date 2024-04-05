package com.example.parcial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    var Tx1: TextInputEditText? = null
    var B1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v: View, insets: WindowInsetsCompat ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        B1 = findViewById(R.id.BT)
        Tx1 = findViewById(R.id.Tx1)
        B1?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, V2::class.java)
            val text = Tx1?.getText().toString()
            intent.putExtra("text", text)
            startActivity(intent)
        })
    }
}
