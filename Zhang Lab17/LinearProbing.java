
import java.io.*;
import java.lang.reflect.Array;

public class LinearProbing {

	private String[]mHashTable;
	private int mCurrentSize;
	private int mDuplicateCount;
	
	public LinearProbing(int tableSize)
	{
		mHashTable=new String[tableSize];
		mCurrentSize=0;
		mDuplicateCount=0;
		makeEmpty();
	}
	
	//a hash function
	public static int hash(String key, int tableSize)
	{
		
		int hashVal=0;
		for(int i =0; i<key.length();i++)
		{
			hashVal=7*hashVal+key.charAt(i);
		}
		hashVal%=tableSize;
		if(hashVal<0)
			hashVal+=tableSize;
		
		return hashVal;
	}
	
	
	public void makeEmpty()
	{
		for(int i=0;i<mHashTable.length;i++)
		{
			mHashTable[i]=null;
		}
	}
	//
	public void insert(String item)
	{
		if(getLoadfactor()<0.5){
//			System.out.println(item+" hashcode is "+ hash(item,mHashTable.length)
//				+" and the current size is "+mCurrentSize);
			int index=hash(item,mHashTable.length);
			//check whether the item is duplicate first
			if(isDuplicate(item)==false)
			{
				//insert:between hashcode to end of list
				while(index<mHashTable.length)
				{
					//if the index is not occupied
					if(mHashTable[index]==null)
				   {
					mHashTable[index]=item;
					mCurrentSize++;	
//					System.out.println("insert index is "+index);
					return;//quit all
				   }
					
					//else it's occupied, go to the next
					index++;
				}
				//insert:index 0 to the hashcode
				index=0;
				while(index<mHashTable.length)
				{
					//if the index is not occupied
					if(mHashTable[index]==null)
				   {
					mHashTable[index]=item;
					mCurrentSize++;	
//					System.out.println("insert index is "+index);
					return;//quit the while loop
				   }
					//if it's occupied, go to the next
					index++;
				}
				
			}
			//if duplicate item
			else
			{
				mDuplicateCount++;
//				//do nothing
//				System.out.println("duplicating item detected at "+item);
			}
		}
		//load factor>0.5
		else{
			//get previously items in the hashTable
			String[]tempTable= new String[mHashTable.length];
			
			for(int i=0;i<mHashTable.length;i++)
			{
				tempTable[i]=mHashTable[i];
			}
			mHashTable=new String[mHashTable.length*2];
			for(int i=0;i<tempTable.length;i++)
			{
				mHashTable[i]=tempTable[i];
			}
			System.out.println("original size is "+tempTable.length+"now new size is "+mHashTable.length);
			
			int index=hash(item,mHashTable.length);
			//check whether the item is duplicate first
			if(isDuplicate(item)==false)
			{
				//insert:between hashcode to end of list
				while(index<mHashTable.length)
				{
					//if the index is not occupied
					if(mHashTable[index]==null)
				   {
					mHashTable[index]=item;
					mCurrentSize++;	
//					System.out.println("insert index is "+index);
					return;//quit all
				   }
					//else it's occupied, go to the next
					index++;
				}
				//insert:index 0 to the hashcode
				index=0;
				while(index<mHashTable.length)
				{
					//if the index is not occupied
					if(mHashTable[index]==null)
				   {
					mHashTable[index]=item;
					mCurrentSize++;	
//					System.out.println("insert index is "+index);
					return;//quit the while loop
				   }
					//if it's occupied, go to the next
					index++;
				}
				
			}
			//if duplicate item
			else
			{
				mDuplicateCount++;
//				//do nothing
//				System.out.println("duplicating item detected at "+item);
			}
			
		}
		
	}
	
	//method to check the item is duplicate
	public boolean isDuplicate(String item)
	{
		int index = hash(item, mHashTable.length);
		//check the second half the HashTable
		//if not the end of array;go inside the loop
		while(index<mHashTable.length)
		{
			//if the item equals to the HashTable item
			if(item.equals(mHashTable[index]))
			{
				return true;
			}
			//else check the next index
			index++;
		}
		//check the first half the HashTable
        index=0;
        while(index<hash(item,mHashTable.length))
        {
        	if(item.equals(mHashTable[index]))
			{
				return true;
			}
			index++;
        }
		return false;
	}
	
	//print methods
	public void printHashTable()
	{
		for(int i=0;i<mHashTable.length;i++)
		{
			if(mHashTable[i]!=null)
			{
//				System.out.println("Your size is "+mCurrentSize);
				System.out.println(mHashTable[i]);
			}
		}
		
	}
	//getter method for table size
	public Integer getCapacity()
	{
		return mHashTable.length;
	}
	//getter method for unique items
	public Integer getItemSize()
	{
		return mCurrentSize;
	}
	//getter method for loadfactor
	public Double getLoadfactor()
	{
		Double lf=(double) mCurrentSize/mHashTable.length;
		return lf;
	}
	//main method
	public static void main(String[]args) throws IOException
	{
		int wordcounts=0;
		File file=new File("paragraph.txt");
		BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line=null;
		LinearProbing abc= new LinearProbing(13);
		while((line=br.readLine())!=null)
		{
			 if(line.isEmpty())
			 {
//				 line=br.readLine();
			 }
			 else{
				 String [] tokens = line.split(" |\\, |\\; |\\. ");
			
				 for(int i=0;i<tokens.length;i++)
				 {
					 if(tokens[i].contains("."))
					 {
						 tokens[i]=tokens[i].substring(0, tokens[i].length()-1);
					 }
					abc.insert(tokens[i]);
					wordcounts++;
//					 System.out.println("the string is "+tokens[i]);
				 }
			 }
			 
		}
		abc.printHashTable();
		System.out.println("the unique words counts "+abc.getItemSize());
		System.out.println("the total number of words "+wordcounts);
		System.out.println("the duplicate counts "+abc.mDuplicateCount);
		System.out.println("the hashtable size is  "+abc.getCapacity());
	}

}
