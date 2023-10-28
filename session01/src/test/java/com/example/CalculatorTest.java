package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int result = Calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(3, 4);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        int result = Calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = Calculator.divide(8, 4);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy0() {
        Calculator.divide(8, 0);
    }

}
