package com.sharmaamitt16.design.singleton;

/**
 * In Java, Singleton is a design pattern that ensures that a class can only have one object.
 *
 * To create a singleton class, a class must implement the following properties:
 *
 * Create a private constructor of the class to restrict object creation outside of the class.
 * Create a private attribute of the class type that refers to the single object.
 * Create a public static method that allows us to create and access the object we created.
 * Inside the method, we will create a condition that restricts us from creating more than one object.
 */

public class Singleton {
    public static void main(String[] args) {

        /**
         * We have created a singleton class Database.
         * The dbObject is a class type field. This will refer to the object of the class Database.
         * The private constructor Database() prevents object creation outside of the class.
         * The static class type method getInstance() returns the instance of the class to the outside world.
         * In the Main class, we have class type variable db1. We are calling getInstance() using db1 to get the only object of the Database.
         * The method getConnection() can only be accessed using the object of the Database.
         * Since the Database can have only one object, all the clients can access the database through a single connection.
         */
        Database db1;

        // refers to the only object of Database
        db1= Database.getInstance();

        db1.getConnection();
    }
}

