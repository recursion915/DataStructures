xName: Chen Zhang
Partner: Myself
Assignment: CSC172_lab09
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
First, define a struct Node with a value, and a next pointer.

insert(): basically what I did is just follow the pseudo code from instruction.
The main idea is if the Node is empty, define a new node with some memory(malloc).
And save the the integer value to temp.value and make the next pointer to null.
If the list is not empty, recursively call the insert method.

printList(): if the node is not empty, print the value. And recursively call the print method.

lookup(): if the node is not empty, compare the value with parameter until found one.
If traversing complete and no such item, return false.

delete(): Similar idea to lookup. Just make the pointer point to pointer.next to delete the item.




Files Hand in: Lab09.c
	       SampleOutput.txt
	       ReadMe.txt