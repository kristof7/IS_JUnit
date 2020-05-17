package com.isa.operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicIntOperatorTest {

    @Test
    public void testSum() {
        BasicIntOperator basicIntOperator = new BasicIntOperator(4, 2);
        assertEquals(6, basicIntOperator.sum());
    }

    @Test
    public void testDifference() {
        BasicIntOperator basicIntOperator = new BasicIntOperator(4, 2);
        assertEquals(2, basicIntOperator.difference());
    }

    @Test
    public void testProduct() {
        BasicIntOperator basicIntOperator = new BasicIntOperator(4, 2);
        assertEquals(8, basicIntOperator.product());
    }

    @Test
    public void testQuotient() {
        BasicIntOperator basicIntOperator = new BasicIntOperator(4, 2);
        assertEquals(2, basicIntOperator.quotient());
    }
}
