package com.labcompi1.demo1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import com.labcompi1.demo1.figure.Circle
import com.labcompi1.demo1.figure.Figure
import com.labcompi1.demo1.figure.Rectangle
import com.labcompi1.demo1.figure.Square

class DrawPanel(context: Context?, val figures: ArrayList<Figure>) : View (context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = 5f

        figures.forEach {
            if (it is Circle) {
                canvas?.drawCircle(it.centerX.toFloat(), it.centerY.toFloat(), it.radius.toFloat(), paint)
            } else if (it is Square) {
                canvas?.drawLine(it.posX.toFloat(), it.poxY.toFloat(), (it.posX + it.size).toFloat(), it.poxY.toFloat(), paint)
                canvas?.drawLine(it.posX.toFloat(), it.poxY.toFloat(), it.posX.toFloat(), (it.poxY + it.size ).toFloat(), paint)

                canvas?.drawLine(it.posX.toFloat(), it.poxY.toFloat() + it.size.toFloat(), (it.posX + it.size).toFloat(), it.poxY.toFloat() + it.size.toFloat(), paint)
                canvas?.drawLine(it.posX.toFloat() + it.size.toFloat(), it.poxY.toFloat(), it.posX.toFloat() + it.size, (it.poxY + it.size ).toFloat(), paint)
            } else if (it is Rectangle) {

            }
        }
    }
}
