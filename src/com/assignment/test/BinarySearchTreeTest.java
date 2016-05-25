package com.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * BinarySearchTreeTest contains all unit test for the binary tree
 * @author Venkatasiva Lekkala
 *
 */
public class BinarySearchTreeTest {

	/**
	 * positive test cases for insert , isEmpty , makeEmpty , get methods 
	 */
	@Test
	public void insertTest() {
		BinarySearchTree tree = new BinarySearchTree();
		assertEquals(true,tree.isEmpty());
		
		String[] months = {"a","i","b","f","h","m"};
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		assertEquals("m",tree.get("m").getData());
		assertEquals(false,tree.isEmpty());
		
		tree.makeEmpty();
		assertEquals(true,tree.isEmpty());

	}

	/**
	 * Negative test cases for inset , isEmpty , makeEmpty , get methods
	 */
	@Test
	public void isEmpty_MakeEmpty_Test() {
		BinarySearchTree tree = new BinarySearchTree();
		assertFalse(false==tree.isEmpty());
		
		String[] months = {"aaa","iii","bbb","fff","hgh","mhhg"};
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		assertFalse("bbb"==tree.get("aaa").getData());
		assertFalse(true==tree.isEmpty());
		
		tree.makeEmpty();
		assertFalse(false==tree.isEmpty());

	}

	/**
	 * Positive test case for elementsAlphabeticOrder method
	 */
	@Test
	public void elementsAlphabeticOrderTestTrue() {
		String[] months = {"a","i","b","f","h","m"};
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		String result = " a b f h i m";
		assertEquals(result, tree.getElementsInOrder());
	}

	/**
	 * Negative test case for elementsAlphabeticOrder method 
	 */
	@Test
	public void elementsAlphabeticOrderTest() {
		String[] months = {"a","i","i","f","h","m"};
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		String result = " i a";
		assertFalse(tree.getElementsInOrder() == result);
	}

	/**
	 * Negative test case for elementsAlphabeticOrder method
	 */
	@Test  
	public void elementsAlphabeticOrderTestFalse() {
		String[] months = {"a","i","i","f","h","m"};
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		String result = " a b f h i m";
		assertFalse(tree.getElementsInOrder() == result);
	}


	/**
	 * Positive test case for vowelsReverseAlphabeticOrder method
	 */
	@Test 
	public void vowelsReverseAlphabeticOrderTest() {
		String[] months = {"karen","bob","tom","ellen","hg","mg"};
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		String result = " ellen";
		assertEquals(result,tree.getVowelsInReverseOrder());
	}

	/**
	 * Negative test case for vowelsReverseAlphabeticOrder method
	 */
	@Test 
	public void vowelsReverseAlphabeticOrderTestFalse() {
		String[] months = {"karen","bob","iom","ellen","hg","mg"};
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < months.length; i++) {
			tree.add(new BinarySearchTreeNode(months[i]));
		}
			
		String result = " ellen iom";
		assertFalse(tree.getVowelsInReverseOrder()== result);
	}
}