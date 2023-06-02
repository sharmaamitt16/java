package com.sharmaamitt16.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualNumberTest {

    @Test
    public void isNumberEqualTest() {
        assertEquals("Numbers are equal.", EqualNumber.isNumberEqual(4,4));
        assertEquals("Numbers are not equal.", EqualNumber.isNumberEqual(4,5));
    }

}