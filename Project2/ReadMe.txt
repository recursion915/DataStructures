CSC 172 Project 2
Name: Chen Zhang
Email:czhang29@ur.rochester.edu
Due:Oct.24th,2015
Note:
I tested my code by using diff function. It works.(See SampleOutput.txt).
In my Project2Test, I commented out the test for a relatively complicate "1 -2    ^3.0          ^3-(4 +5) * 6 * 7" string. It also gave me correct answer.
The whole point of this is if my program failed longInfixTest for some reason, I still believe my inFix to postfix and postfix to evaluation work.

Description:
<InfixCalculator>
convertToList(): convert each lines from the file into every single String. Line counts keep track of how many lines in the file.
SeparateLine(): Applying Pattern function to separate each String; and this method return an ArrayList.
isNumeric(): check whether is a number. So I can implement it later for operand and operators.
LowerPrecednece(): hard coded style. Implements switch case to this method.
Yard(): this is method for shunting yard algorithm. From infix to postfix.First apply isNumeric() method to check whether the token is a operand. If it is, enqueue it.
The complicated one is operator. We need to keep track of open parenthesis in case of
multiple parenthesis.Then comparing current operator to previous operator. If current operator is not lower than previous one, push it to the stack. Once found the lower operator, push all the stack elements. Another case is if the operand is closed parenthesis, enqueue the stack elements until seeing the open parenthesis. Last, pop all the elements in the stack. Then use a for loop to get rid of all the parenthesis.
postfixEvaluation(): this implementation is relatively simple. If the token is operand,
parse it to tDouble and put it to the stack. If the token is operator, pop the two stack elements and doing mathematic functions on it. If it’s logical not(!), only pop one element.

<project2test.java>
This is the main method. Command line arguments are used to past in Input files and OutPut files. A for loop is used to output all the outcome.
Besides the file it generate, it will also print out the values in the command line for debug purpose.


Files handed in:
InfixCalculator.java
Project2Test.java
MyNode.java
MyQueue.java
MyStack.java
Queue.java
Stack.java
ReadMe.txt
SampleOutput.txt

