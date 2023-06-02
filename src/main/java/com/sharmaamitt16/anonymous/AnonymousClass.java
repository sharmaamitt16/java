package com.sharmaamitt16.anonymous;

/**
 * In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.
 *
 * A nested class that doesn't have any name is known as an anonymous class.
 *
 * An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class. Its syntax is:
 *
 * class outerClass {
 *
 *     // defining anonymous class
 *     object1 = new Type(parameterList) {
 *          // body of the anonymous class
 *     };
 * }
 * Anonymous classes usually extend subclasses or implement interfaces.
 *
 * Here, Type can be
 *
 * a superclass that an anonymous class extends
 * an interface that an anonymous class implements
 * The above code creates an object, object1, of an anonymous class at runtime.
 *
 * Anonymous classes are defined inside an expression. So, the semicolon is used at the end of anonymous classes to indicate the end of the expression.
 */

public class AnonymousClass {
    public static void main(String[] args) {

        // Anonymous Class Extending a Class.
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.createClass();

        // Anonymous Class Implementing an Interface.
        AnonymousInterfaceDemo anonymousInterfaceDemo = new AnonymousInterfaceDemo();
        anonymousInterfaceDemo.createClass();
    }
}
