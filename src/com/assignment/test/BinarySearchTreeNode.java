package com.assignment.test;

/**
 * The Binary Search Tree Node
 * @author Venkatasiva Lekkala
 *
 */
public class BinarySearchTreeNode {
	private String data;  // data at each node
	private BinarySearchTreeNode left; // The left node
	private BinarySearchTreeNode right; // The right node
	
	/**
	 * BinarySearchTreeNode constructor with one param to construct leaf node
	 * @param nodeData The leaf node data
	 */
	public BinarySearchTreeNode(String nodeData) { 
		if(nodeData == null) {
			throw new NullPointerException(" BinarySearchTreeNode(String): The input param is null");
		}
		data = nodeData;
		left = null;
		right = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BinarySearchTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}

	public BinarySearchTreeNode getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}
}
