/*Chen Zhang
 * CSC 172 HW01
 * Lab Session: Tu/Th 12:30-1:45 p.m
 * 
 */
public class Lab01 {
	
	/* Section01
	public static void printarray(Object[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	*/
	/* Section02 Overriding four methods
	public static void printarray(Integer[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	public static void printarray(Double[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	public static void printarray(Character[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	public static void printarray(String[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	*/
	//section 3 generics print method
	public static <T> void printarray(T[]anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}	
	}
	/*
	//@SuppressWarnings({ "rawtypes", "unchecked" })
	//@SuppressWarnings("rawtypes")
	
	//@SuppressWarnings("unchecked")
	//Note: CSC172Lab01.java uses unchecked or unsafe operations.
	//Note: Recompile with -Xlint:unchecked for details.
	//Chens-MacBook-Pro:desktop Titan$ java CSC172Lab01
	 * 
	
	public static Comparable getMax(Comparable [] anArray){
		
		@SuppressWarnings("rawtypes")
		Comparable tempmax=anArray[0];
		for(int i=1;i<anArray.length;i++)
		{
			if(tempmax.compareTo(anArray[i])<0)
				{
				tempmax=anArray[i];
				}
		}
		return tempmax;
		
	}
	 */


	//section 5
	public static<T extends Comparable<? super T>> T getMax(T[]anArray){
		T tempmax=anArray[0];
		for(int i=1; i<anArray.length; i++)
		{
			if(tempmax.compareTo(anArray[i])<0)
			{
			tempmax=anArray[i];
			}
	}
	return tempmax;
	}

	
	public static void main(String[]args){
		
		Integer [] intArry = {1, 2, 3, 4, 5 };
		Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H','E','L', 'L', 'O' };
		String [] strArray = {"once","upon","a","time" };
		printarray(intArry);
		printarray(doubArry);
		printarray(charArray);
		printarray(strArray);
		
		System.out.println("max Integer is: " + getMax(intArry));
		System.out.println("max Double is: " + getMax(doubArry));
		System.out.println("max Character is: " + getMax(charArray));
		System.out.println("max String is: " + getMax(strArray));
	}

}
