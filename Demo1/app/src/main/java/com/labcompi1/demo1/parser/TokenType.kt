package com.labcompi1.demo1.parser

enum class TokenType(val id: Int) {
    INTEGER(1),
    PLUS(2),
    TIMES(3),
    DECIMAL(4),
    ID(5),
    EOF(0)
}
