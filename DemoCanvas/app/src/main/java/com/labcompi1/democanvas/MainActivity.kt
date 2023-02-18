package com.labcompi1.democanvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.labcompi1.demo1.R
import com.labcompi1.democanvas.parser.ParserHandle

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
            val input = editor.text.toString()
            val output = this.compile(input);

            if (output != null) {
                Log.println(Log.INFO, TAG, "The result is $output")
            } else {
                Log.println(Log.ERROR, TAG, "Something went wrong")
            }
        })

        backspaceButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Cleaning editor")
            editor.setText("")
        })
    }

    private fun compile(input: String): Int? {
        val parserHandle = ParserHandle();
        val result = parserHandle.compile(input)
        return result
    }
}
