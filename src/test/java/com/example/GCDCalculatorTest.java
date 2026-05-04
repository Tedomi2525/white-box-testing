package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDCalculatorTest {
    @Test
    void gcdWithTwoPositiveNumbers() {
        assertEquals(6, GCDCalculator.gcd(12, 18));
    }

    @Test
    void gcdWhenFirstNumberIsZero() {
        assertEquals(5, GCDCalculator.gcd(0, 5));
    }

    @Test
    void gcdWhenSecondNumberIsZero() {
        assertEquals(5, GCDCalculator.gcd(5, 0));
    }

    @Test
    void gcdOfCoprimeNumbers() {
        assertEquals(1, GCDCalculator.gcd(7, 9));
    }

    @Test
    void negativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> GCDCalculator.gcd(-1, 5));
    }

    @Test
    void gcdOfZeroAndZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> GCDCalculator.gcd(0, 0));
    }
}
