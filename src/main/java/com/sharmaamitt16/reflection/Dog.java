package com.sharmaamitt16.reflection;

public class Dog extends Animal {

    private String color;

    private Integer age;

    public String type;

    // public constructor without parameter
    public Dog() {

    }

    // private constructor with a single parameter
    private Dog(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }
}