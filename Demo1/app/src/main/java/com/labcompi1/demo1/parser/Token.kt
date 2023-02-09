package com.labcompi1.demo1.parser

import android.util.Log

class Token (val value: String?, val type: TokenType, val line: Int, val column: Int) {

    private val TAG: String = "Token.class"

    fun printInfo() {
        Log.println(Log.INFO, TAG, "value: ${this.value}, type: ${this.type.name}, line: ${this.line}, column: ${this.column}")
    }

    fun getInfo(): String {
        return "value: ${this.value}, type: ${this.type.name}, line: ${this.line}, column: ${this.column}\n"
    }
}
