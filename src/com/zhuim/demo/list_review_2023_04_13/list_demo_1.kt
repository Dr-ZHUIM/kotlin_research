package com.zhuim.demo.list_review_2023_04_13

fun main (){
    val strList = listOf("today","is","thursday","!")
    val mutableStrList = strList.toMutableList()
    mutableStrList.add("tomorrow")
    mutableStrList.add("is")
    mutableStrList.add("friday")
    mutableStrList.add("!")
    val strList2 = mutableStrList.toList()
    strList2.forEach { println(it) }
}
