
public class Lab06Test {

	public static void main(String[]args)
	{
		MyStack stupid=new MyStack();
		stupid.push("Look");
		stupid.push("I'm coding");
		stupid.push(3.1415926);
		System.out.println("Is stack empty? "+stupid.isEmpty());
		System.out.println("let's peek a one "+stupid.peek());
		System.out.println("Remove first one: "+stupid.pop());
		System.out.println("Remove again: "+stupid.pop());
	}
}
