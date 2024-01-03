package com.murtaza.polymorphism;

public class Rectangle extends Shape {
    // this will run when object of Shape is created
    // hence this will override its parent class / base class
    // To check if the methods are overriding...
    @Override  // annotation to check
    public  void area(){

        System.out.println("I am a rectangle with l*b");

    }
}
