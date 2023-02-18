package com.labcompi1.demo1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import com.labcompi1.demo1.parser.ParserHandle

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    var input: String = "";

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor: EditText = findViewById(R.id.etInput)
        val backspaceButton: Button = findViewById(R.id.btnClear)
        val compileButton: Button = findViewById(R.id.btnCompile)

        compileButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Compiling")
            this.input = editor.text.toString()
            val output = this.compile(input);

            if (output != null) {
                Log.println(Log.INFO, TAG, "The result is $output")
                goToDrawActivity(input)
            } else {
                Log.println(Log.ERROR, TAG, "Something went wrong")
            }
        })

        backspaceButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Cleaning editor")
            editor.setText("")
        })

        val bundle = intent.extras
        if (bundle != null) {
            this.input = bundle.getSerializable("input", String::class.java).toString()
            editor.setText(this.input)
        }
    }

    private fun compile(input: String): Int? {
        val parserHandle = ParserHandle();
        val result = parserHandle.compile(input)
        return result
    }

    private fun goToDrawActivity(input: String) {
        val intent = Intent(this, DrawActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("input", input);
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
