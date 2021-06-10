package com.roger.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void highest() {
        Student student = new Student("Roger", 60, 80);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    void getAverage() {
        Student student = new Student("Roger", 60, 80);
        Assertions.assertEquals((60+80)/2, student.getAverage());
    }
}