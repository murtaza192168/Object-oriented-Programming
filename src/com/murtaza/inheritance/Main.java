package com.murtaza.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        double l = b.getThePrivateMem(); // This is how we access private member indirectly by creating getter method in
        System.out.println(l);

//        Box obj1 = new Box(3.6f); // called default const
//      //  System.out.println(obj1.l);
//
//          Box obj2 = new Box(4.6f);
//      //  System.out.println(obj2.l);  // called param construct with one parameter passed
//
//        //default constructor calling
//        BoxWeight obj3 = new BoxWeight();
//        System.out.println(obj3.weight);
//
//        //param constructor calling
//        BoxWeight obj4 = new BoxWeight(4.5f,6.9f, 7.55f,5.5f); // called param constructor with extending
       // System.out.println(obj4.l);

//        BoxPrice obj6 = new BoxPrice(87, 99, 7000);
//        System.out.println(obj6.cost);

        // HIERARCHIAL INHERITENCE

        CircleRadius c_rad = new CircleRadius("black", 5.0); // child 1 of hierarchial inheritence
        CircleDiameter c_diam = new CircleDiameter("white", 10.0); //child 2 of hierarchial inheritence
        // call
        System.out.println(c_rad.color + " "+ c_rad.r);
        System.out.println(c_diam.color +" "+ c_diam.diam);
        System.out.println(c_diam.getClass().getClassLoader()); // experimenting the getClass() and its internal methods
    }
}
