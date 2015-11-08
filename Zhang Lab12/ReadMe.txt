Name: Chen Zhang
Partner: Kakashi
Assignment: CSC172_lab12
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du

NONTRIVIAL NOTE:
Array cannot be written in generics. So I change to comparable.

TRIVIAL NOTE: I hate this Lab12……………some implementation may look bad….but overall it should work
Better algorithm or design can be written if i have more time. NVM..even I have more time, I should spend on my other courses…


Description:
In interface, just implements those simple methods from instruction.
Three constructors are written by requirement. One is just set the array size 10.
One is taking size parameter, the last one is taking an array.
isEmpty() and size() is trivial.
insert() just set the size+1 index of array to the item; then implements bubbleUp.
BubbleUp is to compare the insert item with parent item, which is at index i/2, if parent is larger, swap.
bubbleDown is pain. First a minimum child should find,which is either at 2i or 2i+1.
Comparing the root item with the minimum child, if root item is larger, swap with the minim child.
Expand: check whether the size reaches the HeapArray size. If so,creating a new one with double size. Then bubbleUp.
printHeap: just  print the array from index 1 to size. IMPORTANT: my first item is in index 1, which I dont’ know why I do that. It’s so painful…………
Last heapify: basically what I did is just implement bubbleUp for the array.




Files Hand in: MyHeap.java
	       Heap.java
	       SampleOutput.txt
	       ReadMe.txt