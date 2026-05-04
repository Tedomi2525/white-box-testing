package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingSumTest {
    @Test
    void calculateWithZero() {
        assertEquals(0, AlternatingSum.calculate(0));
    }

    @Test
    void calculateWithOne() {
        assertEquals(1, AlternatingSum.calculate(1));
    }

    @Test
    void calculateWithOddN() {
        assertEquals(3, AlternatingSum.calculate(5));
    }

    @Test
    void calculateWithEvenN() {
        assertEquals(-3, AlternatingSum.calculate(6));
    }

    @Test
    void negativeNThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> AlternatingSum.calculate(-1));
    }
}
