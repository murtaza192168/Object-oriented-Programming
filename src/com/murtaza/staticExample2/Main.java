package com.murtaza.staticExample2;

public class Main {
    public static void main(String[] args) {
        // call constructor, create an obj of that class and give values
        Human Aliakber = new Human(21, 169.5f, 60.50f);
        Human Murtaza = new Human(22, 167.8f, 57.60f);
        Human Ram = new Human(26, 150.0f, 66.60f);
        System.out.println(Aliakber.human_height);
        System.out.println(Murtaza.human_age);


        System.out.println(Human.population); // static var accessing via direct classname bcz its common to all object in that class
        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
