	//T[] HeapArray=new T[];
	//generics doens't work for Array
	//use Comparable instead
public class MyHeap <T extends Comparable<T>> implements Heap<T>{

	protected Comparable [] heapArray;
	protected int size;
	//constructor
	public MyHeap()
	{
		heapArray= new Comparable[10];
		size=0;
	}
	//override constructor
	public MyHeap(int n)
	{
		heapArray= new Comparable[n+1];
		size=0;
	}
	//override constructor
	public MyHeap(Comparable[]abc)
	{
		size=0;
		heapArray=new Comparable[abc.length+1];
		for(int i=0;i<abc.length;i++)
		{
			heapArray[i+1]=abc[i];
			//System.out.println(i);
			size++;
		}
		heapify(heapArray);
	}
	public boolean isEmpty() {
		
		return size==0;
	}

	@Override
	public int size() {
		
		return size;
	}
	public void expand(Comparable[]a)
	{
		Comparable[] largerHeap=new Comparable[heapArray.length];
		for(int i=1;i<heapArray.length;i++)
		{
			largerHeap[i]=heapArray[i];
		}
		heapArray=new Comparable[size*2];
		for(int i=1;i<size+1;i++)
			{
				heapArray[i]=largerHeap[i];
			}
	}
	@Override
	public void insert(Comparable item) {
		//deal with Heap overflow
		if(this.size>=(heapArray.length-1))
		{
			expand(heapArray);

		}
		heapArray[size+1]=item;
		size++;
		bubbleUp (heapArray);
}
	private void bubbleUp(Comparable[]theArray)
	{
		Comparable temp;
		int i=this.size;
		//System.out.println(i);
		while(i/2!=0)
		{
			//swap
			if((theArray[i]).compareTo(theArray[i/2])<0)
			{
				//System.out.println(i);
				temp=theArray[i];
				theArray[i]=theArray[i/2];
				theArray[i/2]=temp;
				
				i=i/2;
			}
			else{
				break;
				
			}
		}
		
	}

	public void printHeap()
	{
		//dont want to print null items
		for(int i=1; i<=this.size;i++)
		{
			System.out.print(heapArray[i]+" ");
		}
	}

	public void bubbleDown(Comparable[]theArray)
	{
		Comparable temp;
		Comparable smallerKid;
		int i=this.size;
		int k=1;
		//assign the last item value to the root
		//and set the last item to null
		theArray[k]=theArray[i];
		theArray[i]=null;
		
		while((2*k+1)<i)
		{
			//finding the smaller children of 2
			if(theArray[2*k+1].compareTo(theArray[2*k])<0)
			{
				smallerKid=theArray[2*k+1];
			}
			else
			{
				smallerKid=theArray[2*k];
			}
			if((theArray[k]).compareTo(smallerKid)>0)
			{
				if(smallerKid.equals(theArray[2*k+1]))
					{
					temp=theArray[k];
					theArray[k]=theArray[2*k+1];
					theArray[2*k+1]=temp;
					k=2*k+1;
					}
				else
				    {
					temp=theArray[k];
					theArray[k]=theArray[2*k];
					theArray[2*k]=temp;
					k=2*k;
					}
				
			}	
			else{
				break;
			}
		
		}	
		
	}
	@Override
	public Comparable deleteMin() {
		//always return the root element
		Comparable min=heapArray[1];
		
		bubbleDown(heapArray);
		size--;
		
		return min;
	}
	
	public void heapify(Comparable[]abc)
	{
		Comparable temp;
		int count=0;
		//System.out.print(size);
		for(int i=1;i<size+1;i++){
			//System.out.println(i);
			while(i/2!=0)
			{
				//if the last item(inserted item) is less than its parent
				//swap
				if((abc[i]).compareTo(abc[i/2])<0)
				{
					//System.out.println(i);
					temp=abc[i];
					abc[i]=abc[i/2];
					abc[i/2]=temp;
					
					i=i/2;
				}
				else{
					//System.out.println("there");
					break;
					
				}
			}
		}
		
	}
	public static void main(String[]args){

		MyHeap abc = new MyHeap (4);
		//demonstrate printHeap working
		//also inserting works
		//no child has less value than its parent	
		abc.insert(20);
		abc.insert(10);
		abc.insert(200);
		abc.insert(5);
		//overflowing two array
		abc.insert(13);
		abc.insert(21);
		abc.printHeap();
		System.out.println();
		System.out.println("remove the min, which is "+abc.deleteMin()+", the heap order now is: ");
		abc.printHeap();
		
		Integer randomArray[]={139,5,32,77,9,121,21};
		System.out.println(randomArray.length);
		MyHeap cdf= new MyHeap(randomArray);
		System.out.println("after heapifying the random array is:");
		cdf.printHeap();
		
	}

}
