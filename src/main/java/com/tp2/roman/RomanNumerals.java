package com.tp2.roman;

public class RomanNumerals {
    
    public String convert(int number) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"};

        String nroRomano = "";

        for (int i = 0; i < valores.length; i++) {
            while (number >= valores[i]) {
                number -= valores[i];
                nroRomano += simbolos[i];
            }
        }

        return nroRomano;
    }
}