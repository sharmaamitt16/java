package com.sharmaamitt16.core;

import java.util.Scanner;

public class ArrayMultiple {

    public static Integer[] getArrayOfMultiples(Integer num, Integer length) {
        Integer[] multiples = new Integer[length];

        for(int i=1; i<=length; i++) {
            multiples[(i-1)] = num*i;
        }

        return multiples;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the First number:");
        Integer number = s.nextInt();
        System.out.print("Enter the Second number:");
        Integer length = s.nextInt();

        Integer[] multiples = getArrayOfMultiples(number, length);
        System.out.println("Array of multiples is given below:");
        for (int i: multiples) {
            System.out.println(i);
        }
    }
}
