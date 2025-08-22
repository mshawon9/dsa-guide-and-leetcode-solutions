package com.mehedi.leetcode.linkedlist;

import com.mehedi.dsa.leetcode.linkedlist.doubly.ReverseDoublyLinkedListSolution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseDoublyLinkedListTest {
    ReverseDoublyLinkedListSolution dll;

    @Test
    @DisplayName("Reverse an odd-length list")
    void testReverseAnOddLengthList() {
        dll = new ReverseDoublyLinkedListSolution(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.reverse();

        assertEquals("5 4 3 2 1", dll.toForwardString());
    }

    @Test
    @DisplayName("Reverse an even-length list")
    void testReverseAnEvenLengthList() {
        dll = new ReverseDoublyLinkedListSolution(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.reverse();

        assertEquals("4 3 2 1", dll.toForwardString());
    }

    @Test
    @DisplayName("Single-node list")
    void testReverseSingleNode() {
        dll = new ReverseDoublyLinkedListSolution(10);
        dll.reverse();
        assertEquals("10", dll.toForwardString());
    }

    @Test
    void testReverseEmptyList() {
        dll = new ReverseDoublyLinkedListSolution(1);
        dll.makeEmpty();

        dll.reverse();
        assertEquals("", dll.toForwardString());
    }
}
