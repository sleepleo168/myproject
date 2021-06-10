package com.roger.kotlin

import java.util.*

fun main() {
//    userInput()

    val stu = Student("Roger", 77, 99)
    val stu1 = Student("Eric", 30, 80)
    val stu2 = Student("Jane", 25, 60)
    val gstu = GraduateStudent("Jack", 55, 65, 60)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()
    println("High score: ${stu.highest()}")
}

class GraduateStudent(name: String?, english: Int, math: Int,var thesis: Int ) : Student(name, english, math){
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFail()}\t${grading()}")
    }

    override fun passOrFail()= if(getAverage() >= pass)"PASS" else "FAILED"
}

open class Student (var name:String?, var english:Int, var math:Int) {
    companion object{
        @JvmStatic
        var pass:Int = 60
        fun test(){
            println("testing")
        }
    }
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFail()}\t${grading()}")
    }
    open fun passOrFail() = if(getAverage() >= pass)"PASS" else "FAILED"

    fun grading() = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun getAverage() = (english+math)/2

    fun nameCheck() = name?.length

    fun highest() = if (english > math){
        println ("english")
        english
    } else {
        println ("math")
        math
    }
/*        if (english > math){
            max = english
        } else {
            max = math
        }*/
}


private fun userInput() {
    val scanner = Scanner(System.`in`)
//    println("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    println("Please enter student's english:")
    var english = scanner.nextInt()
    println("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}
