package com.isa.geometry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CircleTest {

    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfCircumferenceCalculatedProperlyForValidInput() {
        // given
        Circle circle = new Circle(2.0);
        Double expectedCircumference = 12.566370614359172;

        // when
        Double actualCircumference = circle.calculateCircumference();

        // then

    }
}
