package com.labcompi1.demo1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class ResultActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    private var input: String? = null

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val backButton: Button = findViewById(R.id.btnBack)
        val resultView: TextView = findViewById(R.id.tvResultView)

        val bundle = intent.extras;
        if (bundle != null) {
            this.input = bundle.getSerializable("input", String::class.java)
            val output: ArrayList<Double>? = bundle.getSerializable("output") as ArrayList<Double>?
            // val output: ArrayList<Double>? = bundle.getSerializable("output", ArrayList::class.java) as ArrayList<Double>?
            if (output != null) {
                resultView.text = "The result is $output"
            } else {
                resultView.text = "Something went wrong"
            }

            Log.println(Log.INFO, TAG, "Got input ${this.input} and output ${output} from MainActivity")
        }

        backButton.setOnClickListener(View.OnClickListener {
            goToMainActivity();
        })
    }

    private fun goToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("input", this.input)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
