package com.murtaza.COLLECTION_FRAMEWRKS.LinkedList;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes

public class DLL {
    private Node head; // Node has to be created as a class inside this class
    private Node tail;
    private int size;

    // constructor for size of DLL
    public DLL(){
        this.size = 0; // initial size is zero
    }

    // INSERT THE NODE AT THE BEGINING
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(head != null){ // MANDATORY COND. in DLL bcz the head.prev will only point to the node, if and only if, while inserting the newNode the DLL is not empty.. (If it is empty then it clearly indicates that head is pointng to null (before inserting new node)). That is why it would be of no use of this stamnt: "head.prev=node" bcz in this case (head.prev == null.prev --> NONENSENSE)
            head.prev = node;
        }
        head = node; // head will now point to the new node
        node.prev = null;
    }

    // INSERT AT THE END
    public void insertEnd(int val){
        Node new_node = new Node(val);
        // Assume if you are starting from head and reasigning that head as a temporary_tail to move forward AND GUESS WHAT? > that head is only NULL.. So now in this case, it means that the DLL is EMPTY. So you will simply point that head ref to the new_node
        if(head == null){
            head = new_node;
        }
        Node temp_tail = head;

        while(temp_tail.next != null){
            temp_tail = temp_tail.next;
        }
        temp_tail.next = new_node;
        new_node.prev = temp_tail;
        new_node.next = null;


    }
    // Find the Value and return that Node, after which you wnat to insert tyour newly created NODE
    public Node findBefore(int val){
        Node befr_node = head;
        while(befr_node != null){
            if(befr_node.value == val){
                return befr_node;
            }
            befr_node = befr_node.next;
        }
        return null; // in case the node with the value that is to found out, is absent

    }

    // INSERT NODE AFTER A PARTICULAR NODE_VALUE - Challenging...smwhat
    public void insert(int after ,int val){
        // Call the funcion that has found out the node with a value that you want before the new node you want to insert
        Node pr = findBefore(after);

        if(pr == null) { // what if the node is not present only.. then what will you do.. obviously above execution is like a waste.. so better give a base cond.
            System.out.println("Node not found");
            return;
        }
        Node new_node = new Node(val);
        new_node.next = pr.next;
        pr.next = new_node;
        if(new_node.next != null){
            new_node.next.prev = new_node; // new_node may be the last node of DLL (you never know).. so, check required bcz if it is null then there is no meaning of applying previous.
        }
        new_node.prev = pr;
    }


    // DISPLAY THE DLL
    public void display(){
        Node temp_node = head;
        while(temp_node != null){ // if youre running this loop without actually inserting the nodes in LL, so obivious by fault temp_node would be NULL logically

            System.out.print(temp_node.value + " -> ");
            tail = temp_node; // After every iteration, tail will be pointing to the node that would be entering the linkedlist.. so obviously if there is a last value that gets entered, tail pointer will stop there(as tail indicates  the last node)     //***// this defining is imp bcz then only you can create a temp pointer in place of this tail in further task where we need to print ll in reverse to show that its DLL
            temp_node = temp_node.next;
        }
        System.out.println("END");
        System.out.println("Display List in Reverse order"); // Bcz we need to show that thi is the DLL bro
        // now we are goin to print in reverse order
        // make use of tail now : (tail is not null), untill then, print the previous nodes..
        Node last = tail;  //***//
        while(last != null){ // bcz at some point last (tail) will also bcm null at the either side reverse side AS DLL HAS NULL AT BOTH ENDS OF THE LL.. so for that this cond is imp
            System.out.print(last.value+ " -> ");
            last = last.prev;
        }
        System.out.print("START");



    }



    // Node Class
    private class Node{
        int value;
        Node next;
        Node prev;

        // Param constructor 1
        private Node(int val){
            this.value = val;
        }
        // Param constructor 2
        private Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }


    }

}
