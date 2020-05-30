package com.isa.tests;

import com.isa.person.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    @DisplayName("Check if result is true when over 18")
    public void isAdultTest() {
        Person person = new Person("Mark", "Johnson", 20);
        Boolean isAdultResult = person.isAdult();
        assertTrue(isAdultResult);
    }
    @Test
    @DisplayName("Check if result is false when under 18")
    public void isNotAdultTest() {
        Person person = new Person("MarkNot", "JohnsonNot", 10);
        Boolean isAdultResult = person.isAdult();
        assertFalse(isAdultResult);
    }



}
