package com.labcompi1.demo1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import com.labcompi1.demo1.figure.Figure
import com.labcompi1.demo1.figure.FigureContainer
import com.labcompi1.demo1.parser.ParserHandle

class DrawActivity : AppCompatActivity() {
    var input: String = ""
    var index: Int = 0

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
                val container = FigureContainer(ArrayList<Figure>())
                val panel = DrawPanel(this, container)
                drawLayout.addView(panel)

                val myHandler = Handler(Looper.getMainLooper())
                val runnable = object: Runnable {
                    override fun run() {
                        if (figures.size > index) {
                            if (container.currentFigure != null) {
                                container.figures.add(container.currentFigure!!)
                            }

                            container.currentFigure = figures[index]

                            index++;
                            panel.invalidate()
                            myHandler.postDelayed(this, 1000L)
                        }
                    }
                }

                runnable.run()

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
