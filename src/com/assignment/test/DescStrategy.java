package com.assignment.test;

/**
 * Sort object by descendant order
 * @author Venkatasiva Lekkala
 *
 */
public class DescStrategy implements SortStrategy {
	@Override
	public int compare(BinarySearchTreeNode node1, BinarySearchTreeNode node2) {
		String data1 = node1.getData();
		String data2 = node2.getData();
		return data2.compareTo(data1);
	}

}
