package com.zhuim.assignment

fun main() {
    show("research kotlin")("success",200);
    val foo = show("research kotlin and closure");
    val foo2 = show("research kotlin and closure");
    foo("success",200);
    foo("success",200);
    foo("success",200);
    foo("success",200);
    foo2("success",200);
    foo2("success",200);
}

fun show(info:String):(String,Int)->Unit{
    println("here is show, your info is $info");
    var num = 0;
    return {
        status:String,code:Int ->
        num++
        println("res status is $status, code is $code, num is $num")
    }
}