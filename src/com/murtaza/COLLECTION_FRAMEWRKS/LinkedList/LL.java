package com.murtaza.COLLECTION_FRAMEWRKS.LinkedList;

public class LL {
    // node head and node tail
   private static Node head;
    private static Node tail;
    private static int size; // declare

    // to initialise the size instance var, create a constructor of this LL class
    public LL(){
        LL.size = 0; // initialise
    }

    public  void insertFirst(int val){
        // First step to create a node.. and insert the value in it
        Node node = new Node(val);
        // You need to insert this new node at the beginning so first you would point the next of the node to head (as head is currently pointing to its existing node)
        node.next = head; // now the new node is pointing to the head node but the head is still pointing to the existing node.
        // As we all know that the head should always point to the first element of the LL.
        // In order to do this, you need to make point head to the new node
        head = node;

        if(tail == null){ // if ll has only an element
            tail = head; // tail will point at the node where head is pointing to.. indicating that theres only on node in LL
        }
        size += 1;
    }

    public void insertAtEnd(int val){
        if(tail == null){
            insertFirst(val);
        }
        else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }
    // INSERT AT A SPECIFIED INDEX
    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);

        }
        if(index == size){
            insertAtEnd(val);
            return; //
        }
        Node temp = head; // since this node is been given to the first index(0).. therefore start your for loop from 1
        for(int i = 1; i <= index - 1; i++){
            temp = temp.next;
        }
        // Now create a new node to be inserted
        Node node = new Node(val, temp.next); // index // just draw ll and see analyze how is it working ..only then you will understand
        temp.next = node;
        size += 1;
    }
    // DELETE FROM FIRST INDEX
    public int deleteFirst(){
       int val =  head.value;  // bcz you want to return a value that is being deleted. So obvio you will store that current head value in that variable and then will move the pointr ahead
       head = head.next;
       if(head == null){
           tail = null;
       }
       size -= 1;
       return val;
    }
    // DELETE FROM END INDEX : ITS ABOUT get METHOD to be called (size-2)
    public int deleteEnd(){
        if(size <=1 ){
            return deleteFirst();
        }
        int val = tail.value;
        // to actually manually delete that last ele node
        Node secondLast = get(size-2);
        tail = secondLast; // point the tail to secondLast named node
        tail.next = null;

        size --;
        return val;
    }
    public int deleteAtIndex(int index){
        //check if the index at whcih the node to be inserted is zero (first position): just return the method: deleteFirst
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1 ){
            return deleteEnd();
        }
        Node prev = get(index - 1); // get the node at (index-1)
        // the value that has to be deleted and returned from this function, build that:
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }
    public Node get(int index){ // We implemented this getMethod as we dont have any concept of node.prev just like node.next.. that is why
        Node temp_node = head;
        for(int i=0; i<=index-1; i++) { // Iterate this loop till the index (that is prior to the node to be deleted)
            temp_node = temp_node.next;
        }
        return temp_node;
     }


    public void display(){
        // Explanation in the book: LL
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public static class Node{

        int value;
        Node next;

        public Node(int value, Node next){ //param constructor 1 // in use
            this.next = next;
            this.value = value;
        }

        public Node( int value){ // param contructor 2 // not in use

            this.value = value;

        }

        // Method to insert the new node (with value) at the begining

    }


}
