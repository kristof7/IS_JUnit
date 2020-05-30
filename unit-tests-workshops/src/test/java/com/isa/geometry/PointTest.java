package com.isa.geometry;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

public class PointTest {

    private static final Logger logger = Logger.getLogger(PointTest.class.getName());

    @BeforeEach
    public void beforeEach() {
        logger.info("This is @beforeEach method");
    }

    @AfterEach
    public void afterEach() {
        logger.info("This is @afterEach method");
    }

    @BeforeAll
    public static void beforeAll() {
        logger.info("This is @beforeAll method");
    }

    @AfterAll
    public static void afterAll() {
        logger.info("This is @afterAll method");
    }

    @Test
    public void testIfPointCreated() {
        logger.info("inside method testIfPointCreated");
        Point point = new Point(3.5, 6.8);
    }

    @Test
    public void testIfDistanceIsCorrect() {
        logger.info("inside method testIfDistanceIsCreated");
        Point point = new Point(2.0, 5.0);
        Assertions.assertEquals(4.123105625617661, point.distance(new Point(6.0, 4.0)));
    }
}
