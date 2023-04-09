package com.zhuim.assignment

const val SQL_NAME = "root"
const val SQL_PASSWORD = "123456"

fun main() {
    login("zhuim", "123123", ::loginRes)
}

inline fun login(name: String, pwd: String, res: (String,Int) -> Unit) {
    if (name == "") {
        TODO("no userName!")
    }
    if (pwd == "") {
        TODO("no password!")
    }
    res("Success",200)
}
fun loginRes(msg: String, code: Int) {
    println("msg:$msg,code:$code")
}