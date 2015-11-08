import java.util.*;


public class MyStack <AnyType> implements Stack <AnyType>{
	
	protected MyNode<AnyType> top = new MyNode<AnyType>();
	protected int size;
	
	public MyStack()
	{
		top=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	//not required but checking the size
	public int size()
	{
		return size;
	}
	public void push(AnyType x)
	{
		MyNode <AnyType> temp=new MyNode<AnyType>();
		temp.data=x;
		temp.next=top;
		top=temp;
		size++;
	}
	//dont forget to catch exception
	public AnyType pop() throws EmptyStackException
	{
		if(isEmpty())
			throw new EmptyStackException(); 
		else{
		AnyType tempData;
		tempData=top.data;
		top=top.next;
		size--;
		return tempData;
		}
	}
	public AnyType peek() throws EmptyStackException
	{
		if(isEmpty())
			throw new EmptyStackException();
		else{
			return top.data;
		}
	}
	
	
	
}




