Name: Chen Zhang
Partner: Myself
Assignment: CSC172_lab05
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
First, define a recursion method in factorial. Same in Lab04.

//Session 1
The calculation is easy for the equation.
But the problem is how to analyze the duplicates in String”little”.
I created an ArrayList for character and an ArrayList for integer.
Convert the string to character and put into the ArrayList.
A nested for loop is to compare whether the character has duplicates.
If it has duplicates, use <int count> to contain how many times it duplicates.
Be sure to delete the duplicates. Otherwise, you will count two times for ’t’.
The integer array list is used to contain <int count>.
To sum up, the arrayList.size() has total number of duplicates.
And each element in arrayList stands for how many duplicates for each character.
E.X: In “little” string, the array should have two elements(l, and t).
One is 2, another is 2.(l and t duplicates twice)

If you print the Integer ArrayList, it will give you[2,2].


//Session 2
Applying recursion method to this one. The method take two parameters, one is indistinguishable items, the other one is bins.

//Session 3
Same thing as Session 2, just apply more recursion methods.

Files Hand in: Lab05.java
	       Output.txt
	       ReadMe.txt