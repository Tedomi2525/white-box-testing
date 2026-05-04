package com.example;

public class GCDCalculator {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be greater than or equal to 0");
        }

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD of 0 and 0 is undefined");
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
