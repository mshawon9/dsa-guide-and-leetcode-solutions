package com.mehedi.dsa.datastructures.linkedlist;

// Nested class for the nodes of the doubly linked list.
public class Node {
    // Declare integer value of the node.
    int value;
    // Declare reference to the next node.
    Node next;
    // Declare reference to the previous node.
    Node prev;

    // Constructor to create a new node with a given value.
    Node(int value) {
        this.value = value;
    }
}