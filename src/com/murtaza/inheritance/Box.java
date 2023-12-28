package com.murtaza.inheritance;

import org.w3c.dom.ls.LSOutput;

public class Box {
    //instances vars
//    private float l;
//    float w;
//    float h;
    private double l;
    double h;
    double w;

    //default constructor
//     Box(){
//        // a cuboid
//        this.l = l;
//        this.w = w;
//        this.h = h;
//    }
//
//    // param constructor 1
//    Box(float side){
//        // a sqaure
//        this.l = side;
//        this.w = side;
//    }
//    // param constructor 3
//     Box(float length, float width, float height){
//        this.l = length;
//        this.w = width;
//        this.h = height;
//    //    this.weight; // error: bcz the Parent class cannot access the additional arguments of child class bcz those are only specific to child class
 //   }  // extended


// MULTI-LEVEL INHERITENCE

    public double getThePrivateMem(){
        return l;
    }

    public Box()
    {
        this.l = 3.98;
        this.h = 5.5;
        this.w = 6.01;
    }
    public Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
        //multilevel inheritence
    }
    public Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
