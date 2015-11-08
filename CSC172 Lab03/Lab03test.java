
public class Lab03test {
	
	public static void main(String[]args)
	{
		MyDoublyLinkedList test = new MyDoublyLinkedList();
		test.insert(23.5);
		test.insert("A");
		test.insert("B");
		test.insert("kakashi");
		System.out.println("print in order: ");
		test.printList();
		System.out.println();
		System.out.println("print in reverse: ");
		test.printListRev();
		System.out.println("there is 23.5 in the list: "+test.lookup(23.5));
		System.out.println("there is C in the list: "+test.lookup("C"));
		//System.out.println("after deleting A is ");
		
		test.delete("kakashi");
		System.out.println("print after deleting first item: ");
		test.printList();
		test.delete("A");
		System.out.println("print after deleting first item and A: ");
		test.printList();
	}

}
