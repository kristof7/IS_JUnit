package com.isa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class JunitAssertions {

    @Test
    public void testNonGroupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};

        assertEquals(numbers[0], 1);
        assertEquals(numbers[3], 3);
        assertEquals(numbers[4], 1);
    }

    @Test
    public void testGroupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 1)
        );
    }

    @Test
    void trueAssumption() {
        assumeTrue(1 > 0);
        assertEquals(1 + 2, 3);
    }

    @Test
    void falseAssumption() {
        assumeFalse(1 < 0);
        assertEquals(1 + 2, 3);
    }

    @Test
    void assumptionThat() {
        String name = "Jan";
        assumingThat(
                name.equals("Jan"),
                () -> assertEquals(3, name.length())
        );
    }
}
