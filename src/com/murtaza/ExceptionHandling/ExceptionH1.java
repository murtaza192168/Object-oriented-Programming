package com.murtaza.ExceptionHandling;

public class ExceptionH1 {
    public static void main(String[] args) {
        int a = 88, b = 0, c = 4;
        // implementation of try and catch block.
        // Try block is used normally OR it can be used when a programmer has a doubt whether a particular process I am writing or trying something irrespective of what result we would get
        // Risky code we write inside the try block

        // catch: In order to catch the exception occured due to the code that is been written in try block
        String message ="Rahul" ;
        try{
//         ExceptionH1 excObj = new ExceptionH1();
//            System.out.println(excObj.divide(44, 0));
            if(message.equals("Rahul")){
                throw new CustomException("Message sent to right person");
            }
            System.out.println("Data breached");
        }
        catch(CustomException ce){
            System.out.println(ce.getMessage());
        }
//        catch(Exception e){
//            System.out.println("Normal exception");
//        }
        finally{
            System.out.println("No matter what happens, I will be executed.");
        }

    }

    public int divide(int n1, int n2)throws Exception{
        if(n2 == 0 ){
            throw new Exception("Please do not divide by zero");
        }

        return n1 / n2;
    }
}
