
public class MyTreeNode<T extends Comparable<T>> {
	
	public T data;
	public MyTreeNode<T> leftChild;
	public MyTreeNode<T> rightChild;
	public MyTreeNode<T> parent;
	public MyTreeNode()
	{
		leftChild=null;
		rightChild=null;
		parent=null;
	}
	
	public boolean lookup(T x) {
		if(data==null)
			return false;
		if(x.compareTo(data)==0)
			return true;
		if(x.compareTo(data)>0){
			if(rightChild==null)
				return false;
			return rightChild.lookup(x);
		}	
		if(x.compareTo(data)<0)
		{
			if(leftChild==null)
				return false;
			return leftChild.lookup(x);
		}		
		return false;
	}
	
	public void insert(T x){
		
		MyTreeNode<T> tempNode= new MyTreeNode<T>();
		tempNode.data=x;
		//when no root; makes the root
		if(this.data==null)
		{
			this.data=tempNode.data;
		}
		//leaf case
		if(leftChild==null&&rightChild==null){
				//x>node.data; insert in the right
			
				if(x.compareTo(data)>0)
				{
			    	//System.out.println("insert at right");
					rightChild=tempNode;
					tempNode.parent=this;
				}
				//if x<=node data, insert in the left
				if(x.compareTo(data)<0)
				{
					//System.out.println("insert at left");
					tempNode.parent=this;
					leftChild=tempNode;
					
				}
				
		}
		//recursively method going to the right
		if(x.compareTo(data)>0)
		{		
			//System.out.println("right");
			//dont forget to check whether the rightChild is null before calling recursively
			if(rightChild==null)
			{
				//System.out.println("insert at right");
				rightChild=tempNode;
				tempNode.parent=this;
			}
			else{
			rightChild.insert(x);}
		}
		//same thing 
		if(x.compareTo(data)<0)
		{
			//System.out.println("go to left");
			if(leftChild==null)
			{
				//System.out.println("insert at left");
				leftChild=tempNode;
				tempNode.parent=this;
			}
			else{
			leftChild.insert(x);}
		}
	}
	public void delete(T x){
		MyTreeNode <T> tempNode=new MyTreeNode<>();
		if(x.compareTo(data)==0)
		{
			
			//case No.1:leaf case: 
			if(leftChild==null&&rightChild==null)
			{
				if(x.compareTo(this.parent.data)>0)
				{
					this.parent.rightChild=null;
				}
				this.parent.leftChild=null;
				//System.out.println(this.parent.data);
				
			}
			//case No.2: has only one rightChild
			else if(leftChild==null&&rightChild!=null)
			{
				if(this.data.compareTo(this.parent.data)>0)
				{
					this.parent.rightChild=this.rightChild;
				}
				else
					this.parent.leftChild=this.rightChild;
			}
			//case No.3: has only one leftChild
			else if(leftChild!=null&&rightChild==null)
			{
				if(this.data.compareTo(this.parent.data)>0)
				{
					this.parent.rightChild=this.leftChild;
				}
				else
					this.parent.leftChild=this.leftChild;
			}
			
			//has two children
			else 
			{
				//finding the leftmost child of subtree at this.node
				MyTreeNode <T> lmNode=new MyTreeNode<>();
				lmNode=this.rightChild;
		//		System.out.println(lmNode.data);
				while(lmNode.leftChild!=null)
				{
					//System.out.println("find");
					lmNode=lmNode.leftChild;
				}
			
//				System.out.println(this.data);
				delete(lmNode.data);
				
				this.data=lmNode.data;
				
			}
		}
		else if(x.compareTo(data)>0){//System.out.println("right");
			rightChild.delete(x);}
		else if(x.compareTo(data)<0){//System.out.println("left");
			leftChild.delete(x);}
		
	}
	
	public void printPreOrder() {
		System.out.print(data+" ");
		if(leftChild!=null){
			leftChild.printPreOrder();
			}
		if(rightChild!=null){
			rightChild.printPreOrder();
		}
		
	}
	public void printPostOrder(){
		if(leftChild!=null){
			leftChild.printPostOrder();
			}
		
		if(rightChild!=null){
			rightChild.printPostOrder();
		}
		System.out.print(data+" ");
	}
	public void printInOrder(){
		if(leftChild!=null){
			leftChild.printInOrder();
			}
		System.out.print(data+" ");
		if(rightChild!=null){
			rightChild.printInOrder();
		}
		
	}
}
