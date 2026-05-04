package com.example;

public class MonthDays {
    public static int getDays(int month, int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be greater than 0");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be from 1 to 12");
        }

        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be greater than 0");
        }

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
