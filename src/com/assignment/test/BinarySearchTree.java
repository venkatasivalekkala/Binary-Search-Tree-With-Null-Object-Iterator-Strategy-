package com.assignment.test;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * The BinarySearchTree class
 * @author Venkatasiva Lekkala
 *
 */
public class BinarySearchTree extends AbstractCollection<BinarySearchTreeNode>{
	private BinarySearchTreeNode root; // hidden root node
	private SortStrategy sortStrategy;
	private String result ;
	
	public BinarySearchTree() {
		// Asc sort by default
		this.sortStrategy = new AscStrategy();
	}

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	/**
	 * To check root is empty or not
	 * @return true if node is empty, and false if it is not empty
	 */
	@Override
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Make tree empty
	 */
	public void makeEmpty() { 
		root = null;
	}

	/**
	 * insert: if new entry, insert in tree
	 * @param nodeData
	 */
	@Override
	public boolean add(BinarySearchTreeNode node) {
		// must handle case of empty tree first
		if (isEmpty()) { 
			root = node;
			return true;
		}
		
		// start search downward at root
		BinarySearchTreeNode current = root; 
		while (true) {
			// look left
			String nodeData = node.getData();
			if (sortStrategy.compare(node, current) < 0) {
				if (current.getLeft() != null) {
					current = current.getLeft();
				} else { 
					current.setLeft(node);
					return true; 
				}
			// look right
			} else if (sortStrategy.compare(node, current) > 0) {
				if (current.getRight() != null) {
					current = current.getRight();
				} else { 
					current.setRight(node);
					return true; 
				}
			// found! Don't insert
			} else {
				return false;
			}
		}
	}


	// 
	/**
	 * elementsAlphabeticOrder: need because root is hidden
	 * @return elements in alphabetic order
	 */
	public String getElementsInOrder() {
		result = "";
		sortEventInOrder(root);
		return result;
	}

	/**
	 * alphabeticOrder: recursive function to find tree elements
	 * @param element tree element
	 */
	private void sortEventInOrder(BinarySearchTreeNode element) {
		if (element != null) {
			sortEventInOrder(element.getLeft());
			result = result + " " + element.getData() ;
			sortEventInOrder(element.getRight());
		}
	}

	/**
	 * vowelsReverseAlphabeticOrder: need because root is hidden
	 * @return vowels in reverse alphabetic order
	 */
	public String getVowelsInReverseOrder() {
		result ="";
		sortVowelsInReverseOrder(root);
		return result;

	}

	/**
	 * Recursive through the Binary Search tree to find vowels
	 * @param element
	 */
	private void sortVowelsInReverseOrder(BinarySearchTreeNode element) {
		if (element != null) {
			sortVowelsInReverseOrder(element.getRight());
			switch(element.getData().toLowerCase().charAt(0)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				result += " "+ element.getData();
				break;
			default:
				// do nothing
			}
			sortVowelsInReverseOrder(element.getLeft());
		}
	}


	/**
	 * Find the given string if it is in tree
	 * @param nodeData
	 * @return the BinarySearchTreeNode that contains that data
	 */
	public BinarySearchTreeNode get(String nodeData) {
		// Must handle case of empty tree first
		if (root == null) { 
			return null;
		}
		BinarySearchTreeNode current = root; // start search downward at root
		BinarySearchTreeNode node = new BinarySearchTreeNode(nodeData);
		while (true) {
			//search left
			if (sortStrategy.compare(current, node) > 0) {
				if (current.getLeft() == null){
					return null;
				}
				current = current.getRight();
			// search right
			} else if (sortStrategy.compare(current, node) < 0) {	
				if (current.getRight() == null) {
					return null;
				}
				current = current.getRight();
			} else {
				//return the tree node
				return current; 
			}
		}
	}

	@Override
	public Iterator<BinarySearchTreeNode> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// In scope of the assignment, no need to implement this method
		return 0;
	}
	
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}