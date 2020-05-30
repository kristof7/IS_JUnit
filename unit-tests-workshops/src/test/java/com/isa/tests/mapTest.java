package com.isa.tests;

import com.isa.geometry.Circle;
import com.isa.sorter.MapSorter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class mapTest {

    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfAreaIsNotCalculatedProperlyForInvalidInput() {
        // given
        Circle circle = new Circle(null);

        // when // then
//        circle.calculateArea();
        assertThatCode(() -> circle.calculateArea())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Radius is mandatory!");
        assertThatIllegalArgumentException().isThrownBy(circle::calculateArea);
    }



    @Test
    public void sortByKey() {
        Map<Integer, String> inputMap = new LinkedHashMap<>();
        inputMap.put(3, "a");
        inputMap.put(1, "c");
        inputMap.put(2, "b");
        Map<Integer, String> outputMap = new LinkedHashMap<>();
        outputMap.put(1, "c");
        outputMap.put(2, "b");
        outputMap.put(3, "a");

        Map<Integer, String> resultMap = MapSorter.sortByKey(inputMap);

        assertThat(resultMap).containsExactlyEntriesOf(outputMap);
    }
    @Test
    public void sortByValue() {
        Map<Integer, String> inputMap = new LinkedHashMap<>();
        inputMap.put(3, "b");
        inputMap.put(1, "c");
        inputMap.put(2, "a");
        Map<Integer, String> outputMap = new LinkedHashMap<>();
        outputMap.put(2, "a");
        outputMap.put(3, "b");
        outputMap.put(1, "c");

        Map<Integer, String> resultMap = MapSorter.sortByValue(inputMap);

        assertThat(resultMap).containsExactlyEntriesOf(outputMap);

    }

    @AfterEach
    public void afterEach() {

    }

}
