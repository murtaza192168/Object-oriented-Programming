package com.murtaza.inheritance.AbstractEx1;

public abstract class Parent {
    String name; // instance var in parent abstract class allowed
    //Can you create a constructor for an abstract class (Parent)? yes, but you cannot call or create an object of that constructor
    public Parent(String name){
        super();
        this.name = name;
    } // Construcor

    // Abstract method has only definition with empty body(no implementation).
      // Inorder to have implementations, we need to make child of this parent class, to override and provide the body
      // Abstract: OVERRIDE + INHERITANCE + POLYMORPHISM

    // abstract method 1
    // syntax : abstract_keyword dtype method_name(Params);
    abstract void passion();
    // abstract method 2
    abstract void profession();

    public void career(){ // normal method(not an abstract method): therefore it is has implementation
        System.out.println("Hi, I am a normal method"); // normal method can a;so be ovridden in the child classes of the abstract class
    }
    public static void greet(){ // static method: (Since static methods does not depend on the object.. therefor only static method are allowed to do implementation here in abstract class)
        System.out.println("Hello bro, I am static"); // static method can be cretaed and called
    }

}
