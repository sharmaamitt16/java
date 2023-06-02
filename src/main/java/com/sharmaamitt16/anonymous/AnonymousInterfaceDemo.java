package com.sharmaamitt16.anonymous;

// Anonymous Class Implementing an Interface.

class AnonymousInterfaceDemo {
    public void createClass() {

        // anonymous class implementing interface
        AnonymousInterface p1 = new AnonymousInterface() {
            public void display() {
                System.out.println("Inside an anonymous class implementing an interface.");
            }
        };
        p1.display();
    }
}