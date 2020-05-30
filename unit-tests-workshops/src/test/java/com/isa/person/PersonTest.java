package com.isa.person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    @DisplayName("should return true when person is above 18")
    void isAdult() {
        // given
        Person person = new Person("Mariusz", "Szymanski", 29);

        // when
        boolean result = person.isAdult();

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("should return false when person is below 18")
    void isNotAdult() {
        // given
        Person person = new Person("Mariusz", "Szymanski", 17);

        // when
        boolean result = person.isAdult();

        // then
        assertFalse(result);
        assertEquals(true, result);
    }
}