package com.sharmaamitt16.basic;

import java.util.Scanner;

public class NextNumber {

    public static int getNextNum(Integer n) {
        n++;
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        Integer number = s.nextInt();
        System.out.println("Next number is: " + getNextNum(number));
    }
}
