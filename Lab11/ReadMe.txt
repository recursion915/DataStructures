Name: Chen Zhang
Partner: Edward
Assignment: CSC172_lab11
Lab Session: Tu/Th 12:30-1:45 p.m
Lab TA: Ben Dantowitz/ Edward Yufei Du


Description:
In interface, just implements those simple methods.
In MyTreeNode, first define a data, leftChild, rightChild and a parent. And also a constructor method to set everything is null.
lookup() method: if data is null, return false. If x.compareTo(data)==0, return true.
Then recursively calling lookup method. Be sure to check whether it has left/right child before you calling recursively.
Insert() method: first make tempNode first. If there is no root, make the tempNode as root. Similar to lookup, if it reaches the leaf case, insert to the right if the x is larger than data. Otherwise insert the tempNode to the left. Don’t forget to wire the parent node back. Then recursively going to rightChild insert or leftChild insert.
delete() method: 4 cases
1) leaf case: if x> larger than parent data; set parent.rightChild=null. otherwise, set the parent.leftChild null.
2) only has rightChild: if x>larger than parent data; set.parent.rightChild=its own rightChild. In this case, we deleted the this.node. Vice versa.
3) only has leftChild: exactly same thing as 2). Just set.parent.rightChild to its own leftChild.
4) two children: first find the leftmost node of this.rightchild node. Then call delete method to delete the data. And set this to leftmost node.

printInOrder and printPreOrder and PrePostOrders are similar things.
Just print(data) between visiting left and right; ahead of visiting left and right; after visiting left and right respectively.



Files Hand in: MyTreeNode.java
	       BST.java
	       BinaryResearchTree.java
	       SampleOutput.txt
	       ReadMe.txt