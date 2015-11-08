//import java.util.NoSuchElementException;

public class MySingleLinkedList<AnyType> implements SimpleLinkedList<AnyType>{
	
	private MyNode head;
	private int size;
	//constructor initializes a head reference and size of linkedlist
	public MySingleLinkedList()
	{
		head=null;
		size=0;
	}

	public boolean isEmpty(){
		return size==0;
		//or return head==null;
	}
	//runtime of insert should be O(1), which is constant
	public void insert(AnyType x) {
	   if (lookup(x)==false)
		{
			MyNode<AnyType> NewNode= new MyNode<AnyType>();
		    NewNode.data=x;
		    NewNode.next=head;
		    head=NewNode;	
		    size++;
		}
	}
	//runtime of printlist() should be O(n)
	public void printList(){
		MyNode<AnyType> currentNode=head;
		while(currentNode!=null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	public boolean lookup(AnyType x) {
		MyNode<AnyType> currentNode=head;
		while(currentNode!=null)
		{
			if(currentNode.data.equals(x))
				{return true;}
			currentNode=currentNode.next;
		}
		return false;
	}
	//this can delete any items
	public void delete(AnyType x) {
		MyNode<AnyType> prevNode=head;
		MyNode<AnyType> currentNode=head.next;
		//first condition; no items in the list
		if(head==null){
		System.out.println("Empty List");	
		}
		//
		else{
			//go through the list if the object was not found
			while(!prevNode.data.equals(x))
			{
				prevNode=currentNode;
				currentNode=currentNode.next;
			}
			//2nd condition: the object was found and it was the first item in the list
			if(prevNode==head)
			{
				head=head.next;
				size--;
			}
			//3rd condition: deleting the items in the middle
			else if(currentNode!=null)
			{
				prevNode.next=currentNode.next;
				size--;
			}
			//4th condition; no similar item
			else
			{
				System.out.println("item was not found in the list,the orignial list is:");
			}
		}
		
	}		
	
	
	
}
