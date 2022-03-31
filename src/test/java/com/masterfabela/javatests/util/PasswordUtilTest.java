package com.masterfabela.javatests.util;

import org.junit.Test;

import static com.masterfabela.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(
                WEAK,
                PasswordUtil.assesPasword("342sds"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(
                WEAK,
                PasswordUtil.assesPasword("dasdasdadasadasg"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(
                MEDIUM,
                PasswordUtil.assesPasword("a3d4g5h7f3"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(
                STRONG,
                PasswordUtil.assesPasword("a3d4g5h7f3!"));
    }

}
