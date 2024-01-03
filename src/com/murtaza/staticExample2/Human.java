package com.murtaza.staticExample2;

public class Human {
    // instance vars
    int human_age;
    float human_height, human_weight;
    static long population;

    // param constructor with public access modifyer
    public Human(int age, float height, float weight)
    {
        this.human_age = age;
        this.human_height = height;
        this.human_weight = weight;
        Human.population += 1;
    }
    public static int sum(){
        int result = 2+5;
    //    System.out.println(this.human_age); // cannot be referenced from a static context

        return result;

    }
}
