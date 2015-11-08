import java.math.*;

public class Lab04 {
	
	//session 1
	public static BigInteger CountAssign(int items, int values)
	{
		BigInteger ans=new BigInteger("1");
		BigInteger val=new BigInteger(Integer.toString(values));
		for(int i=0;i<items;i++)
		{
			ans=ans.multiply(val);
		}
		return ans;
	}
	//session 2 recursion method
	public static long Factorial(int n)
	{
		long ans=1;
		if(n<=1){
			return 1; }
		else{
			ans=Factorial(n-1)*n; }
		return ans;
		
	}
	//session 3 implements 
	public static long AMethod(int n, int m)
	{
		long ans=1;
		//int i=n;
		for(int i=n-m+1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	//session 4
	public static long CMethod(int n, int m)
	{
		long ans=1;
		//int i=n;
		for(int i=n-m+1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans=ans/Factorial(m);
	}
	public static void main(String[]args)
	{
		//Test No.1
		System.out.println("How many ways can we paint three houses in any of four colors?");
		System.out.println("the answer is "+CountAssign(3,4));
		System.out.println("Suppose a computer password consists of eight to ten letters and/or digits. How many different passwords are there? Remember that an upper-case letter is different from a lowercase one.");
		//three options: 8;9;10 long combination and each option should have 26*2+10=62 possiblities
		//26 letters lower case/uppercase and 10 digits
		System.out.println("the answer is "+CountAssign(8,62)+CountAssign(9,62)+CountAssign(10,62));
		//Test No.2
		System.out.println("If we have 9 players for a baseball team, how many possible batting orders are there? ");
		System.out.println("the answer is "+Factorial(9));
		//Test No.3
		System.out.println("In a class of 200 students, we wish to elect a President, Vice President, Secretary and Treasurer. In haw many ways can these four officers be selected?");
		System.out.println("the answer is "+AMethod(200,4));
		System.out.println("How many ways are there to form a sequence of m letters out of the 26 letters, if no letter isallowed to appera more than once for (a) m=3, (b) m=5");
		System.out.println("the answer for m=3 is "+AMethod(26,3)+" the answer for m=4 is "+AMethod(26,4));
		//Test No.4
		System.out.println("In poker, each player is dealt five cards from a 52 card deck. How many different possiblitisare there? ");
		System.out.println("the answer is "+CMethod(52,5));
	}
}

