package com.murtaza.polymorphism;

public class StaticPolymorphism {
    // Achieved via Method OVERLOADING

    double multiplication(double n, double m){
        return(n * m);
    }

    float multiplication(int a, int m, float n){
        return(a*m*n);
    }

    public static void main(String[] args) {
        StaticPolymorphism spoly = new StaticPolymorphism();
       float result = spoly.multiplication(123, 4, 5.6f);
//        IMPORTANT TO UNDERSTAND
       //float result = spoly.multiplication(123, 4, 5.6f, 5.6); // bcz if you pass more than the values that are defined in the method.. then the compiler will show you the error at compile time itself, as you can see a red line bcz there is no method defined of name multiplication with 4 parameters
//        System.out.println(result);

        double result1 = spoly.multiplication(1435.66,2233.5);
        System.out.println(result1);
    }
}
