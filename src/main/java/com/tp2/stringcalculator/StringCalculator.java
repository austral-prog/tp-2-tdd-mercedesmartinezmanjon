package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        int suma = 0;
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else if (numbers.length() > 1) {
            for (char N : numbers.toCharArray()) {
                String nro = String.valueOf(N);
                if (!nro.equals(" ") && !nro.equals("\n") && !nro.equals(",")) {
                    int n = Integer.parseInt(nro);
                    if (n < 0) {
                        throw new IllegalArgumentException("No están permitidos números negativos");
                    } else {
                        suma = suma + n;
                    }
                }
            }
        }
        return suma;
    }
}
