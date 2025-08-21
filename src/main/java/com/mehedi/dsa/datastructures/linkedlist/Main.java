package com.mehedi.dsa.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.printAll();

        /* <============= append ===========> */
        myDLL.append(2);
        myDLL.append(3);
        myDLL.printAll();

        /* <============= remove last ===========> */
        // (3) Items - Returns 3 Node
        System.out.println(myDLL.removeLast().value);
        // (2) Item - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (1) Item - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeLast());
        myDLL.append(1);

        /* <============= prepend ===========> */

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDLL.printAll();

        myDLL.prepend(5);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDLL.printAll();

        /* <============= remove first ===========> */
        System.out.println("\n\nremoveFirst:");
        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst());
        System.out.println();

        /* <============= Get ===========> */
        myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("Get=====> ");
        System.out.println(myDLL.get(3).value);

        /* <============= set ===========> */

        System.out.println("DLL before set():");
        myDLL.printList();

        myDLL.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL.printList();

        /* <============= insert ===========> */

        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        myDLL.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL.printList();

        myDLL.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL.printList();

        /* <============= remove ===========> */

        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL.printList();
    }
}
