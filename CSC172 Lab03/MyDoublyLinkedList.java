
public class MyDoublyLinkedList <AnyType> implements DoublyLinkedList<AnyType> {
	
	private MyDoubleNode head=new MyDoubleNode();
	private MyDoubleNode tail= new MyDoubleNode();
	private int size;
	public MyDoublyLinkedList()
	{
		head.prev=null;
		head.next=tail;
		tail.next=null;
		tail.prev=head;
		size=0;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	//insert front;implements lookup method
	public void insert(AnyType x)
	{
		//MyDoubleNode =head;
		if(lookup(x)==false)
		{
			MyDoubleNode tempNode=new MyDoubleNode();
			tempNode.data=x;
			tempNode.prev=head;
			tempNode.next=head.next;
			tempNode.next.prev=tempNode;
			tempNode.prev.next=tempNode;
			size++;	
		}	
	}
//print the list in order
	public void printList()
	{
		MyDoubleNode currentNode =head.next;
		while(currentNode.next!=null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	//print the list in reverse order
	public void printListRev()
	{
		MyDoubleNode currentNode = tail.prev;
		while(currentNode.prev!=null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.prev;
		}
	}
	//lookup method
	
	public boolean lookup(AnyType x)
	{
		MyDoubleNode currentNode=head.next;
		while(currentNode.next!=null)
		{
			if(currentNode.data.equals(x))
				return true;
			currentNode=currentNode.next;
		}
		return false;
		
	}
	//if nothing found, dont do anything
	public void delete(AnyType x)
	{
		MyDoubleNode currentNode=head.next;
		while(currentNode.next!=null)
		{
			if(currentNode.data.equals(x))
			{
				currentNode.next.prev=currentNode.prev;
				currentNode.prev.next=currentNode.next;
				size--;
			}
			currentNode=currentNode.next;
		}
		
	}
	
	

}
