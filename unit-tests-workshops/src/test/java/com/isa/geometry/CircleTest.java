package com.isa.geometry;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CircleTest {

    @Test
    @DisplayName("Check if circumference is calculated properly when correct input is provided.")
    public void testIfCircumferenceCalculatedProperlyForValidInput() {
        // given
        Circle circle = new Circle(-2.0);
        Double expectedCircumference = 12.566370614359172;

        // when
        Double actualCircumference = circle.calculateCircumference();

        // then
        assertThat(actualCircumference).isNotNaN()
                                       .isEqualTo(expectedCircumference);
    }

    @Test
    @DisplayName("Check if area is calculated properly when correct input is provided.")
    public void testIfAreaIsCalculatedProperlyForValidInput() {
        // given
        Circle circle = new Circle(2.0);
        Double expectedArea = 12.5663;

        // when
        Double actualArea = circle.calculateArea();

        // then
        assertThat(actualArea).isNotNaN()
                              .isPositive()
                              .isCloseTo(expectedArea, Offset.offset(0.0001));
    }

    @Test
    @DisplayName("Check if circumference is calculated properly when negative input is provided.")
    public void testIfCircumferenceCalculatedProperlyForRadiusIsLessThan0() {
        // given
        Circle circle = new Circle(-2.0);
        Double expectedCircumference = -12.566370614359172;

        // when
        Double actualCircumference = circle.calculateCircumference();

        // then
        assertThat(actualCircumference == expectedCircumference).isTrue();
//        assertThat(actualCircumference).isNotNaN()
//                                       .isEqualTo(expectedCircumference);
    }

    @Test
    @DisplayName("Check if area is not calculated when radius is null")
    public void testIfAreaIsNotCalculatedWhenInvalidInput() {
        // given
        Circle circle = new Circle(null);

        // when & then
        assertThatThrownBy(() -> circle.calculateArea())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Radius is mandatory!");

        assertThatIllegalArgumentException().isThrownBy(circle::calculateArea);
    }

    @Test
    @DisplayName("Check if Circumference is not calculated when radius is null")
    public void testIfCircumferenceIsNotCalculatedWhenInvalidInput() {
        // given
        Circle circle = new Circle(null);

        // when & then
        assertThatThrownBy(() -> circle.calculateCircumference())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Radius is mandatory!");

        assertThatIllegalArgumentException().isThrownBy(circle::calculateArea);
    }
}
