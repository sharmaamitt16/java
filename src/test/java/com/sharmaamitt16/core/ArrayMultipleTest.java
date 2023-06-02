package com.sharmaamitt16.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMultipleTest {

    @Test
    public void getArrayOfMultiples() {
        assertArrayEquals(new Integer[] {3, 6, 9, 12}, ArrayMultiple.getArrayOfMultiples(3,4));
        assertArrayEquals(new Integer[] {7, 14, 21, 28, 35}, ArrayMultiple.getArrayOfMultiples(7,5));
    }
}