package com.murtaza.polymorphism;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Square(); // UPCASTING: Actually the method which will be called. depends on the object(created next to new keyword.. ALRIGHT) thats why: the print statement of the square cild will be displayed
        Circle c = new Circle();
        Shape r = new Rectangle(); // How is this pssible.. shocked??
        Square sq = new Square();
        Triangle t = new Triangle();
        // calling same method via  different objects that wil give different outputs as per the type of shapes
        shape.area(); // OR Shape.area();
        c.area();     // OR Circle.area(); BECAUSE ALL METHOD IS DEFINED AS STATIC so All members will be static inside it
        r.area();     // OR Rectangle.area(); // How is this pssible.. shocked??
        sq.area();    // OR Square.area();
        t.area();     // OR Triangle.area();
    }
}
