package com.labcompi1.demo1.figure

import com.labcompi1.demo1.parser.Token

class Rectangle(val token: Token, val posX: Int, val posY: Int, val width: Int, val height: Int) : Figure(token) {

    override fun toString(): String {
        return "Rectangle(token=$token, posX=$posX, posY=$posY, width=$width, height=$height)"
    }
}
