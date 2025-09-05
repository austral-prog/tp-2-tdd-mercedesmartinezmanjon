package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator r = new StringCalculator();
    @Test
    public void testStringVacio() {
        assertEquals(0, r.add(""));
        assertNotEquals(0, r.add("7"));
    }

    @Test
    public void testUnNumero() {
        assertEquals(7, r.add("7"));
    }

    @Test
    public void testDosNrosSeparadosPorComa(){
        assertEquals(5, r.add("3,2"));
        assertEquals(9, r.add("6,3"));
    }

    @Test
    public void testMultiplesNrosSeparadosPorComa(){
        assertEquals(7, r.add("1,2,4"));
        assertEquals(10, r.add("1,2,3,4"));
    }

    @Test
    public void testNrosSeparadosPorSaltoDeLinea(){
        assertEquals(15, r.add("9\n3, 1, 2"));
        assertEquals(17, r.add("7\n5\n3\n2"));
    }

    @Test
    public void testNroNegativo(){
        assertThrows(IllegalArgumentException.class, () -> r.add("6\n1\n-3"));
    }
//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
