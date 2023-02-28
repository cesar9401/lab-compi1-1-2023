package com.labcompi1.demo1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import com.labcompi1.demo1.figure.Figure
import com.labcompi1.demo1.parser.ParserHandle

class DrawActivity : AppCompatActivity() {
    var input: String = "";

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw)

        val buttonBack: Button = findViewById(R.id.buttonBack)
        val drawLayout: FrameLayout = findViewById(R.id.flDrawLayout)

        val bundle = intent.extras
        if (bundle != null) {
            this.input = bundle.getSerializable("input", String::class.java).toString()
            val figures = compile(input)
            if (figures != null) {
                val panel = DrawPanel(this, figures)
                drawLayout.addView(panel)
            } else {
                println("Something went wrong")
            }
        }

        buttonBack.setOnClickListener(View.OnClickListener {
            goToMainActivity()
        })
    }

    private fun compile(input: String): ArrayList<Figure>? {
        val parserHandle = ParserHandle();
        val result = parserHandle.compile(input)
        return result
    }

    private fun goToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle();
        bundle.putSerializable("input", this.input);
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
