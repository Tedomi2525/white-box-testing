package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialSumTest {
    @Test
    void factorialOfZero() {
        assertEquals(1, FactorialSum.factorial(0));
    }

    @Test
    void factorialOfPositiveNumber() {
        assertEquals(120, FactorialSum.factorial(5));
    }

    @Test
    void factorialWithNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactorialSum.factorial(-1));
    }

    @Test
    void calculateWithZero() {
        assertEquals(0, FactorialSum.calculate(0));
    }

    @Test
    void calculateWithPositiveNumber() {
        assertEquals(9, FactorialSum.calculate(3));
    }

    @Test
    void calculateWithNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactorialSum.calculate(-1));
    }
}
