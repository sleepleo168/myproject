package com.roger

fun main() {
//    println("Hello Kotlin")
//    Human().hello
//    var weight = 66.5f
//    var height = 1.7f
    var s:String? = "abcde"
//    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(weight = 66.5f,height = 1.7f)
//    h.hello()
    println(h.bmi())
    val score = 88
    println(score > 80 && score > 90)
    var c: Char = 'a'
    println(c.toInt() > 90)
/*    var age : Int = 19
    var weight = 66.5f
    var name : String
    name = "Roger"*/
}


class Human(var name: String ="", var weight: Float,val height: Float){
    init {
        println("test init")
    }
/*    constructor(name: String, weight: Float,height: Float) : this (weight,height){
        println("test second constructor $name $weight $height")
    }*/
    fun bmi () : Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}