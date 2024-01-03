package com.murtaza.LambdaFunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda1{


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i <= 9; i++){
            list.add(i); // important forloop for forEach lambda func
        }
        // Lambda funcion
//        list.forEach((i) -> System.out.println(i * 4));
                       // or //
        // we can store it in consumer type also
          Consumer<Integer> consumerObj1 = ((item) -> System.out.println(item*5));
          list.forEach(consumerObj1); // list type of ArrayList //


        // Lambda function for sum method that is defined in inerface
        // It is just like Consumer type storing
        Maths addition = ((n1, n2) -> n1+n2);
        Maths subtraction = ((n1, n2) -> n1-n2);
        Maths multiplication = ((n1, n2) -> n1*n2);
        Maths division = ((n1, n2) -> n1/n2);

        lambda1 obj = new lambda1();
        System.out.println(obj.operate(14, 7, subtraction));
    }

    // filling body implementation of interface method
    private int operate(int n1, int n2, Maths op){ // remember, here we have passed the interface object reference of Maths i.e op , and hv not created any object of interface,, as intterface hv bydefault abstract methods, we cannot create any objects of it
        return op.operation(n1, n2);
    }
}

 interface Maths{
    int operation(int n1, int n2);
}

