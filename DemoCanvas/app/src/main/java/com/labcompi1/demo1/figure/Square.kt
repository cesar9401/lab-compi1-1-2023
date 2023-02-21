package com.labcompi1.demo1.figure

import com.labcompi1.demo1.parser.Token

class Square(val token: Token, val posX: Int, val poxY: Int, val size: Int) : Figure(token) {

    override fun toString(): String {
        return "Square(token=$token, posX=$posX, poxY=$poxY, size=$size)"
    }
}
