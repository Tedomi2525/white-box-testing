package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleCalculatorTest {
    @Test
    void perimeterWithValidInput() {
        assertEquals(16.0, RectangleCalculator.perimeter(5, 3));
    }

    @Test
    void areaWithValidInput() {
        assertEquals(15.0, RectangleCalculator.area(5, 3));
    }

    @Test
    void perimeterThrowsWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> RectangleCalculator.perimeter(0, 3));
    }

    @Test
    void areaThrowsWhenWidthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> RectangleCalculator.area(5, -3));
    }
}
