Name: Chen Zhang
Partner: I wish I had one
Assignment: CSC172_lab02
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
First, in MyNode.java defines a node has one data and one node.
SimpleLinkedList.java defined an interface.
In MySingleLinkedList, first define a head and size. The size can help us keep track
of the list size. Use constructor to initialize the head=null, and size=0.
isEmpty() method is easy, return whether the size is 0 or head is null.
Insert()method is also straightforward, making a new node that contains the data.
And make new node points to the older head reference. Then the head points to the new node. 
PrintList() is just print data until the node.
Lookup() method has similar idea as PrintList but to return true/false value.
The last delete() method is pretty tricky since deleting the first item is so different
from deleting times in the middle.
A while loop was used to go through the list until the object was found.
If the data was found and the data was in the fist item, make the head point to head.next.
If the data was in not the first item in the list, make previous.next point to current.next. Besides, I have two if statements to check whether it’s an empty list and 
no item was found.



Files Hand in: MyNode.java SimpleLinkedList.java MySingleLinkedList.java lab02test.java
	       Output.txt
	       ReadMe.txt(Recursion)