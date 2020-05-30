package com.isa.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class tddTest {

    @Test
    public void reverseWords() {
        StringReverseService stringReverseService = new StringReverseService();
        String words = "first second third fourth";
        String expectedOutput = "fourth third second first";
        String actual = stringReverseService.reverseWords(words);

        assertThat(actual).startsWith(expectedOutput.substring(0,1).toUpperCase())
                .endsWith(".");
    }
}
