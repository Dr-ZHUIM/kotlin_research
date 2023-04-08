package com.zhuim.assignment

import kotlin.math.floor
import kotlin.math.round

fun main (){
    // range expression
    val number = 148
    if (number in 10..59){
        println("number is from 10 to 59")
    }else if (number in 60 .. 150){
        println("number is from 60 to 150")
    }
    if (number !in 151 .. 200){
        println("number is not from 60 to 150")
    }
    // when expression
    val week = when(round(Math.random() * 7).toInt()){
        1 -> "today is Monday"
        2 -> "today is Tuesday"
        3 -> "today is Wednesday"
        4 -> "today is Thursday"
        5 -> "today is Friday"
        6 -> "today is Saturday"
        7 -> "today is Sunday"
        else -> "I don't know today is what"
    }
    println(week)
}