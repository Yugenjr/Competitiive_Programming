Accessing :  O(1)
Insert: O(1) / O(n)
Delete: (1) / O(n)
Traversal: O(n)
Searching:  Sorted: min--> O(log n)
            Non sorted: O(n)
Update: O(1)

benefits:

1. Fast access: Arrays provide constant-time access to elements using their index, making it efficient for retrieving data.
2. Memory efficiency: Arrays are stored in contiguous memory locations, which can lead to better cache performance and reduced memory overhead compared to other data structures.
3. Simplicity: Arrays have a straightforward structure and are easy to understand and use, making them a fundamental data structure in programming.

Drawbacks:
1. Fixed size: Once an array is created, its size cannot be changed. This can lead to wasted memory if the array is larger than needed or insufficient memory if the array is too small.
2. Insertion and deletion: Inserting or deleting elements in an array can be inefficient, especially if it requires shifting elements to maintain the order, resulting in O(n) time complexity.
3. Lack of built-in methods.

Arrays in Java do not have built-in methods for common operations like adding or removing elements, which can make them less convenient to use compared to other data structures like ArrayLists or LinkedLists.

