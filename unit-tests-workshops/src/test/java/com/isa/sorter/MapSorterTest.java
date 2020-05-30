package com.isa.sorter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapSorterTest {

    LinkedHashMap<Integer, String> inputMap;

    @BeforeEach
    public void setupTest() {
        inputMap = new LinkedHashMap<>();
        inputMap.put(1, "Frodo");
        inputMap.put(3, "Aragorn");
        inputMap.put(5, "Legolas");
        inputMap.put(7, "Boromir");
        inputMap.put(9, "Gimli");
        inputMap.put(8, "Gandalf");
        inputMap.put(6, "Samwise");
        inputMap.put(4, "Meriadok");
        inputMap.put(2, "Peregrin");
    }

    @AfterEach
    public void afterEach() {
        inputMap = null;
    }

    @Test
    void sortByValue() {
        // given
        LinkedHashMap<Integer, String> expectedSortedMapByValue = new LinkedHashMap<>();
        expectedSortedMapByValue.put(3, "Aragorn");
        expectedSortedMapByValue.put(7, "Boromir");
        expectedSortedMapByValue.put(1, "Frodo");
        expectedSortedMapByValue.put(8, "Gandalf");
        expectedSortedMapByValue.put(9, "Gimli");
        expectedSortedMapByValue.put(5, "Legolas");
        expectedSortedMapByValue.put(4, "Meriadok");
        expectedSortedMapByValue.put(2, "Peregrin");
        expectedSortedMapByValue.put(6, "Samwise");

        // when
        Map<Integer, String> result = MapSorter.sortByValue(inputMap);

        // then
        assertThat(result).containsExactlyEntriesOf(expectedSortedMapByValue)
                          .isEqualTo(expectedSortedMapByValue)
                          .isEqualTo(inputMap);
    }

    @Test
    void sortByKey() {
        // given
        LinkedHashMap<Integer, String> sortedMapByKey = new LinkedHashMap<>();
        sortedMapByKey.put(1, "Frodo");
        sortedMapByKey.put(2, "Peregrin");
        sortedMapByKey.put(3, "Aragorn");
        sortedMapByKey.put(4, "Meriadok");
        sortedMapByKey.put(5, "Legolas");
        sortedMapByKey.put(6, "Samwise");
        sortedMapByKey.put(7, "Boromir");
        sortedMapByKey.put(8, "Gandalf");
        sortedMapByKey.put(9, "Gimli");

        // when
        Map<Integer, String> result = MapSorter.sortByKey(inputMap);

        // then
        assertThat(result).containsExactlyEntriesOf(sortedMapByKey);
    }
}