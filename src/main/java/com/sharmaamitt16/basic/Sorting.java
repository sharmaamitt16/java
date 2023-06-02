package com.sharmaamitt16.basic;

import java.util.Arrays;

public class Sorting {

    public static void sortString(String string) {
        System.out.println("Original String: " + string);

        char[] split = string.toCharArray();
        Arrays.sort(split);
        String sortedString = String.valueOf(split);
        System.out.println("Sorted String: " + sortedString);
    }

    // Example function for string operations.
    public static String removeTrailingComma(String string) {
        string = string.trim();
        return string.substring(0, string.length() - 1);
    }

    // Example function for string operations.
    public static void printArrayString(Integer[] array, String message) {
        String original = "[";
        for (int value: array) {
            original += value + ",";
        }
        original = removeTrailingComma(original);
        original += "]";

        System.out.println(message + original);
    }

    public static void arraySort(Integer[] array) {
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        String string = "fgtesrcsawehno";
        sortString(string);

        Integer[] array = new Integer[] {90,23,0,3,5,4,1};
        arraySort(array);
    }
}
