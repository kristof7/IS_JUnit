package com.isa.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseServiceTest {

    @Test
    @DisplayName("check that the letters in the word are in the reverse order")
    public void reverseString() {
        String testedWord = "gollum";
        StringReverseService stringReverseService = new StringReverseService();
        String expectedReversedWord = "mullog";
        String actual = stringReverseService.reverseWord(testedWord);
        assertEquals(expectedReversedWord, actual);
    }

}