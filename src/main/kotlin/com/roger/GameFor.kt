package com.roger

import java.util.*

fun main (){
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    for (i in 1..4){
        println("Please enter a number (${i}/4): ")
        val number = scanner.nextInt()
        println("第${i}次$number")
        if (number < secret){
            println("Higher")
        } else if (number > secret){
            println("Lower")
        } else{
            println("Great, the number is $number")
            break
        }
    }
}