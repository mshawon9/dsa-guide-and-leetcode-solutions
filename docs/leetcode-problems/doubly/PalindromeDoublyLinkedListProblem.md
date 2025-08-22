# Palindrome Doubly Linked List

## Problem
Write a method to determine whether a given doubly linked list reads the same forwards and backwards.

For example, if the list contains the values `[1, 2, 3, 2, 1]`, then the method should return true, since the list is a palindrome.

If the list contains the values `[1, 2, 3, 4, 5]`, then the method should return false, since the list is not a palindrome.

**Method name:** isPalindrome

**Return Type:** boolean

---

### My Approach
1. If the length of the list is less than or equal to 1, then the list is a palindrome by definition, so the method returns True.
2. The method initializes two pointers, `forwardNode` and `backwardNode`, that point to the head and tail of the list, respectively. The method then iterates over half of the list, comparing the values of the nodes at each end of the list to see if they are the same.
3. If the values of the nodes do not match, the method returns `false`, indicating that the list is not a palindrome. If all of the values match, the method returns `true`, indicating that the list is a palindrome.



---

### Complexity
- **Time Complexity:** O(n) (one pass to find middle + one pass to reverse + one pass to compare).
- **Space Complexity:** O(1) (in-place reversal).

---

### Java Code
See: [PalindromeDoublyLinkedListSolution.java](../../../src/main/java/com/mehedi/dsa/leetcode/linkedlist/doubly/PalindromeDoublyLinkedListSolution.java)
### Test Case
See: [PalindromeDoublyLinkedListTest.java](../../../src/test/java/com/mehedi/leetcode/linkedlist/PalindromeDoublyLinkedListTest.java)