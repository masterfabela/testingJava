package com.masterfabela.javatests.util;

class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    static SecurityLevel assesPasword(String password) {
        if (password.length() < 8){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
