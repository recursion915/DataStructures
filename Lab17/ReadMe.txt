Name: Chen Zhang
Partner: Kakashi
Assignment: CSC172_lab17
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
1)HashFunction():
I made my own hash function, pretty straightforward.
2)Insert():the method breaks into two parts. First get hashcode of the insert item;
then try to insert the item in the index of hashcode. If the index of hashcode is occupied,go to next index until the end of the array. If still occupied, reset the index to zero and try to insert from 0. If is occupied, go to next index.
3)Loadfactor=unique items/hashtable.size().
4)If loadfactor is larger than 50%, remake the hashtable. And put the orignial hashtable items into new one. Then do the insert.
5)Apply buffered reader and input stream to convert line to words.


Files Hand in: LinearProbing.java
	       paragraph.txt
	       Output.txt
	       ReadMe.txt