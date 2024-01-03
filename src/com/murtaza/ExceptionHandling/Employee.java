package com.murtaza.ExceptionHandling;

public class Employee implements Cloneable{

    int id;
    float sal;
    String name;
    int[] arr;

    // param constructor
    public Employee(int id, float salary, String name){
        this.id = id;
        this.sal = salary;
        this.name = name;
        this.arr = new int[]{2,3,4,5};
    }
//    public Employee(Employee emp){
//        super();
//        this.id = emp.id;
//        this.sal = emp.sal;
//        this.name = emp.name;
//    }

    // OBJECT CLONNING: overriding the method clone() in order to create copies of an object in a faster way
    @Override
    public Object clone() throws CloneNotSupportedException{

        //this is SHALLOW COPY implementation
//
//        Employee cloneObject = (Employee)super.clone();
//        return cloneObject; // this is shallow copy
//        or
        return super.clone(); // this is shallow copy
        //this is DEEP COPY implementation
        // Creating a new object copy of it .



    }


}
