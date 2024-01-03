package com.murtaza.COLLECTION_FRAMEWRKS;
import java.util.*;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        list.add(3);
        list.add(5);
        System.out.println("Array list elements:" +" "+ list);
        System.out.println("Index of 5 is:"+" "+ list.indexOf(5));

        list1.add(7);
        list1.add(8);
        list1.add(9);
        System.out.println("Linked list elements:" +" "+list1);
        list1.remove(1);
        System.out.println("Linked list elements:" +" "+list1);
    }
}
