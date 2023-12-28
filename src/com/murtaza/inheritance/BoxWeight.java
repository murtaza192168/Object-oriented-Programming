package com.murtaza.inheritance;


public class BoxWeight extends Box{
//        float weight;
    double weight;
//        BoxWeight(){
//            this.weight = 78.9f;
//            this.l = // error as l instance in Box is declared private
//        }
//
//    // Param constructor
//    BoxWeight(float l, float w, float h, float weight){
//       /*used to initialize values present in parentclass*/ super(l,w,h);  //call the parent class ka constructor in order to access instances of Box param constructor
//        // IF l instance is declared as private in its superclass/ parent class:: ALTHOUGH the subclass-(BoxWeight)
//        // includes the members of superclass-(Box), subclass wont be able to access the once that are private
//        this.weight = weight;
//    }

    public BoxWeight(double l, double h, double w,double weight){
        super(l,h,w); // calling parent class constructor
        this.weight = weight;
    }
    public BoxWeight(double side, double weight){
        super(side); // calling parent class constructor
        this.weight = weight;
        //multilevel inheritence
    }
    BoxWeight(){

    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

}
