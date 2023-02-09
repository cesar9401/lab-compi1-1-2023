package com.labcompi1.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor: EditText = findViewById(R.id.etInput)
        val backspaceButton: Button = findViewById(R.id.btnClear)
        val compileButton: Button = findViewById(R.id.btnCompile)

        compileButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Compiling")
        })

        backspaceButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Cleaning editor")
            editor.setText("")
        })
    }
}
