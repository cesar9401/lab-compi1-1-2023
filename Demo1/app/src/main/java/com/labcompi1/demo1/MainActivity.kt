package com.labcompi1.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.labcompi1.demo1.parser.ParserHandle
import java.util.*

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor: EditText = findViewById(R.id.etInput)
        val textView: TextView = findViewById(R.id.tvResult)
        val backspaceButton: Button = findViewById(R.id.btnClear)
        val compileButton: Button = findViewById(R.id.btnCompile)

        compileButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Compiling")
            val input = editor.text.toString()
            val output = this.compile(input);

            if (output.isPresent) {
                textView.text = output.get()
            } else {
                textView.text = "Something went wrong"
            }
        })

        backspaceButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Cleaning editor")
            editor.setText("")
        })
    }

    private fun compile(input: String): Optional<String> {
        val parserHandle = ParserHandle();
        val tokenList = parserHandle.compile(input)

        var output = tokenList
            .stream()
            .map { token -> token.getInfo() }
            .reduce { initial, current -> initial + current }

        return output
    }
}
