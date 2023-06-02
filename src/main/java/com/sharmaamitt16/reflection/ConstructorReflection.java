package com.sharmaamitt16.reflection;

import java.lang.Class;
import java.lang.reflect.*;

class ConstructorReflection {
    public static void main(String[] args) {

        try {
            // create an object of Class using .class()
            Class obj = Dog.class;

            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors convert it into string form
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}