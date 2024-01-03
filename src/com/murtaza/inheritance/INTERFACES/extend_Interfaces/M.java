package com.murtaza.inheritance.INTERFACES.extend_Interfaces;

public interface M {

     public void greet();
     void fun();

     // Static INTERFACE METHOD
     // since static members cannot be overridedn  doesnt have any object. So due to that a static interface method should have a body with its method definition
      private static void StaticInterfaceMethod(){
           System.out.println("Hey, Only my implementation is allowed to be done in the abstract class BECAUSE I AM A STATIC INTERFACE METHOD");
      }

     public static void main(String[] args) {
          // You can call the static interface method using Interface_name
          M.StaticInterfaceMethod();
     }
}
