package com.zhuim.concept.Class

class Test {
    val num: Int
        get() = (1..1000).shuffled().first()

    val info:String? = "f"

    fun getShowInfo():String{
        return info?.let{
            if(it.isBlank()){
                "invalid value block"
            }else{
                "valid value $info"
            }
        }?:"invalid null"
    }
}
fun main (){
    val t1 = Test()
    println(t1.num)
    // competitive programming
    val res = t1.getShowInfo()
    println(res)
}