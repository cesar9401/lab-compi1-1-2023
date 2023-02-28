package com.labcompi1.demo1.parser

import com.labcompi1.demo1.figure.Figure
import java.io.StringReader

class ParserHandle {

    fun compile (input: String): ArrayList<Figure>? {
        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer)

        var figures: ArrayList<Figure>? = ArrayList<Figure>()

        figures = parser.parse().value as ArrayList<Figure>?;

        figures?.forEach {
            println(it)
        }

        return figures;
    }
}
