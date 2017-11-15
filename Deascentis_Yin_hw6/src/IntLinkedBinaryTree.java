
import java.util.*;

public class IntLinkedBinaryTree extends LinkedBinaryTree<Integer>{

	// define necessary instance variables and methods, including a constructor(s)
	
	/**
	 * Add a new node with e to the tree rooted at position p
	 * @param p The root of the tree to which new node is added
	 * @param e The element of the new node
	 * @return If a node with e does not exist, a new node with e is added and 
	 *   reference to the node is returned. If a node with e exists, null is returned.
	 */
	public Position<Integer> add(Position<Integer> p, Integer e){

	/* if p == null, then this is an empty tree create a new node with e 
	 * and make it the root of the tree return the root
	*/
		if(p == null) {
			return addRoot(e);
		}
		//create two x, y temperate position
		Position<Integer> x = p;
		Position<Integer> y = x;
		//loop through and add e into position until null
		while(x != null) {			
			if(x.getElement() == e) { //return null if it is the same 
				return null;
			} else if(x.getElement() > e) {
				y = x;
				x = left(x); //set x as left child of x
			}else {
				y = x;
				x = right(x); //set x as right child of x
			}
		}	
		//create tem temperate position
		Position<Integer> tem;
		
		if(y.getElement()>e) { 
			tem = addLeft(y, e); // add tem as left child of y with element e
		}else {
			tem = addRight(y, e); //add tem as right child of y with element e
		}
			
		return tem;
				
	}
	
	public static void main(String[] args) {
		
		// create a new binary tree instance
		IntLinkedBinaryTree t =   new IntLinkedBinaryTree();
		
		// add some integers
		 t.add(t.root, 100);
		 t.add(t.root, 50);
		 t.add(t.root, 150);
		 t.add(t.root, 70);
		// test with more integers 
		
		// print all integers in the tree in increasing order
		// after adding above four integers, the following should be printed
		// 50 70 100 150
		 Iterator<Position<Integer>> it = t.inorder().iterator(); 
		 while (it.hasNext()){
			 System.out.print(it.next().getElement() + " ");
		 }
		 System.out.println();
				
		// experimentally determine the average height of a binary search tree
		// clear the tree before beginning this experiment
		// repeat 100 times
		
		int maxIteration = 100;
		int numNodes = 1000;
		int totalHeight = 0;		
		int singleHeigh = 0;
		
		for (int i= 0; i<maxIteration; i++){
			
			// begin with an empty tree in each iteration
			t = new IntLinkedBinaryTree();
			// generate 1000 random integers in the range [0, 999999]
			Random r = new Random();
			r.setSeed(System.currentTimeMillis());
			// and add them to the tree, one at a time
			for (int j=0; j<numNodes; j++) {		
				
				int e = r.nextInt(1000000);
				// using the add method you implemented
				Position<Integer> temp = t.add(t.root, e); 
				// make sure the resulting tree has 1000 distinct integers
				while (temp == null) {
					e = r.nextInt(1000000);
					temp = t.add(t.root, e);					
				}					
			
			}					
			//Determine the height of the tree
			singleHeigh = t.height(t.root());
			
			// print the number of nodes and the the height of the tree 100 times	
			System.out.println("Print "+ i + " time: "+" Number of nodes: " + t.size() + "; Height of the tree "+ singleHeigh);
			//total height of 100 trees
			totalHeight +=	singleHeigh;
		}
		
		// calculate and display the average height of the 100 trees
		int averageHeight = totalHeight / maxIteration;
		System.out.println("\nThe average height of the 100 trees is " + averageHeight);
	
	}

}
