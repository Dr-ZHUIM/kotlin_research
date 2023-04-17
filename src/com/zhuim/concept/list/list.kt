package com.zhuim.concept.list

fun main (){
    val list = listOf("first","second")
    val firstElement = list.getOrElse(0){"error: there is no such element!"}
    val secondElement = list.getOrElse(1){"error: there is no such element!"}
    val thirdElementButError = list.getOrElse(2){"error: there is no such element!"}
    val fourthElementButNull = list.getOrNull(3)
    println("$firstElement $secondElement $thirdElementButError ${fourthElementButNull ?: "oh yh the forth element is Null!"}")

    val mutableList = list.toMutableList()
    mutableList.add("bb");
    val thirdElementButError2 = list.getOrElse(2){"error: there is no such element!"}
    val thirdElement2 = mutableList.getOrElse(2){"error: there is no such element!"}
    println("$thirdElementButError2")
    println("$thirdElement2")
    mutableList.removeIf{it.indexOf("t") > 0}
    val immutableList = mutableList.toList()
}
