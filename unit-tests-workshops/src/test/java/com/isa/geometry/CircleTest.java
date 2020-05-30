package com.isa.geometry;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
        assertThat(actualCircumference).isGreaterThan(12).isNotNaN()
                .isEqualTo(expectedCircumference);

    }

    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfCircumferenceCalculatedProperlyForNegativeValidInput() {
        // given
        Circle circle = new Circle(-2.0);
        Double expectedCircumference = -12.566370614359172;

        // when
        Double actualCircumference = circle.calculateCircumference();

        // then
        assertThat(actualCircumference).isNotNaN()
                .isEqualTo(expectedCircumference);
    }

    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfAreaferenceCalculatedProperlyForValidInput() {
        // given
        Circle circle = new Circle(2.0);
        Double expectedArea = 20.1234;

        // when
        Double actualArea = circle.calculateArea();

        // then
        assertThat(actualArea).isGreaterThan(12).isNotNaN()
                .isPositive()
        .isCloseTo(expectedArea, Offset.offset(0.0001));

    }


    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfCircumferenceNotCalculatedWhenInvalidInput() {
        // given
        Circle circle = new Circle(null);
        Double expectedCircumference = 12.566370614359172;

        // when // then
        assertThatIllegalArgumentException().isThrownBy(circle::calculateArea);

    }

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


}
