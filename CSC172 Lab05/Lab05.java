import java.math.*;
import java.util.*;

public class Lab05 {
	//Factorial recursion method
	public static long Factorial(int n)
	{
		long ans=1;
		if(n<=1){
			return 1; }
		else{
			ans=Factorial(n-1)*n; }
		return ans;
		
	}
	
	//session 1 and holy crap on a cracker!
	public static long OrderIdenticalItems(String s1){
		
		/*
		 * Convert String to an ArrayList
		 */
		long answer;
		int length=s1.length();
		char[]CharArray=s1.toCharArray();
		Arrays.sort(CharArray);
		ArrayList CharList = new ArrayList();
		
		for(int index=0;index<CharArray.length;index++)
		{
			CharList.add(CharArray[index]);
		}
		//System.out.println(CharList);
		//establist an integer ArrayList to contain number of repeated letters
		ArrayList IntList = new ArrayList();
		int i=0;
		while(i<CharList.size())
		{
			int count=1;
			for(int j=i+1;j<CharList.size();j++)
			{	
				if(CharList.get(i).equals(CharList.get(j)))
				{
					count++;
					CharList.remove(j);
					j--;
				}
			}
			//only it duplicates more than once; put into the ArrayList
			if(count>1)
			{
				IntList.add(count);
			}
			i++;
		}
		//convert ArrayList back to integers
		long denominal=1;
		for(int k=0;k<IntList.size();k++)
		{
			denominal=denominal*Factorial((int)IntList.get(k));
		}
		return answer=Factorial(length)/denominal;
		
	}
	//session 2
	public static long IndisObj(int n, int m)
	{
		long ans=1;
		return ans=Factorial(n+m-1)/Factorial(n)/Factorial(m-1);
	}
	
	//session 3
	
	public static long DisObj(int apples, int pears , int bananas, int children){
		long ans=1;
		return ans=Factorial(apples+pears+bananas+children-1)/Factorial(children-1)/Factorial(apples)/Factorial(pears)/Factorial(bananas);
		
	}
	public static void main(String[]args)
	{
		//Session 1 Test
		System.out.println("error has "+OrderIdenticalItems("error")+" Ways");
		System.out.println("street has "+OrderIdenticalItems("street")+" Ways");
		System.out.println("allele has "+OrderIdenticalItems("allele")+" Ways");
		System.out.println("Mississippi has "+OrderIdenticalItems("mississippi")+" Ways");
		
		//Session 2 Test
		System.out.println("6 apples to 4 kids: "+IndisObj(6,4)+" Ways");
		System.out.println("4 apples to 6 kids: "+IndisObj(6,4)+" Ways");
		//Session 3 Test
		System.out.println("6 apples/3pears to 5 kids: "+DisObj(6,3,0,5)+" Ways");
		System.out.println("2 apples/5pears/6bananas to 3 kids: "+DisObj(2,5,6,3)+" Ways");
	}
	
}
