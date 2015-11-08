
public class BinarySearchTree <T extends Comparable<T>> implements BST<T>  {

	private MyTreeNode <T> root= new MyTreeNode<T>();
	
	//constructor
	public BinarySearchTree(){
		root.data=null;
		root.leftChild=null;
		root.rightChild=null;
		root.parent=null;
	}
	
	@Override
	public void insert(T x) {
		// TODO Auto-generated method stub
		if(root.lookup(x)==false)
		{	
			//recursively calling insert
			root.insert(x);
		}
		else
		{
			System.out.println("Sry, you cannot insert "+x+" twice!");
		}
		
	}
	@Override
	public void printPreOrder() {
		// TODO Auto-generated method stub
		root.printPreOrder();
		
		
	}

	@Override
	public void printInOrder() {
		// TODO Auto-generated method stub
		root.printInOrder();
		
	}

	@Override
	public void printPostOrder() {
		// TODO Auto-generated method stub
		root.printPostOrder();
	}

	@Override
	public boolean lookup(T x) {
		// TODO Auto-generated method stub
		
		return root.lookup(x);
	}
	@Override
	public void delete(T x) {
		if(lookup(x)==true)
		{
			root.delete(x);
		}
		else{
			System.out.println("No "+x+" such element in the tree; what do you want me to delete?");
			System.out.println();
		}
		
	}

	public static void main(String[]args){
		BinarySearchTree <Integer> abc= new BinarySearchTree<Integer>();
		abc.insert(10);
    	abc.insert(9);
    	abc.insert(13);
    	abc.insert(7);
    	abc.insert(8);
    	abc.insert(11);
    	abc.insert(17);
    	//duplicate inserting 17 is not allowed, an error message is printed
    	abc.insert(17);
    	abc.insert(16);
    	System.out.println("there is 10 in the tree "+abc.lookup(10));
    	System.out.println("there is 15 in the tree "+abc.lookup(15));
    	System.out.println("there is 17 in the tree "+abc.lookup(17));
      	System.out.println("there is 16 in the tree "+abc.lookup(16));
    	System.out.println("Preorder is: ");
    	abc.printPreOrder();
    	System.out.println();
    	System.out.println("Postorder is: ");
    	abc.printPostOrder();
    	System.out.println();
    	System.out.println("Inorder is: ");
    	abc.printInOrder();
    	System.out.println();
    	//deleting non-existent item
		//abc.delete(23);
		//deleting t16e leaf item
		//abc.delete(16);
	//	System.out.println("after deleting the leaf item in 16: ");
		//abc.printInOrder();
		//System.out.println();
		
		
    	//proof of deleting two children
		System.out.println("after deleting the two children item(13): ");
		abc.delete(13);
		abc.printInOrder();
		System.out.println();
		
    	//proof of deleting one item
    	System.out.println("after deleting the leaf item(8): ");
		//abc.delete(16);
		abc.delete(8);
		abc.printInOrder();
		System.out.println();
		//proof of deleting one child 
		System.out.println("after deleting the leaf item(7): ");
		//abc.delete(16);
		abc.delete(7);
		abc.printInOrder();
		System.out.println();
//		abc.delete(9);
//		abc.delete(17);
		//abc.delete(8);
//		abc.delete(13);
	
		//abc.printInOrder();
		
	}

}
