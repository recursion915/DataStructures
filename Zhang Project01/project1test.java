
public class project1test {
	public static void main (String[]args)
	{   
		int count=0;
		MasterMind.newGame();
		while(MasterMind.mColored!=MasterMind.mPostions){
		System.out.println("please enter how many colored pegs I got");
		MasterMind.mColored=MasterMind.sc.nextInt();
		System.out.println("please enter how many white pegs I got");
		MasterMind.mWhite=MasterMind.sc.nextInt();
		if(MasterMind.mColored==MasterMind.mPostions)
		{
			System.out.println("I got the answer after "+count+" times in total possible arragments of "+ (int)MasterMind.mTotal);
		}
		else{
			MasterMind.response(MasterMind.mColored,MasterMind.mWhite);
			MasterMind.nextMove();
		}
		count++;
		}	
		
		
	}
}
