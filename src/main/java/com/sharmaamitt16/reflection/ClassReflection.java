package com.sharmaamitt16.reflection;

import java.lang.Class;
import java.lang.reflect.*;

/**
 * In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.
 *
 * There is a class in Java named Class that keeps all the information about objects and classes at runtime. The object of Class can be used to perform reflection.
 *
 * In order to reflect a Java class, we first need to create an object of Class.
 * And, using the object we can call various methods to get information about methods, fields, and constructors present in a class.
 *
 * There exists three ways to create objects of Class:
 *
 * 1. Using forName() method
 * 2. Using getClass() method
 * 3. Using .class extension
 *
 * The package java.lang.reflect provides classes that can be used for manipulating class members. For example,
 *
 * Method class - provides information about methods in a class
 * Field class - provides information about fields in a class
 * Constructor class - provides information about constructors in a class
 */

class ClassReflection {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class using getClass().
            Class obj = d1.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}