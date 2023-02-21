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

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor: EditText = findViewById(R.id.etInput)
        val backspaceButton: Button = findViewById(R.id.btnClear)
        val compileButton: Button = findViewById(R.id.btnCompile)

        val bundle = intent.extras
        if (bundle != null) {
            val input: String? = bundle.getSerializable("input", String::class.java)
            if (input != null) {
                editor.setText(input)
            }
        }

        compileButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Compiling")
            val input = editor.text.toString()
            val output = this.compile(input);

            if (output != null) {
                Log.println(Log.INFO, TAG, "The result is $output")
                goToResultActivity(input, output)
            } else {
                Log.println(Log.ERROR, TAG, "Something went wrong")
            }
        })

        backspaceButton.setOnClickListener(View.OnClickListener {
            Log.println(Log.INFO, TAG, "Cleaning editor")
            editor.setText("")
        })
    }

    private fun compile(input: String): ArrayList<Double>? {
        val parserHandle = ParserHandle();
        return parserHandle.compile(input)
    }

    private fun goToResultActivity(input: String, output: ArrayList<Double>) {
        val intent = Intent(this, ResultActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("input", input)
        bundle.putSerializable("output", output)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
