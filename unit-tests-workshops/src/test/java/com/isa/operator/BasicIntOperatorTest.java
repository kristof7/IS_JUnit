package com.isa.operator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicIntOperatorTest {

    BasicIntOperator basicIntOperator;

    @BeforeEach
    public void beforeEach() {
        basicIntOperator = new BasicIntOperator(4,2);
    }

    @AfterEach
    public void afterEach() {
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
