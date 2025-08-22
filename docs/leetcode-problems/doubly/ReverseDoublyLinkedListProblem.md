# Reverse Doubly Linked List

## Problem
Implement a method called `reverse()` that reverses the order of the nodes in the list.

This method should reverse the order of the nodes in the list **by manipulating the pointers of each node**, not by swapping the values within the nodes.

### Method Signature
```java
public void reverse();
```
Output
- No explicit output is returned. However, the method should modify the doubly linked list such that the order of the nodes is reversed.

Constraints
- The doubly linked list may be empty or have one or more nodes.

Example
```text
Before reverse():

Head: 1
Tail: 5
Length: 5

1 <-> 2 <-> 3 <-> 4 <-> 5

After reverse():

Head: 5
Tail: 1
Length: 5

5 <-> 4 <-> 3 <-> 2 <-> 1
```




## Solution Explanation
The reverse() method in the DoublyLinkedList class is designed to reverse the order of the nodes in a doubly linked list.

Step-by-Step Approach:
1. Initialization 
   - `Node current = head;`: It starts by creating a **`Node`** reference named `current` and initializes it to the **`head`** of the list. This will be used to traverse the list.
2. Swapping next and prev for each Node
   - The method enters a while loop `while (current != null) `
   that continues as long as `current` is not null, 
   meaning it goes through the list 
   until it reaches the end.
   - Inside the loop:
     - `temp = current.prev;`: It temporarily stores the previous node 
     of `current` in `temp`. This is necessary because the next step 
     will overwrite `current.prev`.
     - `current.prev = current.next;`: The previous node reference of `current` is set to its next node, effectively starting the process of reversing the link.
     - `current.next = temp;`: The next node reference of `current` is set to the stored previous node (from `temp`), continuing the reversal of the link.
     - `current = current.prev;`: The current pointer is moved to the next node in the original list, which, after the swap, is the original previous node (`current.prev`).
3. Swapping head and tail:
   - After the loop, the nodes are reversed, but the `head` and `tail` references of the list are still pointing to their original positions.
   - `temp = head;`: The original head is stored in `temp`.
   - `head = tail;`: The `head` reference is updated to the original `tail`.
   - `tail = temp;`: The `tail` reference is updated to the original `head`.

## Complexity
Time: O(n) — Each node is visited once.

Space: O(1) — No extra space is required.

---

### Java Code
See: [ReverseDoublyLinkedListSolution.java](../../../src/main/java/com/mehedi/dsa/leetcode/linkedlist/doubly/ReverseDoublyLinkedListSolution.java)
### Test Case
See: [ReverseDoublyLinkedListTest.java](../../../src/test/java/com/mehedi/leetcode/linkedlist/ReverseDoublyLinkedListTest.java)