package com.murtaza.inheritance;

public class CircleRadius extends Circle{
    double r;

    CircleRadius(){
        this.r = 6.25;
    }
    public CircleRadius(String color, double radius){ // hierarchial inheritence
        super(color);
        this.r = radius;

    }
}
