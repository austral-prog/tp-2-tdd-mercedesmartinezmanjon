package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    // TODO: Replace these lines with your tests
    //cada test: prueba independiente
    //comprobar que el programa funciona
    @Test
    void test2024esBisiesto() {
        //espero que sea verdadero
        LeapYear year = new LeapYear();
        assertTrue(year.isLeapYear(2024));

    }

    @Test
    void test1900NoEsBisiesto() {
        //debería ser falso
        LeapYear year = new LeapYear();
        assertFalse(year.isLeapYear(1900));
    }

    @Test
    void test2000EsBisiesto() {
        LeapYear year = new LeapYear();
        assertTrue(year.isLeapYear(2000));
    }

    @Test
    void test2023NoEsBisiesto() {
        LeapYear year = new LeapYear();
        assertFalse(year.isLeapYear(2023));
    }
}



//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400

