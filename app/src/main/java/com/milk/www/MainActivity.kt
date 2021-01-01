package com.milk.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Your code here.
        insertButton.setOnClickListener {
            editTextTextPersonName.setText("dasdasd")
            idan()
        }
    }

    private fun idan(){
        Toast.makeText(this,"123123123",Toast.LENGTH_LONG).show()
    }
}