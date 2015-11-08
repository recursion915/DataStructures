
public class Lab07test {
	public static void main(String[]args)
	{
		MyQueue stupid=new MyQueue();
		stupid.enqueue("Look");
		stupid.enqueue("I'm coding");
		stupid.enqueue(3.1415926);
		System.out.println("Is queue empty? "+stupid.isEmpty());
		System.out.println("let's peek one: "+stupid.peek());
		System.out.println("Remove first one: "+stupid.dequeue());
		System.out.println("Remove again: "+stupid.dequeue());
		System.out.println("Remove again: "+stupid.dequeue());
		System.out.println("Remove again: "+stupid.dequeue());
	}
}
