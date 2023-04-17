package com.zhuim.concept.list

fun main () {
    val list = listOf(1,2,3,4,5,6,7,8)

    for(i in list){
        println(i)
    }

    list.forEach{ println("$it") };

    list.forEachIndexed{item,index -> println("$item,$index")}

}