package com.isa.tests;

import com.isa.strings.StringReverseService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseServiceTest {

    @Test
    @DisplayName("Check if letters are reversed in correct order")
    public void reverseString() {
        String word = "gollum";
        StringReverseService stringReverseService = new StringReverseService();
        String expectedWord = "mullog";
        String actual = stringReverseService.reverseWord(word);
        assertEquals(expectedWord, actual);
    }
}
