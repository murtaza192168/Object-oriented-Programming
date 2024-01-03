package com.murtaza.inheritance.INTERFACES.NestedInterface;

public class Class {
    // NESTED INTERFACE
    public interface NestedInterface{
        public boolean isEven(int num);
    }
}
class B implements Class.NestedInterface{
    @Override
    public boolean isEven(int num){
        return (num & 1) != 1;
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isEven(7));
    }
}
