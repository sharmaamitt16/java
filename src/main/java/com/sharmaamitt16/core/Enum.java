package com.sharmaamitt16.core;

enum Size {
    SMALL {
        // overriding toString() for SMALL
        public String toString() {
            return "The size is small.";
        }
    },
    MEDIUM,
    LARGE,
    EXTRALARGE {
        // overriding toString() for SMALL
        public String toString() {
            return "The size is extra large.";
        }
    }
}

public class Enum {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(Size.MEDIUM);
        pizza.orderPizza();

        // To string function of enum.
        System.out.println("string value of SMALL is: " + Size.SMALL.toString());
        System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());
    }
}

class Pizza {
    Size pizzaSize;
    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}
