package com.tp2.password;

import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean isValid(String password) { //boolean se refiere al tipo de dato que retorna esta función
        if (password == null) return false;

        if (password.length() < 8) return false;

        if (!password.matches(".*[A-Z].*")) return false;

        if (!password.matches(".*[a-z].*")) return false;

        if (!password.matches(".*[0-9].*")) return false;

        String patronEspecial = ".*[" + Pattern.quote("!@#$%^&*()_+-=[]{}|;:,.<>?") + "].*";
        if (!password.matches(patronEspecial)) return false;

        return true;
    }
}
