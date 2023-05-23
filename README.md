# Kth-Largest-Element-Of-Stream-Algorithm
This is a Java implementation of the "Kth Largest Element in a Stream" algorithm . The problem involves designing a class that can efficiently find the Kth largest element in a stream of integers
## Problem Statement
Given a stream of integers and an integer K, design a class that can find the Kth largest element in the stream efficiently.
Approach
To solve this problem, we can use a priority queue (min heap) to keep track of the K largest elements in the stream. The heap will always maintain the K largest elements at the top, with the smallest element as the root.
- In the constructor of the KthLargest class, initialize a priority queue (heap) and add all the elements from the nums array to it.
- While the size of the heap is greater than K, remove the smallest element from the heap using heap.poll(). This ensures that the heap always contains the K largest elements.
- The add method allows adding new elements to the stream and returns the Kth largest element after the addition.

- Compare the given value val with the smallest element (heap.peek()) in the priority queue.
- If val is smaller, it means the Kth largest element remains the same, so return the current Kth largest element.
- Otherwise, add val to the priority queue using heap.add(val).
- Remove the smallest element (heap.poll()) from the priority queue.
- Return the new smallest element (Kth largest) using heap.peek().
## Complexity Analysis
The time complexity of the add operation is O(log K), where K is the number of elements in the priority queue. This is because adding an element and maintaining the heap property takes O(log K) time.

The space complexity of the KthLargest class is O(K), as we only need to store the K largest elements in the priority queue.
## Usage
- Create an instance of the KthLargest class, providing the value of k and an initial array of integers, nums.
- Use the add method to add new elements to the stream and retrieve the Kth largest element.
``` java
KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

int kthLargest1 = kthLargest.add(3);  // Returns 4
int kthLargest2 = kthLargest.add(5);  // Returns 5
int kthLargest3 = kthLargest.add(10); // Returns 5
int kthLargest4 = kthLargest.add(9);  // Returns 8
int kthLargest5 = kthLargest.add(4);  // Returns 8
```
