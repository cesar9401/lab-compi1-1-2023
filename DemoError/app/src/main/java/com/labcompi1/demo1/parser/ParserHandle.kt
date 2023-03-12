package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): ArrayList<Double>? {
        var result: ArrayList<Double>?

        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer);

        try {
            result = parser.parse().value as ArrayList<Double>?
            return result;
        } catch (e: java.lang.Exception) {
            e.printStackTrace(System.out)
        }

        return ArrayList<Double>()
    }
}
