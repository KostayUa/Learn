package org.rogaandkopita;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test1() {
        int result = Calculator.plus(2,2);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        int result = Calculator.plus(3,3);
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        int result = Calculator.plus(2,3);
        assertEquals(5, result);
    }
}
