package com.isa.geometry;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class PointTest {

    private static final Logger logger = Logger.getLogger(PointTest.class.getName());

    @BeforeAll
    public static void beforeAll() {
        logger.info("This is @BeforeAll method");
    }

    @AfterAll
    public static void afterAll() {
        logger.info("This is @AfterAll method");
    }

    @BeforeEach
    public void beforeEach() {
        logger.info("This is @BeforeEach method");
    }

    @AfterEach
    public void afterEach() {
        logger.info("This is @AfterEach method");
    }


    @Test
    public void testIfPointCreated() {
        logger.info("Inside test testIfPointCreated");
        Point point = new Point(3.5, 6.8);
    }

    @Test
    public void testIfDistanceIsCorrect() {
        logger.info("Inside test testIfDistanceIsCorrect");
        Point point = new Point(2.0, 5.0);
        Assertions.assertEquals(4.123105625617661, point.distance(new Point(6.0, 4.0)));
    }
}
