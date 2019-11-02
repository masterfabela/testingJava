package com.masterfabela.javatests.util;

class StringUtil {

    static String repeat(String str, int times){
        if (times < 0){
            throw new IllegalArgumentException("negative times are not allowed");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times ; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
