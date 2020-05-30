package com.isa.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseServiceTest {

    @Test
    @DisplayName("1 - StringReverseService")
    public void testStringReverseServiceTest(){

        String word = "gollum";
        StringReverseService stringReverseService = new StringReverseService();
        String newWord = "mullog";
        String actual = stringReverseService.reverseWord(word);

        assertEquals("mullog", stringReverseService.reverseWord(word));

// druga opcja
//        String word = "gollum";
//        StringReverseService stringReverseService = new StringReverseService();
//        assertEquals("mullog", stringReverseService.reverseWord(word));
    }
}
