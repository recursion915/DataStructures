Name: Chen Zhang
Partner: Myself
Assignment: CSC172_lab06
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
MyNode class is from previous lab.
Stack is defined in the lab description.
In MyNode, first implements Stack.
A constructor is used for setting the top node to null and size to 0.
isEmpty return whether size is 0.(I added the size by myself, it’s not required, but useful for keep track of size of stack.
push() method creates a temp node to hold data.Since it is inserted in front. Temp.next points to top; the make the temp to the new top. Size increases.
pop(): checking whether the stack is empty first. Then create an instance to hold the top.data. The make top point to the top.next. Size decreases.
peek():same thing but do not delete.


Files Hand in: MyNode.java
	       MyStack.java
	       Stack.java
	       Lab06Test.java
	       Output.txt
	       ReadMe.txt