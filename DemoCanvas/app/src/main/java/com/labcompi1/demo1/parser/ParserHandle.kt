package com.labcompi1.demo1.parser

import com.labcompi1.demo1.figure.Figure
import java.io.StringReader

class ParserHandle {

    fun compile (input: String): Int? {
        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer)

        val figures: ArrayList<Figure>? = parser.parse().value as ArrayList<Figure>?;

        if (figures != null) {
            figures.forEach {
                println(it)
            }
        }

        return 0;
    }
}
