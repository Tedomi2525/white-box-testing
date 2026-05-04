package com.example;

public class RectangleCalculator {
    public static double perimeter(double length, double width) {
        validatePositive(length, width);
        return 2 * (length + width);
    }

    public static double area(double length, double width) {
        validatePositive(length, width);
        return length * width;
    }

    private static void validatePositive(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
    }
}
