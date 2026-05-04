package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    void solveQuadraticWithTwoRealRoots() {
        QuadraticEquation.Result result = QuadraticEquation.solve(1, -3, 2);

        assertEquals(QuadraticEquation.Type.TWO_REAL_ROOTS, result.getType());
        assertEquals(2.0, result.getX1());
        assertEquals(1.0, result.getX2());
    }

    @Test
    void solveQuadraticWithOneRealRoot() {
        QuadraticEquation.Result result = QuadraticEquation.solve(1, 2, 1);

        assertEquals(QuadraticEquation.Type.ONE_REAL_ROOT, result.getType());
        assertEquals(-1.0, result.getX1());
        assertEquals(-1.0, result.getX2());
    }

    @Test
    void solveQuadraticWithNoRealRoot() {
        QuadraticEquation.Result result = QuadraticEquation.solve(1, 1, 1);

        assertEquals(QuadraticEquation.Type.NO_REAL_ROOT, result.getType());
        assertNull(result.getX1());
        assertNull(result.getX2());
    }

    @Test
    void solveLinearWithOneRoot() {
        QuadraticEquation.Result result = QuadraticEquation.solve(0, 2, -4);

        assertEquals(QuadraticEquation.Type.LINEAR_ONE_ROOT, result.getType());
        assertEquals(2.0, result.getX1());
        assertNull(result.getX2());
    }

    @Test
    void solveLinearWithNoSolution() {
        QuadraticEquation.Result result = QuadraticEquation.solve(0, 0, 5);

        assertEquals(QuadraticEquation.Type.LINEAR_NO_SOLUTION, result.getType());
        assertNull(result.getX1());
        assertNull(result.getX2());
    }

    @Test
    void solveLinearWithInfiniteSolutions() {
        QuadraticEquation.Result result = QuadraticEquation.solve(0, 0, 0);

        assertEquals(QuadraticEquation.Type.LINEAR_INFINITE_SOLUTIONS, result.getType());
        assertNull(result.getX1());
        assertNull(result.getX2());
    }
}
