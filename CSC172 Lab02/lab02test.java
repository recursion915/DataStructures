
public class lab02test {
	
	public static void main(String[]args)
	{
		MySingleLinkedList test= new MySingleLinkedList();
		test.insert("New York Strip");
		test.insert("Medium");
		test.insert(23.96);
		test.insert("paid by Visa");
		//insert a duplicate item
		test.insert(23.96);
		test.insert("Texas Roadhouse");
		
		System.out.println("the original list is:");
		test.printList();
		System.out.println();
		//deleting the first item works
		test.delete("Texas Roadhouse");
		System.out.println("deleting the first item:");
		test.printList();
		System.out.println();
		//deleting the middle item
		System.out.println("deleting the middle item:");
		test.delete("Medium");
		test.printList();
		System.out.println();
		
		//test on lookup
		System.out.println("there is Ted in the list: "+test.lookup("Ted "));
		System.out.println("there is 23.96 in the list: "+test.lookup(23.96));
	}

}
