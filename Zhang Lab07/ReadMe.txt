Name: Chen Zhang
Partner: Myself
Assignment: CSC172_lab07
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
MyDoubleNode class is from previous lab.
Queue is defined in the lab description.
In MyQueue, first implements Queue.
A constructor is same in lab03.
isEmpty return whether size is 0.(I added the size by myself, it’s not required, but useful for keep track of size of queue.)
enqueue() method creates a temp node to hold data.Since it is inserted in the end. Temp.next points to tail;temp.prev points to tail.prev. Then make the temp.next.prev point back to temp and temp.prev.next point back to the temp. Size increases.
dequeue(): checking whether the stack is empty first. Then create an instance to hold the top.data. The make head point to the head.next. Size decreases.
peek():same thing but do not delete.

//in the comments, I used single node to create MyQueue which works just fine.
This can save the memory.


Files Hand in: MyDoubleNode.java
	       MyQueue.java
	       Queue.java
	       Lab07Test.java
	       Output.txt
	       ReadMe.txt