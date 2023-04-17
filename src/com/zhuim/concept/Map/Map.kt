package com.zhuim.concept.Map


fun main (){
    val mMap1:Map<String,Double> = mapOf("twenty" to 20.0, "thirdty" to 30.0)
    val mapWithPair:Map<String,List<String>> = mapOf(Pair("listOfKids", listOf("Tom","Bom")))
    println("${mMap1.keys}")
    println("${mMap1["twenty"]}")
    println("${mMap1["undefined"]}")    // here has not undefined so it will return a null
    println("${mMap1.getOrDefault("undefined",40.0)}")    // provide a conditional default value
    println("${mMap1.getOrElse("undefined"){1.9}}")    // provide a conditional default value
    println("$mapWithPair")
}
