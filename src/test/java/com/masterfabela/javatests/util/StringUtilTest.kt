package com.masterfabela.javatests.util

import org.junit.Assert
import org.junit.Test
import java.lang.IllegalArgumentException

class StringUtilTest {
    @Test
    fun repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1))
    }

    @Test
    fun repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3))
    }

    @Test
    fun repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0))
    }

    @Test(expected = IllegalArgumentException::class)
    fun repeat_string_negative_times() {
        StringUtil.repeat("hola", -34)
    }
}