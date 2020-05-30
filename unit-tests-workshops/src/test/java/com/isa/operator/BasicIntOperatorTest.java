package com.isa.operator;

import com.isa.geometry.PointTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicIntOperatorTest {

    public BasicIntOperator basicIntOperator;

    private static final Logger logger = Logger.getLogger(PointTest.class.getName());


    @BeforeEach
    public void beforeEach() {
        logger.info("before each test");
        basicIntOperator = new BasicIntOperator(4, 2);
    }

    @AfterEach
    public void afterEach() {
        logger.info("after each test");
        logger.info("test if ExceptionThrownForNullLogin");
        basicIntOperator = null;
    }

    @Test
    public void testSum() {
        assertEquals(6, basicIntOperator.sum());
    }

    @Test
    public void testDifference() {
        assertEquals(2, basicIntOperator.difference());
    }

    @Test
    public void testProduct() {
        assertEquals(8, basicIntOperator.product());
    }

    @Test
    public void testQuotient() {
        assertEquals(2, basicIntOperator.quotient());
    }
}
