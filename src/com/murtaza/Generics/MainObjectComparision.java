package com.murtaza.Generics;

import java.util.Arrays;
import java.util.Comparator;

public class MainObjectComparision {

    public static void main(String[] args) {
        // call constructor
        StudentObjectComparision murtaza = new StudentObjectComparision(21, 86.20f);
        StudentObjectComparision aliakbar = new StudentObjectComparision(33, 76.33f);
        StudentObjectComparision mohsin = new StudentObjectComparision(10, 96.02f);
        StudentObjectComparision kaizad = new StudentObjectComparision(3, 55.93f);
        StudentObjectComparision sabaah = new StudentObjectComparision(13, 84.35f);

        // creating object array-list
        // A new way of doing if else
        StudentObjectComparision[] list = {murtaza, aliakbar, mohsin, kaizad, sabaah};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<StudentObjectComparision>() { // Using this interface, we can get a ascending ordered list of array that is been inputed
            @Override
            public int compare(StudentObjectComparision o1, StudentObjectComparision o2) {
                return (int)(o1.marks - o2.marks);  // A VERY ADVANCED LEVEL: Its OK if you dont want to do it
            } // A new way of doing if else
        });
        System.out.println(Arrays.toString(list));

//        if(murtaza.compareTo(aliakbar) > 0){ // You have to use a predefined Interface known as Comparable and in that the method called "compareTo()" < inorder to compare objects
//            System.out.println("Murtaza is the highest");
//        }
//        else if(murtaza.compareTo(aliakbar) < 0){
//            System.out.println("Aliakbar is highest");
//        }
//        else{
//            System.out.println("Both objects marks are equal");
//        }

    }
}
