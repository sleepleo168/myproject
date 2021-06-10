package com.roger

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HumanTest {

    @Test
    fun bmi() {
        val human = Human("Roger", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }
}