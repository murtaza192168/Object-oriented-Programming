package com.murtaza.COLLECTION_FRAMEWRKS.LinkedList;

public class CLL {
    private Node tail;
    private Node head;
   private int size;

    public CLL(){
        this.head = null; // initially both head and tail are null
        this.tail = null; // By defualt it is null. You specify or not its ok
        this.size = 0;
    }

    // INSERT A NODE IN : CIRCULAR LL
    public void insertAtEnd(int val){
        // Before actually inserting, check if there are value of nodes there in LL or not
        // If not then implement accordingly

        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        // Assume you are inserting after the tail node
        tail.next = node;
        node.next = head;
        tail = node;
    }
    // DISPLAY CLL
    public void display(){
        Node temp = head;
        if(head != null) { // means that the list is not empty. (Comonsense: then only you will be able to DISPLAY the nodes)
             //while(temp != head) { }// But iitially it is pointing to the head only for displsying purpose. (This is only the issue in displaying the very first node.. bcz from second node onwards, temp would be going to point to further nodes.. AS SIMPLE)
             // For this reason make use of do-while loop so that the first node gets inserted without any barriers
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head); // Now, this while will act as the terminte_cond.
            System.out.print("HEAD");
        }
    }


    private class Node{
        private int value;
       private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }
}
