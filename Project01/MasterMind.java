/*
 * Chen Zhang;
 * MasterMind
 * Fall 2015 CSC172 Project1
 */

import java.util.*;

public class MasterMind {
	
	LinkedList<char[]> items= new LinkedList<char[]>();
	static Scanner sc = new Scanner(System.in);
	protected static int mColored=0;
	protected static int mWhite=0;
	protected static int mPostions=0,mColorLength=0;
	protected static char[] mUserColorSelection;
	protected static char[] mGuess;
	protected static LinkedList<char[]> mItems;
	protected static double mTotal=0;
	
	//generating all the elements store in LinkedList
	//Reference:http://stackoverflow.com/questions/2366074/code-for-variations-with-repetition-combinatorics
	public static LinkedList<char[]> generator(LinkedList<char[]>colors, char[] input, char[] item, int count){
		if(count<item.length){
			for(int i=0; i<input.length;i++)
			{
				item[count]=input[i];
				generator(colors,input,item,count+1);
			}
		}
		else{
				colors.add(item.clone());
			}
		return colors;
	}
	
	public MasterMind(char[]tokencolors, int positions){	
		char[]item=new char[positions];
		items=generator(items,tokencolors,item,0);
	}
	//return colored numbers by comparing two char array
		public static int coloredpegs(char[]guess, char[]temp){
			int Colored=0;
			//get the damn colored pegs
			for(int j=0;j<temp.length;j++)
			{
				if(guess[j]==temp[j])
				{
					Colored++;
				}
			}
			return Colored;
		}
		public static int whitepegs(char[]guess, char[] temp){
			int colored=coloredpegs(guess,temp);
			int white=0;
			ArrayList newguess= new ArrayList();
			ArrayList newtemp= new ArrayList();
			for(int i=0; i<guess.length;i++)
			{
				newguess.add(guess[i]);
			}
			for(int i=0; i<guess.length;i++)
			{
				newtemp.add(temp[i]);
			}
			for(int k=0;k<newguess.size();k++){
				
				for(int l=0;l<newtemp.size();l++)
				{
					if(newguess.get(k)==newtemp.get(l))
					{
						white++;
						
						newtemp.remove(l);
						break;
					}
				}
			
			}
			return white=white-colored;
		}
	
	//upgrade linkedlist
	public static LinkedList<char[]> updating(char[]guess,LinkedList<char[]> wholelist,int usercolored,int userwhite)
	{
		for(int i=0;i<wholelist.size();i++)
		{
			char[]temp=new char[guess.length];
			temp=wholelist.get(i);
			int colorint=coloredpegs(temp,guess);
			int whiteint=whitepegs(temp,guess);
			//DEBUG purpose to print all the elements in the array list and colored pegs and white pegs
			//System.out.println(wholelist.get(i));
			//System.out.println("color is "+ colorint+ "white is "+whiteint);
			
			if((usercolored!=colorint)||(userwhite!=whiteint))
			{
				wholelist.remove(i);
			}
		
		}
		return wholelist;
	}
	//create a new game asks user input for color selection, positions also generate the first guess
	public static void newGame(){
		System.out.println("Welcome to a boring game: Mastermind");
		System.out.println("Please enter your the number of postions you want to play: integer only");
		mPostions=sc.nextInt();
		System.out.println("Enter your color selection, to save time, please enter firstLetter only:(\"RGB\" for RED,GREEN,BLUE)");
		String tempstring=sc.next();
		char[]mUserColorSelection=tempstring.toCharArray();
		MasterMind b = new MasterMind(mUserColorSelection,mPostions);
		mItems=b.items;
		mTotal=mItems.size();
		/* DEBUG purpose to print all the elements in the array list
		for(int i=0; i<mItems.size();i++)
		{
			System.out.println(mItems.get(i));
		}
		System.out.println(mItems.size());
		*/
		mGuess=mItems.get(0);
		System.out.println("my guess is ");
		for(int i=0;i<mGuess.length;i++)
		{System.out.print(mGuess[i]);}
		System.out.println();
		
	}
	//
	public static void response(int coloredpegs, int whitepegs)
	{

		for(int i=0;i<mItems.size();i++)
		{
			char[]temp=new char[mGuess.length];
			temp=mItems.get(i);
			int colorint=coloredpegs(temp,mGuess);
			int whiteint=whitepegs(temp,mGuess);
			//DEBUG purpose to print all the elements in the array list and colored pegs and white pegs
			//System.out.println(wholelist.get(i));
			//System.out.println("color is "+ colorint+ "white is "+whiteint);
			
			if((coloredpegs!=colorint)||(whitepegs!=whiteint))
			{
				mItems.remove(i);
			}
		
		}
		//mItems=updating(mGuess,mItems,coloredpegs,whitepegs);
		
	}
	public static char[] nextMove(){
		/* DEBUG purpose to print all the elements in the array list
		for(int i=0; i<mItems.size();i++)
		{
			System.out.println(mItems.get(i));
		}
		System.out.println(mItems.size());
		*/
		mGuess=mItems.get(0);
		System.out.println("my guess is ");
				for(int i=0;i<mGuess.length;i++)
				{System.out.print(mGuess[i]);}
				System.out.println();
		return mGuess;
		
	}
	
}
