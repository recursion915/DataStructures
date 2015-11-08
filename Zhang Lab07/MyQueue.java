
public class MyQueue<AnyType> implements Queue<AnyType>{
	protected MyDoubleNode <AnyType> head=new MyDoubleNode<AnyType>();
	protected MyDoubleNode <AnyType> tail=new MyDoubleNode<AnyType>();
	protected int size;
	
	public MyQueue()
	{
		head.next=tail;
		head.prev=null;
		tail.prev=head;
		tail.next=null;
		size=0;
	}
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enqueue(AnyType x)
	{
		MyDoubleNode temp= new MyDoubleNode();
		temp.data=x;
		
		temp.next=tail;
		temp.prev=tail.prev;
		temp.next.prev=temp;
		temp.prev.next=temp;
		size++;
	}
	public AnyType dequeue() {
		if(isEmpty())
		{
			System.out.println("Empty queue");
			return null;
		}
		else{
			AnyType tempData=head.next.data;
			head=head.next;
			size--;
			return tempData;
		}
	}
	public AnyType peek() {
		if(isEmpty())
		{
			System.out.println("Empty queue");
			return null;
		}
		else{
		return head.next.data;
		}
	}
}




/*
 * The following is using single node implementation
 * requires smaller memory;more efficient 
 
public class MyQueue<AnyType> {
	
	protected MyNode<AnyType>head;
	protected MyNode<AnyType>tail;
	protected int size;
	
	public MyQueue()
	{
		head=null;
		tail=null;
		size=0;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	
	//insert at the end
	public void enqueque(AnyType element)
	{
		MyNode<AnyType>temp=new MyNode<AnyType>();
		temp.data=element;
		temp.next=null;
		//insert first element in the queue
		if(size==0)
		{
			head=temp;
			tail=temp;
		}
		else{
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	
	//delete in the front
	
	public AnyType dequeue(){
		AnyType tempData=head.data;
		head=head.next;
		size--;
		return tempData;
	}
	

}
*/