package com.murtaza.inheritance.INTERFACES.extend_Interfaces;

public class MNclass implements M, N{
     public void greet(){
         System.out.println("Hi");
    }

    @Override
    public void fun() {
        System.out.println("Hi fun");
    }
    public void foo(){
        System.out.println("Hi foo");
    }

    public static void main(String[] args) {

    }
}
