package com.roger.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StudentTest {

    @Test
    fun grading() {
        val student = Student("Roger", 60, 80)
        Assertions.assertEquals('C', student.grading())
    }

    @Test
    fun getAverage() {
        val student = Student("Roger", 60, 80)
        Assertions.assertEquals((60+80)/2, student.getAverage())
    }

    @Test
    fun highest() {
        val student = Student("Roger", 60, 80)
        Assertions.assertEquals(80, student.highest())
    }
}