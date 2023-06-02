package com.sharmaamitt16.reflection;

import java.lang.Class;
import java.lang.reflect.*;

class FieldReflection {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class using getClass().
            Class obj = d1.getClass();

            // access and set the type field
            Field type = obj.getField("type");
            type.set(d1, "labrador");

            // get the value of the field type
            String typeValue = (String) type.get(d1);
            System.out.println("Value: " + typeValue);

            // get the access modifier of the field type
            int mod = type.getModifiers();

            // convert the modifier to String form
            String modifier1 = Modifier.toString(mod);
            System.out.println("Modifier: " + modifier1);
            System.out.println(" ");

            // Access the private field color
            Field color = obj.getDeclaredField("color");

            // allow modification of the private field
            color.setAccessible(true);

            // set the value of color
            color.set(d1, "brown");

            // get the value of field color
            String colorValue = (String) color.get(d1);
            System.out.println("Value: " + colorValue);

            // get the access modifier of color
            int mod2 = color.getModifiers();

            // convert the access modifier to string
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier2);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}