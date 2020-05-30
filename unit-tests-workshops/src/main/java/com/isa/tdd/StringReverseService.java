package com.isa.tdd;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverseService {

    public String reverseWords(String inputWords) {
        return Arrays.stream(inputWords.split(" "))
                .sorted()
                .collect(Collectors.joining(" ", inputWords.substring(0,1).toUpperCase(), "."));
    }
}
