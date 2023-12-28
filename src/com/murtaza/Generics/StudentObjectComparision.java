package com.murtaza.Generics;

public class ObjectComparision implements Comparable<ObjectComparision.Student> {


    public static class Student{
        // instance vars
        int roll_no;
        float marks;

        public Student(int roll_no, float marks){
            this.roll_no = roll_no;
            this.marks = marks;
        }

        @Override
        public int compareTo(ObjectComparision.Student o){
            int difference = (int)(this.marks  - o.marks); // internal method of comparing: refer Comparable interface ka document
            return difference;
        }
    }

}
