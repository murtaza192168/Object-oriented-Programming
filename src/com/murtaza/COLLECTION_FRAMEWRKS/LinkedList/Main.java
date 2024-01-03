package com.murtaza.COLLECTION_FRAMEWRKS.LinkedList;

public class Main {

    public static void main(String[] args) {

        //SINGLY LL OPERATIONS
//        LL list = new LL();
//         list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(7);
//        list.insertAtEnd(5); //7->5->4->3->5->NULL
//        list.insertAtIndex(12, 2);
//        list.display();
//        System.out.println();
//        //delete first node ele
//        System.out.println(list.deleteFirst());
//        list.display();
//        //delete last node ele
//        System.out.println();
//        System.out.println(list.deleteEnd());
//        list.display();
//
//        // DELETE FROM SPECIFIED INDEX
//        System.out.println();
//        System.out.println(list.deleteAtIndex(2));
//        list.display();
//
//        System.out.println();
//        // INSERT FROM THE END
//        list.insertAtEnd(3);
//        list.insertAtEnd(4);
//        list.insertAtEnd(5);
//        list.insertAtEnd(7);
//        list.display();

        //DOUBLY LL OPERATIONS

//        DLL dlist = new DLL();
//         dlist.insertFirst(10);
//        dlist.insertFirst(12);
//        dlist.insertFirst(14);
//        dlist.insertFirst(16);
//
//        dlist.insertEnd(55);
//
//        // Insert after a mentioned node
//        dlist.insert(12,10);
//
//        dlist.display(); // 16 -> 14 -> 12 -> 10 -> END
//                         // 10 -> 12 -> 14 -> 16 -> START

        // CIRCULAR LL //

        CLL clist = new CLL();
        clist.insertAtEnd(4);
        clist.insertAtEnd(6);
        clist.insertAtEnd(10);
        clist.insertAtEnd(14);
        clist.insertAtEnd(11);
        clist.display(); // 4 -> 6 -> 10 -> 14 -> 11 -> HEAD
    }
}
