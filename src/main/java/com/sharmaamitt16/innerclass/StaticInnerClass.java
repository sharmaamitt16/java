package com.sharmaamitt16.innerclass;

/**
 * In Java, we can also define a static class inside another class. Such class is known as static nested class.
 * Static nested classes are not called static inner classes.
 *
 * Unlike inner class, a static nested class cannot access the member variables of the outer class.
 * It is because the static nested class doesn't require you to create an instance of the outer class.
 *
 * OuterClass.NestedClass obj = new OuterClass.NestedClass();
 *
 * Here, we are creating an object of the static nested class by simply using the class name of the outer class.
 * Hence, the outer class cannot be referenced using OuterClass.this.
 */

public class StaticInnerClass {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard motherBoard = new MotherBoard("Demo");
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}

class MotherBoard {
    public static String model = "MSI";
    public MotherBoard(String model) {
        this.model = model;
    }

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // Accessing the variable model of the outer class.
            if(MotherBoard.model.equals("MSI")) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}