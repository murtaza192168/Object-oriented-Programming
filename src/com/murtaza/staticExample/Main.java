package com.murtaza.staticExample;

public class Main {
    public static void main(String[] args) {
        // creating obj
        //Class name obj = new Constructor(//params)
//        Department computers = new Department(1222, "AI", 2);
//        System.out.println(computers.dept_id);

        //STATIC INSIDE NONSTATIC : WILL WORK FINE

        //NON-STATIC inside STATIC: NO, but can be used, by mentioning object reference EXPLICITLY
        Main obj1 = new Main();// created an object reference explicitly
        obj1.s1();// done

        s2(); // already static method
    }

    public void s1(){
        System.out.println("I am non-static!");
        run(); // a non-static method called in nonstatic method.
               // So now, at the end while this s1 method will be called, you have to mention the object reference explicitly
    }
    public  static void s2(){
        System.out.println("I am Static");
        Main m = new Main();
        m.run();
    }

    public void run(){
        System.out.println("You need to run to catch the train!");
    }
    public static void run1(){
        System.out.println("Run1");
    }
}
