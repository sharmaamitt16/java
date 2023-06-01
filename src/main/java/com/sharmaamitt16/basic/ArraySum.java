package com.sharmaamitt16.basic;

import java.util.Arrays;
import java.util.List;

public class ArraySum {

    public static Integer sum(Integer[] array) {
        Integer sum = 0;

        for (int i: array) {
            sum += i;
        }
        return sum;
    }

    public static Integer sumRecursive(Integer[] array, Integer n) {
        if (n == 0) {
            return array[n];
        }
        return array[n] + sumRecursive(array, n-1);
    }

    public static Integer sumGenerics(Integer[] arr) {
        List<Integer> integers = Arrays.asList(arr);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> a + b);

        return sum;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {4,8,12,16,20};

        System.out.println(sum(array));
        System.out.println(sumRecursive(array, array.length - 1));
        System.out.println(sumGenerics(array));
    }
}
