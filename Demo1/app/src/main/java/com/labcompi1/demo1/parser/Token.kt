package com.labcompi1.demo1.parser

import android.util.Log

class Token (val value: String?, val type: Int, val line: Int, val column: Int) {

    private val TAG: String = "Token.kt"

    fun printInfo() {
        Log.println(Log.INFO, TAG, "value: ${this.value}, type: ${this.type}, line: ${this.line}, column: ${this.column}")
    }

    fun getInfo(): String {
        return "value: ${this.value}, type: ${this.type}, line: ${this.line}, column: ${this.column}\n"
    }
}
