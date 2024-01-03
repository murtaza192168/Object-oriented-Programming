package com.murtaza.Generics;

import java.util.ArrayList;
import java.util.Arrays;

// Constructing our own ArrayList : Custom
public class CustomArrayList {
    // instance vars
    private int[] array;
    private int size = 0; // size for actually fot those elements which would be inserted using add() method
    private static final int DEFAULT_SIZE = 5;// default size of an array // static: bcz this default size is not dependent on the object of the class

    // Default constructor to initialize the instance variable (array)
    public CustomArrayList(){
        this.array = new int[DEFAULT_SIZE]; //{,0,0,0,0}
    }

    //method: add(parameter)
    public void add(int num){

       if(isFull()){
           resize();
       }
       array[size++] = num;
    }
    // method: isFull()
    public boolean isFull(){
        return size == array.length;
    }
    // method: resize()
    public void resize(){
        // first temporary array to copy all new elements
        int[] temp = new int[array.length * 2]; // new array will be double the size of the previous one
        for(int i=0; i<array.length; i++){
            temp[i] = array[i];
        }
        array = temp; // now the  pointer of old array i.e. array will point to the new array temp
    }

    // method: size
    public int size(){
        return size;
    }
    //method: get()
    public int get(int index){ // fetch the element by its index
        int value = array[index]; // or > return array[index]
        return value;
    }

    // method: set(index, value)
    public void set(int index, int value){
        array[index] = value;
    }

    public boolean isEmpty(){
        return  size == 0;
    }
    //method: remove();

    public int remove(){
        int removed = array[--size]; // pre-decrement
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(23);
//        list.add(8);
//        list.add(9);
//        list.set(2, 44);
//        System.out.println(list);

        CustomArrayList arrayList = new CustomArrayList();


//        arrayList.add(22);
//        arrayList.add(23);
//        arrayList.add(25);
//        arrayList.add(27);
//        arrayList.add(28);
//        arrayList.add(29);
//        arrayList.add(30);

        // add elements using for loop inorder to check whether resize function working properly..
//        for (int i=0;i<14; i++){
//            arrayList.add(2 * i);
//        }
//        int removed = arrayList.remove();
//        arrayList.set(5, 11);

        System.out.println(arrayList.toString()); // not neded
        System.out.println(arrayList.isEmpty());
    }
}
