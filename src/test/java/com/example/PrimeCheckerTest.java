package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {
    @Test
    void numberLessThan2IsNotPrime() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void twoIsPrime() {
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    void evenNumberGreaterThan2IsNotPrime() {
        assertFalse(PrimeChecker.isPrime(8));
    }

    @Test
    void oddCompositeNumberIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(9));
    }

    @Test
    void oddPrimeNumberIsPrime() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    void biggerPrimeNumberIsPrime() {
        assertTrue(PrimeChecker.isPrime(11));
    }
}
