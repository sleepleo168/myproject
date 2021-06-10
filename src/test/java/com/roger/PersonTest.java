package com.roger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void bmi() {
        Person person = new Person(66.5f, 1.7f);
        Assertions.assertEquals((66.5f/(1.7f*1.7f)),person.bmi());
    }
}