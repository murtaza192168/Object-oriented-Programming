package com.murtaza.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    // instance vars
    private Object[] array;
    private int size = 0; // size for actually fot those elements which would be inserted using add() method
    private static int DEFAULT_SIZE = 5;// default size of an array // static: bcz this default size is not dependent on the object of the class

    // Default constructor to initialize the instance variable (array)
    public CustomGenericArrayList(){
        array = new Object[DEFAULT_SIZE]; //[0,0,0,0,0]
    }

    //method: add(parameter)
    public void add(T num){

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
        Object[] temp = new Object[array.length * 2]; // new array will be double the size of the previous one
        for(int i=0; i<array.length; i++){
            temp[i] = array[i];
        }
        array = temp; // now the new array i.e. temp will point to the array
    }

    // method: size
    public int size(){
        return size;
    }
    //method: get()
    public T get(int index){
        return (T)array[index]; // or > return array[index]

    }

    // method: set(index, value)
    public void set(int index, T value){
        array[index] = (T)value;
    }

    public boolean isEmpty(){
        return  size == 0;
    }
    //method: remove();

    public T remove(){
        T removed = (T)array[--size];
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
//        ArrayList<Integer> list = new ArrayList();
//        list.add(23);
//        list.add(8);
//        list.add(9);
//        list.set(2, 44);
//        System.out.println(list);

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

//        System.out.println(arrayList.toString());
//        System.out.println(arrayList.isEmpty());

        // Custom Generic Array list object

        CustomGenericArrayList arrayList = new CustomGenericArrayList();
        for(int i=0; i< 25; i++){
            arrayList.add(i*2);
        }
        System.out.println(arrayList);
    }
}
