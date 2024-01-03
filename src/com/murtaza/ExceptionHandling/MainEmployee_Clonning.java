package com.murtaza.ExceptionHandling;

import java.util.Arrays;

public class MainEmployee_Clonning {

    public static void main(String[] args) throws CloneNotSupportedException{
        Employee kaizad = new Employee(1265, 23000.78f, "Beddingwala");
        // Creating a copy of the above object using new keyword
//        Employee objectCopy = new Employee(kaizad); // since while copying values from one object to another using new keyword, takes much of the processing time.
//        System.out.println(objectCopy.id);          // So, in ordr to make it faster , we can use Object Clonning

        Employee cloneObject = (Employee)kaizad.clone(); // since clone() is a method of type object therefore we need to cast it in our Employee bcz Object class is above the Employee object class
        kaizad.name = "Burhanuddin";  //SHALLOW COPY HERE NOT WORKING, I DONT KNOW WHY??
        System.out.println(cloneObject.name);  // Burhanuddin
        System.out.println(kaizad.name);       // Beddingwala  // WHY NOT HAPPENING??? DOUBT

     // SHALLOW COPY WORKS WITH NON-PRIMITIVES ONLY AND NOT WITH PRIMITIVES


        // SHALLOW COPY EXAMPLE 2
        System.out.println(Arrays.toString(cloneObject.arr));
        cloneObject.arr[2] = 8; // yeah so cloneObject will definitely show changes in an array bcs=z you updated the array element at index 2
                                // But what about the kaizad? will it change?
                                // YES YES, IT WILL GET MODIFIED AS WELL : SHALLOW CAOPY
        System.out.println(Arrays.toString(kaizad.arr)); // Yes bro, it changed.


        System.out.println();
    }
}
