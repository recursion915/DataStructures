import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class InfixCalculator {

	ArrayList<String> mInfixString;
	static String[] abc;
	int lineCounts;
	//constructor
	public InfixCalculator()
	{
		mInfixString= new ArrayList<String>();
		lineCounts=0;
	}
	
	//convert txt.file to arrayList that contains each Line
	public void convertToList(String filename) throws IOException{
		
	String stringLine;
	FileInputStream fi = new FileInputStream(filename);
	BufferedReader br = new BufferedReader(new InputStreamReader(fi));
	while( (stringLine=br.readLine())!=null)  
	{
	  lineCounts++;
	  mInfixString.add(stringLine);
	}
	br.close();
	}
	//printing method debug purpose
	public static void printArrayList(ArrayList<?>abc){
		for(int i=0;i<abc.size();i++)
		{
			System.out.print(abc.get(i)+" ");
		}
	}
	
	//convert each line to an ArrayList with operands and operators
	//return ArrayList
	public ArrayList<String> SeparateLine(String infixString){
		
		ArrayList<String> infixList=new ArrayList<String>();
		/*
		StringTokenizer st= new StringTokenizer(infixString);
		while(st.hasMoreTokens()){
			infixList.add(st.nextToken());
		}*/
		//spilt first
		String[]result=infixString.split("(?<=[-+*/<>!()&=|^])|(?=[-+*/<>!()&=|^])");
		for(int i=0;i<result.length;i++){
			//get rid of space
			StringTokenizer st= new StringTokenizer(result[i]);
			while(st.hasMoreTokens()){
				infixList.add(st.nextToken());
			}	
		}
		return infixList;
	}
	//check a string is numeric
	public boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	 // Tell whether op1 has lower precedence than op2
	//hard coded
    // op1 and op2 are assumed to be operator characters (|,&,=,<,>,+,-,*,/,^,!())
  public boolean lowerPrecedence(String op1, String op2) {
	    
	      
	      switch (op1) {
	      	 //logic or; the lowest in this situation
	      	 case "|":
	      	 case "&":
                  //if the op2 does not equal to |, op1 is lower than op2
                 if(op2.equals("=")||op2.equals(">")||op2.equals("<")||op2.equals("+")||op2.equals("-")||op2.equals("*")||op2.equals("/")||op2.equals("^")||op2.equals("!"))
                      return true;
                  else
                      return false;
	      	
	      	 case "=":
	      	 case ">":
	      	 case "<":
                   if(op2.equals("+")||op2.equals("-")||op2.equals("*")||op2.equals("/")||op2.equals("^")||op2.equals("!"))
                      return true;
                  else
                      return false;
                     
	         case "+":
	         case "-":
                  if(op2.equals("*")||op2.equals("/")||op2.equals("^")||op2.equals("!"))
                      return true;
                  else
                      return false;

	         case "*":
	         case "/":
                  if(op2.equals("^")||op2.equals("!"))
                     return true;
                  else
                      return false;

	         case "^":
                  if(op2.equals("!"))
                  return true;
                  else
                      return false;
             
	         case "!":
                      return false;
	         default:  
	            return false;
	      }
	 
	   } 
	//shunting yard algorithm infix to postfix
	public  ArrayList<String> Yard(ArrayList<String> infixList){
		MyQueue<String> mQueue= new MyQueue<String>();
		MyStack<String> mStack= new MyStack<String>();
		ArrayList<String> postList=new ArrayList<String>();
		//define first operator
		String firstOperator="";
		for(int i=0;i<infixList.size();i++){
			//not an operand
			if(!isNumeric(infixList.get(i))){
				firstOperator=infixList.get(i);
				break;
			}
			
		}
		//define currentOperator and prevOperator
		String prevOperator=firstOperator;
		String currentOperator="";
		int countTAG=0;
		for(int i=0;i<infixList.size();i++){
			//is operand;enqueue
			if(isNumeric(infixList.get(i))){
				mQueue.enqueue(infixList.get(i));
			}
			//if the element is operator 
			else{
				
				currentOperator=infixList.get(i);
//				checking the precedence:whether currentOperator is lower than prevOperator
//				if not true; push to the stack
//				System.out.println("curr is"+ currentOperator +"and prev is"+prevOperator+"result is"+lowerPrecedence(currentOperator,prevOperator));
				if(currentOperator.equals("("))
				{
					countTAG++;
					//System.out.println(countTAG);
				}
				if(!lowerPrecedence(currentOperator,prevOperator)&&!currentOperator.equals(")")){
					mStack.push(currentOperator);
					prevOperator=currentOperator;
				}
				//if true; pop all the stacks and send to queues
				if(lowerPrecedence(currentOperator,prevOperator)&&!currentOperator.equals(")")){
					//while stack is not empty,enqueue
					while(!mStack.isEmpty()){
						mQueue.enqueue(mStack.pop());
					}
					mStack.push(currentOperator);
					prevOperator=currentOperator;
				}
				//if the operand is  )
				if(currentOperator.equals(")")){
//					while(!mStack.peek().equals("(")){
						while(countTAG>0){		
							//System.out.println(countTAG);
						if(mStack.peek().equals("("))
						{
						//	System.out.println("here");
							countTAG--;
							
						}
						mQueue.enqueue(mStack.pop());
					}
					prevOperator=currentOperator;
				}
				
			}
		}
		//now all elements in a queue
		while(!mStack.isEmpty()){
			mQueue.enqueue(mStack.pop());
		}
		//remove bracket and convert the queue to ArrayList
		while(!mQueue.isEmpty()){	
		postList.add(mQueue.dequeue());}
		for(int i=0;i<postList.size();i++)
		{	
			if(postList.get(i).equals("(")||postList.get(i).equals(")"))
				{
					postList.remove(i);
				}
		}
		//System.out.println(postList);
		return postList;
	}
	//postfix to result
	public double PostfixEvaluation(ArrayList<String> postList)
	{
		MyStack<Double> mStack=new MyStack <Double>();
		//MyQueue<String> mQueue=new MyQueue <String>();
		Double answer=0.00;
		Double temp1;
		Double temp2;
		//read the string until EOF
		for(int i=0;i<postList.size();i++)
		{
			//if the String is operand
			if(isNumeric(postList.get(i)))
					{
						mStack.push(Double.parseDouble(postList.get(i)));
					}
			//if the String is operator
			if(!isNumeric(postList.get(i)))
			{
				if(postList.get(i).equals("-"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					answer=temp2-temp1;
					mStack.push(answer);
				}
				if(postList.get(i).equals("+"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					answer=temp2+temp1;
					mStack.push(answer);
				}
				if(postList.get(i).equals("*"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					answer=temp2*temp1;
					mStack.push(answer);
				}
				if(postList.get(i).equals("/"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					answer=temp2/temp1;
					mStack.push(answer);
				}
				
				if(postList.get(i).equals("^"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					answer=Math.pow(temp2, temp1);
					mStack.push(answer);
				}
				if(postList.get(i).equals("<"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					if(temp2<temp1)
						answer=1.00;
					else answer=0.00;	
					mStack.push(answer);
				}
				if(postList.get(i).equals(">"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					if(temp2>temp1)
						answer=1.00;
					else answer=0.00;	
					mStack.push(answer);
				}
				if(postList.get(i).equals("="))
				{
					
					temp1=mStack.pop();
					temp2=mStack.pop();
					if(temp2.equals(temp1))
						answer=1.00;
					else answer=0.00;	
//					System.out.println(answer);
					mStack.push(answer);
				}
				if(postList.get(i).equals("&"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					if(temp2==0||temp1==0)
						answer=0.00;
					else answer=1.00;	
					mStack.push(answer);
				}
				if(postList.get(i).equals("|"))
				{
					temp1=mStack.pop();
					temp2=mStack.pop();
					if(temp2==0&&temp1==0)
						answer=0.00;
					else answer=1.00;	
					mStack.push(answer);
				}
				if(postList.get(i).equals("!"))
				{
					temp1=mStack.pop();
					//temp2=mStack.pop();
					if(temp1==0)
						answer=1.00;
					else answer=0.00;	
					mStack.push(answer);
				}
			}
		}
		return answer;
	}


}
