CSC 172 Project 1
Name: Chen Zhang
Email:czhang29@ur.rochester.edu
Due:Oct.7th,2015

Description:
<MasterMind.java>
The key of master mind algorithm is easy: just remove the code that would not give the
same response if the guess were the answer.(Reference: Prof.Ted lecture times)
First, in my generator method: I used a LinkedList to hold all the possible combinatorics.
This could be done in a recursion.
In the coloredpegs() method, it returns how many colors by comparing the guess array and
each array in the linkedlist. The algorithm here is using a for loop to compare each
element in same position.
In the whitepegs()method, it returns correct items at different positions. I created
two ArrayList for my guess array and each array in the LinkedList. A nested for loop
is used to compared the white pegs. The reason why I use arrayList is to safely remove
elements in arrayList. Otherwise, I am counting repetitive items in the arrayList.
Last, white pegs items should minus the colored pegs to get the final white peg number.
In the response()method: this method takes two parameters in from user. One is coloredpegs
one is whitepegs. If the response is different from the guess code, remove the code in
the LinkedList.
In nextMove()method: Basically it provides a next char array in the updated linklist
from response.
In the constructor(): it takes an char[]array of user's choice and positions. Pass those
two into generator methods to generate a LinkedList with all the combinatorics.

<project1test.java>
This is the main method. A count variable and a total variable is to keep track of how 
many guesses the pc guessed and how many total possibilities in the combinatorics.
A while loop is used for keep generating Response() and nextMove() until colored pegs
equals to positions.
Certain greetings are implemented in the main method too.

Files handed in:
MasterMind.java
project1test.java
ReadMe.txt(Recursion)
SampleOutPut.txt

