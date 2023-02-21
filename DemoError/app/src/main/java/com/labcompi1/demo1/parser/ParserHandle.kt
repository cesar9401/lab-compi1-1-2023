package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): ArrayList<Double>? {
        var result: ArrayList<Double>?

        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer);

        result = parser.parse().value as ArrayList<Double>?

        return result;
    }
}
