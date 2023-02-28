package com.labcompi1.demo1.figure

import com.labcompi1.demo1.parser.Token

class Circle(val token: Token, val centerX: Int, val centerY: Int, val radius: Int): Figure(token), java.io.Serializable {

    override fun toString(): String {
        return "Circle(token=$token, centerX=$centerX, centerY=$centerY, radius=$radius)"
    }
}
