/**
 * 
 */
package com.assignment.test;

/**
 * BinarySearchTreeMain class, where the java program will be started
 * @author VenkataSivaReddyLekkala
 *
 */
public class BinarySearchTreeMain {
	public static void main(String[] argv) {
		
		String[] months = {"a","i","b","f","h","m"};
		BinarySearchTree tree = new BinarySearchTree();
		
		try{
			// inserting elements into BinarySearch Tree.
			tree.setSortStrategy(new AscStrategy());
//			tree.setSortStrategy(new DescStrategy());
			for (int i = 0; i < months.length; i++) {
				tree.add(new BinarySearchTreeNode(months[i]));
			}
				
			//Print out the elements in the tree in alphabetic order. 
			String alphabeticOrder = tree.getElementsInOrder();
			System.out.println("BinarySearchTree Elements in Alphabetic Order = " + alphabeticOrder);
			System.out.println("\n------");
			
			//Print out the vowels in the BinarySearchTree in reverse alphabetic order.
			String vowelssReverse = tree.getVowelsInReverseOrder();
			System.out.println("Vowels in BinarySearchTreevowels in Reverse Order = "+vowelssReverse);
		}catch(Exception e){
			System.out.println("Excpetion "+e.getMessage());
		}
	}
}
