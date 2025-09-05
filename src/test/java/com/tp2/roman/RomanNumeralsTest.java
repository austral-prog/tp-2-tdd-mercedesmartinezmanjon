package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {
    RomanNumerals nro = new RomanNumerals();
    @Test
    void testConvierteUno() {
        assertEquals("I", nro.convert(1));
    }
    @Test
    void testConvierteCinco() {
        assertEquals("V", nro.convert(5));
    }

    @Test
    void testConvierteDiez() {
        assertEquals("X", nro.convert(10));
    }

    @Test
    void testConvierteCuatro() {
        assertEquals("IV", nro.convert(4));
    }

    @Test
    void testConvierteNueve() {
        assertEquals("IX", nro.convert(9));
    }

    @Test
    void testConvierteCuarenta() {
        assertEquals("XL", nro.convert(40));
    }

    @Test
    void testConvierteCincuenta(){
        assertEquals("L", nro.convert(50));
    }

    @Test
    void testConvierteNoventa(){
        assertEquals("XC", nro.convert(90));
    }

    @Test
    void testConvierteCien(){
        assertEquals("C", nro.convert(100));
    }

    @Test
    void testConvierteCuatrocientos(){
        assertEquals("CD", nro.convert(400));
    }

    @Test
    void testConvierteQuinientos(){
        assertEquals("D", nro.convert(500));
    }

    @Test
    void testConvierteMil(){
        assertEquals("M", nro.convert(1000));
    }

    @Test
    void testComplejo1(){
        assertEquals("MCMXCIV", nro.convert(1994));
    }

    @Test
    void testComplejo2(){
        assertEquals("MMXXIII", nro.convert(2023));
    }

    @Test
    void testComplejo3(){
        assertEquals("MMMDCCCLXXXVIII", nro.convert(3888));
    }

    @Test
    void testComplejo4(){
        assertEquals("MMCDXXI", nro.convert(2421));
    }
//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
