package com.sharmaamitt16.basic;

import java.util.Scanner;

public class EqualNumber {

    public static String isNumberEqual(Integer x, Integer y) {
        if (x.equals(y)) {
            return "Numbers are equal.";
        }
        else {
            return "Numbers are not equal.";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the First number:");
        Integer x = s.nextInt();
        System.out.print("Enter the Second number:");
        Integer y = s.nextInt();
        System.out.println(isNumberEqual(x, y));
    }
}
