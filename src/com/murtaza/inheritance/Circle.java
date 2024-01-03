package com.murtaza.inheritance;

public class Circle {
    String color;
    Circle(){

    }
    public Circle(String color){
        super(); // used to call constructor of a parent class: In this case, the parent class thats is been called is the ObjectClass
        this.color = color;
    } // Hierachial inheritence < Parent class
    public Circle(Circle other){
        this.color = other.color;
    }
}
