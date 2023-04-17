package com.zhuim.concept.assignment

fun main(){
    // function and default parameter
    fun getFish(name:String = "Tom"):String{
        return "This fish is called $name"
    }
    // name parameter
    fun makeCreature(creator:String="Zhuim",name:String,gender:String,variety:String="Fish"):String{
        return "This is a $gender $variety, its name is $name, its creator is $creator"
    }
    // literal function name
    fun `123`():String{
        return "123"
    }

    val len = "banana".count(){
        it == 'a'
    }

    val sum: (Int,Int) -> Int = {
        a,b -> a + b
    }

    val sum2 = {
        a:Int,b:Int -> a + b
    }

    val compare = {
        a:String,b:String -> a.length < b.length
    }

   val res = compare("aaa","bbbb")

    println(getFish("Bom"))
    println(getFish())
    println(makeCreature(name = "Tom", gender = "male"))
    println(`123`())
    println(len)
    println(sum(1,2))
    println(res)
}
