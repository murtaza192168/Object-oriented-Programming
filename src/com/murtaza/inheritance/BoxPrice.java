package com.murtaza.inheritance;

public  class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
        //multilevel inheritence
    }
//    BoxPrice(double cost){
//        super(weight);
//        this.cost = cost;
//    }
}
