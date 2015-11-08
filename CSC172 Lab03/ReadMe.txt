Name: Chen Zhang
Partner: I wish I had one
Assignment: CSC172_lab03
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
First, in MyDoubleNode.java defines two nodes which contain next and prev references. Also one data object was defined in this class.
DoubleLinkedList.java defined an interface.
In MyDoublyLinkedList, first initializing a head and tail nodes. In the constructor, making the head points to the tail, tail points to the head. And of course, size should be set to zero.
In MyDoubleLinkedList.java, it uses generics to implement the MyDoublyLinkedList interface.
isEmpty() method is similar to lab02, return whether the size is 0 or head is null.
In Insert()method, first making a new node(tempNode) that contains the data. Set the tempNode.prev points to the head. And tempNode.next points to the head.next. Then, set
tempNode.next.prev points to the tempNode. And set tempNode.prev.next points back to tempNode itself.
PrintList() is just print data until the node.next reaches null.
Similarly, the PrintListRev() prints the data until the node.prev reaches null.
Lookup() method has similar idea as PrintList but to return true/false value.

The last delete() method is easier than deleting in single linked list method. Once you find the node that has the data you want(currentNode), set the currentNode.next.prev point to currentNode.prev. And set the currentNode.prev.next point to currentNode.next.



Files Hand in: MyDoubleNode.java DoubleLinkedList.java MyDoubleLinkedList.java 	   lab02test.java
	       Output.txt
	       ReadMe.txt(Recursion)