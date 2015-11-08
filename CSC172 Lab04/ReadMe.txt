Name: Chen Zhang
Partner: StackOverFlow
Assignment: CSC172_lab04
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
//session 1
Since long primitive type work in all sessions, I just demonstrated how to use BigInteger object only
once in session1. BigInteger only takes string, so be sure to convert integer to String by using
Integer.toString()methods. After that, a for loop is used to calculate the answer. The general answer for
this is values^items.

//session 2
This is basically writing a factorial method. I wrote it recursively so that session 4 can apply it. The break case
should be n=0(since 0!=1), if n does not equal to 0, keep multiplying.

//session 3
I can write this by applying factorial method. Like n!/(n-m)! However, that will ask the complier to calculate two
times of factorial. I found it was not a good idea. Since n!/(n-m)!=n*(n-1)…(n-m+1). A for loop can easily solve this problem.

//session 4
Straightforward. Just apply the factorial three times.

Files Hand in: Lab04.java
	       Output.txt
	       ReadMe.txt