package com.zhuim.concept.Class

import java.util.*

class Kid {
    var name = "tom"
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = "**$value**"
        }
    var age = 20
}

fun main() {
    val Tom = Kid();
    println(Tom.name)
}