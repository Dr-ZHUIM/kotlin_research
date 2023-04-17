package com.zhuim.concept.Map

fun main (){
    val mMap1:Map<String,Double> = mapOf("twenty" to 20.0, "thirdty" to 30.0)
    val mapWithPair:Map<String,List<String>> = mapOf(Pair("listOfKids", listOf("Tom","Bom")))
    println("${mMap1.keys}")
    println("${mMap1.values}")
    println("${mMap1.entries}")
    mMap1.forEach{ println("$it")}
    val mMap2 = mMap1.toMutableMap()
    mMap2["forty"] = 40.0

}
