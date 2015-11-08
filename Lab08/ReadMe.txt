Name: Chen Zhang
Partner: Myself
Assignment: CSC172_lab06
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du
Compile at Mac Terminal
<gcc lab08.c>

Note: I wrote all the codes by myself. So I don’t have a partner. In that case, I only
add”Hello, “ in front of my name.

Description:
1. First method is straightforward, a for loop was applied to print all the command line arguments.
2. int mystrcmp() method: a for loop to go through two strings. If they are the same,
return 0; otherwise return *s-*t.
3. void mystrcat() method: while *dest is not empty, pointer points to the next memory.
Once it reaches null, copy the *source to *dest.
4. void mystrcpy(): similar to the No.3, just copy the *source to the *dest.
5. If mystrcmp(“Chen”, argv[i]) returns 0, I applied mystrcpy and mystrcat() to argv[i].
Otherwise, just print the argument. 
6. A for loop is applied to assign the value of a[i]. Then (a+i) points to the memory, and using * to access the values of that memory.

 
Files Hand in: 
	       lab08.c
	       Output.txt
	       ReadMe.txt