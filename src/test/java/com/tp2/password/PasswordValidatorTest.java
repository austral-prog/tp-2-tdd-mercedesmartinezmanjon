package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    private final PasswordValidator resultado = new PasswordValidator();

    //Longitud
    @Test
    void testContraseñaCorta() {
        assertFalse(resultado.isValid("abc"));
    }

    @Test
    void test8CaracteresSinOtrosRequisitos() {
        assertFalse(resultado.isValid("abcdefgh"));
    }

    //Mayúscula requerida
    @Test
    void testSinMayúsculas() {
        assertFalse(resultado.isValid("abcdefgh1!"));
    }

    //Minúscula requerida
    @Test
    void testSinMinúsuclas() {
        assertFalse(resultado.isValid("ABCDEFG1!"));
    }

    //Número requerido
    @Test
    void testSinNumero() {
        assertFalse(resultado.isValid("Abcdefgh!"));
    }

    //caracter especial requerido
    @Test
    void testSinCaracterEspecial() {
        assertFalse(resultado.isValid("Abcdefg1"));
    }

    // Contraseña válida
    @Test
    void testContraseñaValida() {
        assertTrue(resultado.isValid("Abcdefg1!"));
    }
}
    //    Missing tests:
//
//- H- Password with less than 8 characters should be invalid
//- H-Password with 8 or more characters should pass length validation
//- H-Password without uppercase letter should be invalid
//- H-Password without lowercase letter should be invalid
//- H- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid

