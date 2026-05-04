package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthDaysTest {
    @Test
    void februaryInLeapYearHas29Days() {
        assertEquals(29, MonthDays.getDays(2, 2024));
    }

    @Test
    void februaryInCommonYearHas28Days() {
        assertEquals(28, MonthDays.getDays(2, 2023));
    }

    @Test
    void yearDivisibleBy100ButNot400IsNotLeapYear() {
        assertFalse(MonthDays.isLeapYear(1900));
    }

    @Test
    void yearDivisibleBy400IsLeapYear() {
        assertTrue(MonthDays.isLeapYear(2000));
    }

    @Test
    void monthWith30Days() {
        assertEquals(30, MonthDays.getDays(4, 2024));
    }

    @Test
    void monthWith31Days() {
        assertEquals(31, MonthDays.getDays(1, 2024));
    }

    @Test
    void invalidMonthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MonthDays.getDays(13, 2024));
    }

    @Test
    void invalidYearThrowsExceptionInGetDays() {
        assertThrows(IllegalArgumentException.class, () -> MonthDays.getDays(1, 0));
    }

    @Test
    void invalidYearThrowsExceptionInLeapYearCheck() {
        assertThrows(IllegalArgumentException.class, () -> MonthDays.isLeapYear(-1));
    }
}
