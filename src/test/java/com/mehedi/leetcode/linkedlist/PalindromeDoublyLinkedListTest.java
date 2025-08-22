package com.mehedi.leetcode.linkedlist;

import com.mehedi.dsa.leetcode.linkedlist.doubly.PalindromeDoublyLinkedListSolution;
import com.mehedi.dsa.leetcode.linkedlist.doubly.ReverseDoublyLinkedListSolution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeDoublyLinkedListTest {
    PalindromeDoublyLinkedListSolution myList;

    @Test
    @DisplayName("Single-Node")
    void testPalindromeSingleNode() {
        myList = new PalindromeDoublyLinkedListSolution(10);
        assertTrue(myList.isPalindrome());
    }

    @Test
    @DisplayName("Two nodes (palindrome)")
    void testPalindromeTwoNodes() {
        myList = new PalindromeDoublyLinkedListSolution(5);
        myList.append(5);
        assertTrue(myList.isPalindrome());
    }

    @Test
    @DisplayName("Two nodes (Non-palindrome)")
    void testNonPalindromeTwoNodes() {
        myList = new PalindromeDoublyLinkedListSolution(5);
        myList.append(7);
        assertFalse(myList.isPalindrome());
    }

    @Test
    @DisplayName("Odd-length palindrome")
    void testPalindromeOddLength() {
        myList = new PalindromeDoublyLinkedListSolution(1);
        myList.append(2);
        myList.append(3);
        myList.append(2);
        myList.append(1);

        assertTrue(myList.isPalindrome());
    }

    @Test
    @DisplayName("Even-length palindrome")
    void testPalindromeEvenLength() {
        myList = new PalindromeDoublyLinkedListSolution(1);
        myList.append(2);
        myList.append(2);
        myList.append(1);

        assertTrue(myList.isPalindrome());
    }

    @Test
    @DisplayName("Odd-Length Non-Palindrome")
    void testNonPalindromeOddLength() {
        myList = new PalindromeDoublyLinkedListSolution(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(1);

        assertFalse(myList.isPalindrome());
    }

    @Test
    @DisplayName("Even-length non-palindrome")
    void testEvenLengthNonPalindrome() {
        myList = new PalindromeDoublyLinkedListSolution(1);
        myList.append(2);
        myList.append(3);
        myList.append(1);
        assertFalse(myList.isPalindrome());
    }
}
